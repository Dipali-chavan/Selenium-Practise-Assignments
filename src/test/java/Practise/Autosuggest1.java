package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Autosuggest1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("school");
		
		
		

	}

}
