import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFilesInsSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div/div[1]/div[4]/div[1]/div")).click();
		Screen s=new Screen();
		Pattern fileInputTextbox=new Pattern("C:\\seleniumpractice\\Fruites\\FileTextBox.PNG");
		Pattern openButton=new Pattern("C:\\seleniumpractice\\Fruites\\OpenButton.PNG");
		Thread.sleep(5000);
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,"C:\\Users\\kastu\\OneDrive\\Desktop\\shimakh tech\\loginassi.xlsx");
		s.click(openButton);

	}

}
   