package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all checkboxes
		List<WebElement> check1 = driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
		
		/* for(int i =0;i<check1.size();i++)
		 {
			 check1.get(i).click();
		 }
		*/
		
		
		
		//last three checkbox
		/*for(int i =4;i<check1.size();i++)
		{
			check1.get(i).click();
		}
		*/
		
		for(int i =0;i<3;i++)
		{
			check1.get(i).click();
		}
		
		for(WebElement checkbox : check1)
		{
			if(checkbox.isSelected())
			{
			checkbox.click();
		   }
		}
		

	}

}
