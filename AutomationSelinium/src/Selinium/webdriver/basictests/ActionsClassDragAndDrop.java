package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.id("box1"));
		WebElement target=driver.findElement(By.id("box103"));
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		//act.dragAndDrop(source, target).build().perform();
		
		

	}

}
