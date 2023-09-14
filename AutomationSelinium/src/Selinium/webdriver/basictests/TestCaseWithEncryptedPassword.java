package Selinium.webdriver.basictests;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize(); //for maximising screen
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("akashtraining@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("dGVzdDEyMw=="));
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

		
		
	}
	
	static String decodeString(String password)
	{
		byte[] decodedString=Base64.decodeBase64(password);
		return(new String(decodedString));

	}

}
