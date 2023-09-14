package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassRightClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform(); //right click on the element
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		System.out.println(driver.switchTo().alert().getText()); //capture text from alert
		driver.switchTo().alert().accept();
		

	}

}
