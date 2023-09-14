package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationWindowPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//pass url like this first username admin and password admin
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		System.out.println(text);


	}

}
