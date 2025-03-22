package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class ZoominOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		
	    //Thread.sleep(5000);
		
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		//driver.manage().window().minimize();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='50%'");
		

	}

}
