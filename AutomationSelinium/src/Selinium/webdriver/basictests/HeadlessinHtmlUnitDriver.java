package Selinium.webdriver.basictests;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessinHtmlUnitDriver
{

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());


	}

}
