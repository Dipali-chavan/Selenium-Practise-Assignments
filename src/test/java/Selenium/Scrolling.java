package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//scrolling window
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
		//scrolling component
		js.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");
		

	}

}
