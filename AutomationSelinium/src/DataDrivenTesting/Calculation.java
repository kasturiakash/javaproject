package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.xssf.usermodel.*;


public class Calculation {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C://Users//kastu//eclipse-workspace//AutomationSelinium//Drivers//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		FileInputStream file=new FileInputStream("C://Users//kastu//OneDrive//Desktop//shimakh tech//simpleinterset.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file); 
		XSSFSheet sheet=workbook.getSheet("Sheet1"); 
		int rowcount=sheet.getLastRowNum(); 
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int princ=(int)row.getCell(0).getNumericCellValue();
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			XSSFCell Frequency=row.getCell(3);
			String Freq=Frequency.getStringCellValue();
			XSSFCell MaturityValue=row.getCell(4);
			int Exp_mvalue=(int)MaturityValue.getNumericCellValue();
			driver.findElement(By.name("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.name("interest")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.name("tenure")).sendKeys(String.valueOf(per));
			Select periodcombo=new Select(driver.findElement(By.name("tenurePeriod")));
			periodcombo.selectByVisibleText("year(s)");
			System.out.println(periodcombo.getOptions().size()); //print the no of options present in dropdown box
			Select frequency=new Select(driver.findElement(By.name("frequency")));
			frequency.selectByVisibleText(Freq);
			System.out.println(frequency.getOptions().size());
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			String actual_mvalue= driver.findElement((By.xpath("//*[@id=\"resp_matval\"]/strong"))).getText();
			
			if(Double.parseDouble(actual_mvalue)==Exp_mvalue)
			{
				System.out.println("test is passed");
			}
			else
			{
				System.out.println("testfailed");
			}
			//driver.findElement(By.name("principal")).clear();
			//driver.findElement(By.name("interest")).clear();
			//driver.findElement(By.name("tenure")).clear();
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
			
			
			
			
			
			
		}

	}

}
