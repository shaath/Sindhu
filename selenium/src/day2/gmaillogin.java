package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl());
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
		
//		email.clear();
		
//		Sleeper.sleepTightInSeconds(5);
		
//		email.click();
		
		driver.findElement(By.name("signIn")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("Passwd")).sendKeys("123456789");
		
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		

	}

}
