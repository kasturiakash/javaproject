package AshotImage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureImage {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://99designs.com/profiles/terrybogard/designs/2110833");
		WebElement logoimage=driver.findElement(By.xpath("//*[@id=\"design-details-annotations-anchor\"]/div/div/div/div/div[1]/div/div[2]/div/div/div/div/img"));
		Screenshot logoimagescreenshot=new AShot().takeScreenshot(driver, logoimage);
		ImageIO.write(logoimagescreenshot.getImage(), "png", new File("C://Users/kastu/OneDrive/Pictures/ashot/myimage.png"));
		File f=new File("C://Users/kastu/OneDrive/Pictures/ashot/myimage.png");
		if(f.exists())
		{
			System.out.println("image captured");
		}
		else
		{
			System.out.println("image not captured");

		}
		
		
	}

}
