package Selinium.webdriver.basictests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingBrowserWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		System.out.println(driver.getTitle());
		Set <String> s=driver.getWindowHandles();
		//for switching to particular window
		/*
		for(String i:s)
		{
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		*/
		//for closing specific window
		for(String i:s)
		{
			
			String t=driver.switchTo().window(i).getTitle();
			if(t.contains("Selenium"))
			{
				driver.close();
			}
		}
		
	}

}
