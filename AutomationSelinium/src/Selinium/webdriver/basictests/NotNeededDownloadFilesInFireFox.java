package Selinium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class NotNeededDownloadFilesInFireFox {

	public static void main(String[] args) {
		// Not needed  because without creating profile it doesnt show download confirmation so writing for only understanding
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		//create firefox profile object
		FirefoxProfile profile=new FirefoxProfile();
		
		//set preference to not show file download confirmation dialogue using
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); //text plain is MIME tye depending on which file like pdf or text mime value changes in google you will see diff types of mime valus
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		//initialize firefox driver
		FirefoxDriver driver=new FirefoxDriver(option);
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
