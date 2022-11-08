package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility{
	public int getIntExcelData(String sheetName , int rowNum , int celNum) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		int data=(int)row.getCell(celNum).getNumericCellValue();
		return data;	
	}
	

public String getExcelData(String sheetName , int rowNum , int celNum) throws Throwable 
{
	FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowNum);
	String data = row.getCell(celNum).getStringCellValue();
	return data;	
}
}


