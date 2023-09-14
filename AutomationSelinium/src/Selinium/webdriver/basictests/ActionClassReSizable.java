package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassReSizable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(resizable).dragAndDropBy(resizable, 50, 50).build().perform();
		Thread.sleep(3000);
	
		
	}
		

}
