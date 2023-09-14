package Selinium.webdriver.basictests;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {
	static HashMap <String,String> logindata()
	{
		HashMap <String,String> hm=new HashMap <String,String>();
		hm.put("x", "CBItesting@gmail.com&Cbi@1234");
		hm.put("y", "FBItesting@gmail.com&Fbi@1234");
		
		return hm;
	}

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //for maximising screen
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		
		//login as x
		String credentials=logindata().get("x");
		String arr[]=credentials.split("&"); //CBItesting@gmail.com  Cbi@1234
		System.out.println(arr[1]);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arr[0]);
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();

		
		
		
		

	}

}
