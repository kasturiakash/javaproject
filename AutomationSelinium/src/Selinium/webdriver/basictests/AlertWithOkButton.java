package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//alert box with ok button example
		//alert with ok link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//alert with ok button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		//switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //ok button clicked and close the alert


	}

}
