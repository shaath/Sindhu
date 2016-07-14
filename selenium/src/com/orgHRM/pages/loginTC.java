package com.orgHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTC 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		
		//launch
		driver.get(lp.url);
		//login
		lp.login(lp.u, lp.p);
		//logout
		adminpage ap=PageFactory.initElements(driver, adminpage.class);
		ap.welcomeclick();
		ap.logoutclick();
		//close
		
		driver.close();
	}

}
