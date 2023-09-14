package Selinium.webdriver.basictests;

import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:/Drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable/");
	}

}
