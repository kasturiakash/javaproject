package Selinium.webdriver.basictests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownListSortedOrNot {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select se=new Select(element);
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		List <WebElement>options=se.getOptions();
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());

		}
		//		List tempList=new ArrayList();
		// tempList=originalList

		System.out.println("before sorting original list"+originalList);
		System.out.println("before sorting temporary list"+tempList);
		Collections.sort(tempList);
		
		System.out.println("after sorting original list"+originalList);
		System.out.println("after sorting temporary list"+tempList);
		
		if(originalList==tempList)
		{
			System.out.println("dropdowns sorted");
		}
		else
		{
			System.out.println("dropdown not sorted");
		}
		


		

	}

}
