package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropeg1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://khuranatravel.com");
		Sleeper.sleepTightInSeconds(5);
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		
		Select s=new Select(fdrop);
		List<WebElement> flist=s.getOptions();
		
		System.out.println(flist.size());
		
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		
		for (int i = 0; i < flist.size(); i++) 
		{
			s.selectByIndex(i);
			String ftext=flist.get(i).getText();
			System.out.println(ftext);
			
			List<WebElement> tlist=t.getOptions();
			
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				String ttext=tlist.get(i).getText();
				
				if (ttext.equalsIgnoreCase(ftext))
				{
					System.out.println("From city available in the tocity dropdown");
					
				}
				
			}
			
		}
		
		
		
		

	}

}
