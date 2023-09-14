package Selinium.webdriver.basictests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize(); //for maximising screen
		driver.get("https://www.flipkart.com/");
		
		Set <Cookie> cookies=driver.manage().getCookies();  //capture all the cookies from the browser
		System.out.println("size of cookies: "+cookies.size()); //print size of cookies
		for(Cookie cookie:cookies)  //read and print all the cookies
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		System.out.println();

		System.out.println(driver.manage().getCookieNamed("Network-Type")); //print specific cookie according to the name
		
		//add new cookie to the browser
		
		Cookie cobj=new Cookie("Mycookie123","12345");
		driver.manage().addCookie(cobj);
		cookies=driver.manage().getCookies(); //dont ignore this line
		System.out.println("size of cookies: "+cookies.size()); //print size of cookies
		for(Cookie cookie:cookies)  //read and print all the cookies
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
		//delete the cookie
		driver.manage().deleteCookie(cobj);
		cookies=driver.manage().getCookies(); //dont ignore this line
		System.out.println("size of cookies: "+cookies.size()); //print size of cookies
		for(Cookie cookie:cookies)  //read and print all the cookies
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}

		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies(); //dont ignore this line
		System.out.println("size of cookies: "+cookies.size()); //print size of cookies


		
		
	}

}
