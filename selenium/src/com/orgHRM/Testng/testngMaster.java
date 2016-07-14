package com.orgHRM.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testngMaster 
{
	public WebDriver driver;
	public static String url="http://opensource.demo.orangehrm.com";
	public static String expval,actval;
	public static String u="Admin",p="admin";
	public static String f="Sharath",l="Chandra";
	public static String ename=f+" "+l,uname="sharath1234",pwd="Sindhu123456",cpwd="Sindhu123456";
	
	@BeforeSuite
	public void org_Launch()
	{
		expval="LOGIN";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
		
	}
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	@AfterTest
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	
	

}