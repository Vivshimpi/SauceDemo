package com.saucedemo.Testpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchExcel 
{
public static void main(String[] args) throws IOException 
{
	String address = "E:\\ProjectSnap\\Book1.xlsx";
	
	FileInputStream file = new FileInputStream(address);
    
	@SuppressWarnings("resource")
	XSSFWorkbook book = new XSSFWorkbook(file);
//	XSSFSheet sheet = book.getSheet("Sheet1");
	
//	user name
//	XSSFRow row = sheet.getRow(0);
//	XSSFCell cell = row.getCell(0);
//	String usernameInfo = cell.getStringCellValue();
//	System.out.println(usernameInfo);
//	
//	Password
//	XSSFRow row1 = sheet.getRow(1);
//	XSSFCell cell1 = row1.getCell(0);
//	String passInfo = cell1.getStringCellValue();
//	System.out.println(passInfo);
	
	 String userinfo = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(userinfo);
	
	 String passinfo = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	 System.out.println(passinfo);
	
}
}
