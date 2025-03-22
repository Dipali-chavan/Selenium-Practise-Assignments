package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> element = driver.findElements(By.xpath("//ul[@role = 'listbox']//li//div[@role='option']"));
		System.out.println(element.size());
		 
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
			if(element.get(i).getText().equals("selenium"))
			{
				element.get(i).click();
				break;
			}
		}
		

	}

}
