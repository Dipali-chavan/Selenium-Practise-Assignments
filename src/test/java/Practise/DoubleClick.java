package Practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 
		 
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame("iframeResult");
		 
		 WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		 WebElement box2 = driver.findElement(By.xpath("(//input[@id='field2'])[1]"));
		 WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		 
		 box1.clear();
		 box1.sendKeys("Welcome");
		  
		 Actions act = new Actions(driver);
		 act.doubleClick(button).build().perform();
		 
		 String text = box2.getAttribute("value");
		 if(text.equals("Welcome"))
		 {
			 System.out.println("text copied");
		 }
		 else
		 {
			 System.out.println("not copied");
		 }
		 
		 
		 
		 

	}

}
