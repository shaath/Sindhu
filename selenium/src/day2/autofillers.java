package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class autofillers {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.id("txtSource")).sendKeys("H");
		
		List<WebElement> auto=driver.findElements(By.xpath("//*[@id='Search']/div[1]/div[1]/ul/li"));
		
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++)
		{
//			System.out.println(auto.get(i).getText());
			String city=auto.get(i).getText();
			if (city.equalsIgnoreCase("Hyderabad"))
			{
				auto.get(i).click();
				break;
			}
			
		}

	}

}
