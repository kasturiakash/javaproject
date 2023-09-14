package Selinium.webdriver.basictests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessInFirefox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		FirefoxDriver driver=new FirefoxDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());


	}

}
