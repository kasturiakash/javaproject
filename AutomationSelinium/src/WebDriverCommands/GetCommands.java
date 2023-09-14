package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args)
	{
		
			System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
			
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://demo.actitime.com/login.do"); //opens url
			System.out.println(driver.getTitle()); //returns title of the page
			System.out.println(driver.getCurrentUrl()); //returns URL of the page
			String text=driver.findElement(By.xpath("//*[@id=\"headerContainer\"]")).getText();
			System.out.println(text);
			driver.close();  //close currnt window
			//driver.quit(); //cloae all opened windows
			

	}

}
