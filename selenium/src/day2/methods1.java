package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class methods1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		//getting the title 
		
//		System.out.println(driver.getTitle());
		
		//finding the url 
		
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());

	}

}
