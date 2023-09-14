package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSlider {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe")));
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act=new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider, 500, 0).build().perform(); //drag the slider
		

	}

}
