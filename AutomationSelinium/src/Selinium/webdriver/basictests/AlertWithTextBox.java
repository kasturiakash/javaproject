package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithTextBox {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); 
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		driver.switchTo().alert().sendKeys("akash");
		driver.switchTo().alert().accept();
		String ExpString="Hello akash How are you today";
		String ActString=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(ExpString.equals(ActString)==true)
		{
			System.out.println("test is passed");
		}
	}

}
