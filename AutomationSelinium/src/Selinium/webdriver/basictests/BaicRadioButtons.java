package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaicRadioButtons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected());
		if(driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected()==false)
		{
			driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		}

	}

}
