package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PractiseAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		String name = ele1.getText();
	    System.out.println(name);
	    WebElement select = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select  drop = new Select(select);
		drop.selectByVisibleText(name);
		
		
		
		
		

	}

}
