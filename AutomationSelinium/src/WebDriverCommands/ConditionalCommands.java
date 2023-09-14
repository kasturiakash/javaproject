package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/?_rdr");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		if(email.isDisplayed()&& email.isEnabled())
		{
			email.sendKeys("akash@gmail.com");
		}
		if(pass.isDisplayed()&& pass.isEnabled())
		{
			pass.sendKeys("akash@gmail.com");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();

		
		


	}

}
