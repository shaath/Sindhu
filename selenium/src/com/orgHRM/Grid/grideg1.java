package com.orgHRM.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class grideg1 
{
	@Test
	public void grid1() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		
//		cap=DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
//		cap=DesiredCapabilities.chrome();
//		cap.setBrowserName("chrome");
//		cap.setPlatform(Platform.WINDOWS);
		
		cap=DesiredCapabilities.internetExplorer();
		cap.setBrowserName("internet explorer");
		cap.setPlatform(Platform.ANY);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.9:4444/wd/hub"), cap);
		driver.get("https://www.irctc.co.in");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alt=driver.switchTo().alert();
		
		
		System.out.println(alt.getText());
		
		Sleeper.sleepTightInSeconds(5);
		alt.accept();
	}

}
