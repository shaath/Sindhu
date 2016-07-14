package day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiwindows {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		Iterator<String> it=windowids.iterator();
		
		while (it.hasNext()) 
		{
			String window=it.next();
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			
			
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle());
			}
			catch (Exception e) 
			{
				System.out.println("Terms of service link not available in this page");
			}
		}

	}

}
