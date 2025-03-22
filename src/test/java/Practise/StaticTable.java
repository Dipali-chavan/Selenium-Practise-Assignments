package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class StaticTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		System.out.println(rows);
		
		//find total no of rows
		
		//int rows1 = driver.findElements(By.tagName("tr")).size();
		//System.out.println("rows"+rows1);
		
		//find total no of columns
		 int col= driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
		 System.out.println(col);
		 
		 //String book = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[1]")).getText();
		 //System.out.println(book);
		 
		 for(int r =2;r<=rows;r++)
		 {
			 for(int c =1;c<=col;c++)
			 {
				 String value = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.println(value+"\t");
			 }
			 System.out.println();
		 }
		 
		 
		

	}

}
