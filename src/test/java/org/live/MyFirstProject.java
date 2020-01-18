package org.live;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class MyFirstProject {

	public static String getLoginDetails(int rowNum, int cellNum) throws IOException 	{
	
		String v = null;
	FileInputStream loc = new FileInputStream("C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\LogninDetails\\ExcelDatas\\Logincredentials.xlsx");	

	Workbook w = new XSSFWorkbook(loc);

	Sheet s = w.getSheet("Login");
	
	Row r = s.getRow(rowNum);
	
	Cell c = r.getCell(cellNum);
	
	int type = c.getCellType();
	
	if(type == 1)
	{
		
		v= c.getStringCellValue();
	}
	
	else if(type == 0)
	{
		if(DateUtil.isCellDateFormatted(c))
		{
			Date dateValue = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
			v = sim.format(dateValue);
		}
		
		else
		{
			double dle = c.getNumericCellValue();
			long l = (long) dle;
			v = String.valueOf(l);
		}
	}
		
	
	
		return v;
	}


	
	public static void selectByValue(WebElement e, int index) {
		
		Select s= new Select(e);
		s.selectByIndex(index);

	}
	
}
