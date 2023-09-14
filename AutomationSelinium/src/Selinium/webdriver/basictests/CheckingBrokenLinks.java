package Selinium.webdriver.basictests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckingBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		//Maximise page
		driver.manage().window().maximize();
		//implicit wait for 10s
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url of page
		driver.get("http://www.deadlinkcity.com/");
		//wait
		Thread.sleep(5000);
		//capture links from a webpage
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//Number of links
		System.out.println(links.size());
		
		for(int i=0;i< links.size();i++)
		{
			//by using href attribute we can get url of required link
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			//create a connection using url object 'link'
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			//waittime 2seconds
			Thread.sleep(2000);
			//establish connection
			httpconn.connect();
			int rescode=httpconn.getResponseCode(); //return response code if res code is above 400 then it is a broken link
			if(rescode>=400) {
				System.out.println(url+" - "+" is a broken link");
				
			}
			else
			{
				System.out.println(url+" - "+" is valid link");
			}
			
		}
		
		
		

	}

}
