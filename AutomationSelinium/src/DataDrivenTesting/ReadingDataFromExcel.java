package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C://Users//kastu//OneDrive//Desktop//shimakh tech//Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file); 
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0); //providing sheet name
		int rowcount=sheet.getLastRowNum(); //returns the row count
		int colcount=sheet.getRow(0).getLastCellNum(); //returns column count
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i); //FOCUSSED ON CURRENT ROW
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString(); //read value from a cell
				System.out.print(" "+value);
		}
		System.out.println();

	}

}

}