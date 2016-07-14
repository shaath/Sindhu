package com.orgHRM.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHRM.Master.orgMaster;

public class hybrid 
{
	@Test
	public void driver() throws IOException
	{
		orgMaster om=new orgMaster();
		String res=null;
		String xlpath="F:\\Afternoon@3Pm\\selenium\\src\\com\\orgHRM\\Testdata\\Hybrid.xlsx";
		String xlout="F:\\Afternoon@3Pm\\selenium\\src\\com\\orgHRM\\Results\\Hybridout.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("empreg");
		int tcRC=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int empRc=ws2.getLastRowNum();
		
		for (int i = 1; i <= tcRC; i++) 
		{
			String exec=ws.getRow(i).getCell(2).getStringCellValue();
			if (exec.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tstcId.equalsIgnoreCase(tcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							
							res=om.org_Launch("http://opensource.demo.orangehrm.com");
							break;
							
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
							
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
							
						case "Empreg":	
							for (int k = 1; k <= empRc; k++) 
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);		
							}
							
							break;
							
						case "Usereg":
							res=om.org_Userreg("sharath chandra", "sharathchandra123", "sharathchandra123", "sharathchandra123");
							break;
						case "Ulogin":
							res=om.org_Login("Sindhu1234", "Sindhu1234");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).createCell(3).setCellValue(res);
							
						}
						else
						{
							ws.getRow(i).createCell(3).setCellValue("Fail");
						}
					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}
}
