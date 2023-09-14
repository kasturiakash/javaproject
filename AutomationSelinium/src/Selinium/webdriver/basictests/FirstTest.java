package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div ")).click();
		
		String exptitle="actiTIME -  Enter Time-Track";
		String acttitle=driver.getTitle();
		//validation
		if(exptitle.equals(acttitle))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is passed");
			
		}
		
		
		

	}

}
