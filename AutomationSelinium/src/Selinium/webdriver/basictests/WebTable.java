package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		int r=driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr")).size();
		System.out.println(r);
		int c=driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr/th")).size();
		System.out.println(c);
		for(int i=2;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(" "+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				
			}
			System.out.println();
		}


	}

}
