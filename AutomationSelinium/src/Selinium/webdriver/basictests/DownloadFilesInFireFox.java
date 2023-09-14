package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFilesInFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize(); //for maximising screen
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("test");
		driver.findElement(By.id("createTxt")).click(); //generate text file
		driver.findElement(By.id("link-to-download")).click(); //display download and click
		driver.findElement(By.id("pdfbox")).sendKeys("testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
	}

}
