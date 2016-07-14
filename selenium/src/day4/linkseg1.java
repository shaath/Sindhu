package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		
//		driver.findElement(By.linkText("Home")).click();
		List<WebElement> links=driver.findElements(By.linkText("Home"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String href=links.get(i).getAttribute("href");
			System.out.println(href);
			
			if (href.equalsIgnoreCase("http://192.168.1.100/primusbank1/home.aspx"))
			{
				links.get(i).click();
				System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
				break;
			}
			
		}
		

	}

}
