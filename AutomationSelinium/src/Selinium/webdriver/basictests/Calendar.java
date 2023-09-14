package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		/*for(int i=5;i>=1;i++)
		{
			driver.findElement(By.xpath("/html/body/div[5]/div/a[2]/span")).click();
			String m=driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
			if(m.equals("November"))
			{
				driver.findElement(By.linkText("25")).click();
				break;
			}
			
		}*/
		for(int i=8;i>=1;i++)
		{
			driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
			String m=driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
			if(m.equals("April"))
			{
				driver.findElement(By.linkText("25")).click();
				break;
			}
			
		}

	}

}
