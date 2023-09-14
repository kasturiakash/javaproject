package Selinium.webdriver.basictests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//initialize firefox driver
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize(); //for maximising screen
		driver.get("https://www.youtube.com/");
		
		Robot robot=new Robot();
		// down arrow in keyboard
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		//tab in keyboard
		
		for(int i=0;i<=5;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(3000);
			
		}



		
		//ENTER IN KEYBOARD
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		


		
		
		
		/*driver.findElement(By.id("textbox")).sendKeys("test");
		driver.findElement(By.id("createTxt")).click(); //generate text file
		driver.findElement(By.id("link-to-download")).click(); //display download and click
		driver.findElement(By.id("pdfbox")).sendKeys("testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click(); */

	}

}
