package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		if (driver.findElement(By.id("PersistentCookie")).isSelected())
		{
			driver.findElement(By.id("PersistentCookie")).click();
			
		}
		else
		{
			System.out.println("It is already in unchecked position");
		}

	}

}
