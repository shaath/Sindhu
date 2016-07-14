package com.orgHRM.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orgHRM.Master.orgMaster;

public class empregTest {

	public static void main(String[] args) throws IOException 
	{
		String xlpath="F:\\Afternoon@3Pm\\selenium\\src\\com\\orgHRM\\Testdata\\TestData.xlsx";
		String xlout="F:\\Afternoon@3Pm\\selenium\\src\\com\\orgHRM\\Results\\Empres.xlsx";
		
		orgMaster om=new orgMaster();
		
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		
		om.org_Launch("http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"-----"+l);
			String res=om.org_Empreg(f, l);
			c2.setCellValue(res);
			
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
		

	}

}
