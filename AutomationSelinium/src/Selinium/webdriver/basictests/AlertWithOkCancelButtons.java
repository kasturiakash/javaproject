package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkCancelButtons {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//alert box with ok button example
		//alert with ok cancel button link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		//alert with ok cancel button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		String ExpTextOk="You pressed Ok";
		driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpTextOk.equals(ActText)==true)
		{
			System.out.println("test is passed");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpTextCancel.equals(ActText)==true)
		{
			System.out.println("test is passed");
		}




	}

}
