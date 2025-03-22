package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DatePick {
	
	
	static void selectMonthYear(WebDriver driver, String month,String year)
	{
		
		  while(true) 
		   {
			   
			  String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			  String  currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  
			  if(currentMonth.equals(month) && currentYear.equals(year))
			  {
				  break;
				  
			  }
			  
			  //forward
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  
			  //backword
			 //driver.findElement(By.xpath("//a[@title='Prev']")).click();
			  
			  
		   }
		
	}
	
	static void selectDate(WebDriver driver, String date)
	{

		   List<WebElement> all = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			  for(WebElement dt : all )
			  {
				  if(dt.getText().equals(date))
				  {
					  dt.click();
				  }
			  }
			  
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
		//Method 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/08/2024");
		
		//Method 2
		String year = "2026";
		String month = "April";
		String date = "27";
		
		
	   driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	   selectMonthYear(driver,month,year);
	   selectDate(driver,date);
	   
	 
		

	}

}
