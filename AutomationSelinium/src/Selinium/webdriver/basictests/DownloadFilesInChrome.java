package Selinium.webdriver.basictests;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFilesInChrome {

	public static void main(String[] args) {
		
		//download files in required location using chrome
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.prompt_for_download", "false");
		chromePrefs.put("download.default_directory", "C:\\downloadfiles");  //configure path
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		/*DesiredCapabilities cap=DesiredCapabilities.chrom();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);*/
		
		
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		//driver.manage().window().maximize(); //for maximising screen
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("test");
		driver.findElement(By.id("createTxt")).click(); //generate text file
		if(isFileExist("C://Users/kastu/OneDrive/Pictures/Camera Roll/myphoto.jpg"))
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
		
		driver.findElement(By.id("link-to-download")).click(); //display download and click
		driver.findElement(By.id("pdfbox")).sendKeys("testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		
	}
	
	static boolean isFileExist(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}

}
