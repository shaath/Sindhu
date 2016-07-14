package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			
			String lText=links.get(i).getText();
			
			if (!lText.equals("")) 
			{
				System.out.println(links.get(i).getText());
				count++;
			}
		}
		
		System.out.println("The visible links count "+count);
		System.out.println("The Invisible links count "+((links.size()-count)));
		

	}

}
