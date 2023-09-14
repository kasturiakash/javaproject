package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMouseOver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//mouseover operation action classes are mouse operations
		Actions act=new Actions(driver);
		WebElement Interactions=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		WebElement DragAndDrop=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]"));
		WebElement Static=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
		act.moveToElement(Interactions).moveToElement(DragAndDrop).moveToElement(Static).click().build().perform();
		

	}

}
