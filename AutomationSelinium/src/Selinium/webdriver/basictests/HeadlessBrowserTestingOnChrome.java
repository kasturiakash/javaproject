package Selinium.webdriver.basictests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTestingOnChrome 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());


	}

}

