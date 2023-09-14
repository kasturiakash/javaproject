package WebDriverCommands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle()); //returns title of the page
		driver.navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle()); //returns title of the page
		driver.navigate().back();
		System.out.println(driver.getTitle()); //returns title of the page
		driver.navigate().forward();
		System.out.println(driver.getTitle()); //returns title of the page
		driver.quit();




	}

}
