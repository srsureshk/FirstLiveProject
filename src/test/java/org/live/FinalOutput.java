package org.live;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FinalOutput {
	
public static void FinalOutputExcel(String itemName, String itemPrice) throws IOException {
	
	FileOutputStream loc = new FileOutputStream("C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\LogninDetails\\ExcelDatas\\Finaloutput.xlsx");
	Workbook w = new XSSFWorkbook();
	
	Sheet s = w.createSheet("Details");
	
	Row r = s.createRow(0);
	
	Cell c = r.createCell(0);
	
	c.setCellValue("Item Name");
	
	Cell c1 = r.createCell(1);
	
	c1.setCellValue("Price");
	
	Row r1 = s.createRow(1);
	
	Cell c2 = r1.createCell(0);
	c2.setCellValue(itemName);
	
	Cell c3 = r1.createCell(1);
	c3.setCellValue(itemPrice);
	
	w.write(loc);
	
}
	
}
