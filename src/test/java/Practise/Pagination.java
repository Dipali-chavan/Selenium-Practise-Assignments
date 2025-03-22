package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		for(int i =1 ;i<=4;i++)
		{
		    driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+i+"]")).click();
			
			
			for(int j = 1;j<=5;j++)
			{
				for(int k=1 ;k<=4;k++)
				{
					String s1 = driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td["+k+"]")).getText();
					System.out.println(s1);
				}
			}
		
		}

	}

}
