package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CssLocPrac {
	public static void main(String args[]) throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);

	
	//List<WebElement> ele1 = driver.findElements(By.tagName("a"));
	//System.out.println("Total images"+ ele1.size());
	
	//driver.findElement(By.cssSelector("a.nav-link")).click();
	//driver.findElement(By.linkText("PC (0)")).click();
	
	driver.findElement(By.linkText("iPhone")).click();
	driver.findElement(By.name("quantity")).sendKeys("2");
	driver.findElement(By.id("button-cart")).click();
	System.out.println("your item added successfully");
	
	
	
	
	}

}
