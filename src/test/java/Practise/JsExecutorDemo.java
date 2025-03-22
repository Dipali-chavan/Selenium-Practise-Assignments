package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JsExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement input1 = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;

		//JavascriptExecutor js =driver;
		js.executeScript("arguments[0].setAttribute('value','Dipali')", input1);
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radio);
        		

	}

}
