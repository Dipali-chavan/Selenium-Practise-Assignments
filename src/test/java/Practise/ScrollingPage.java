package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.scroll down by pixel number
		//js.executeScript("window.scrollBy(0,1500)", " ");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2.scroll down element is displayed
		
		/* WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Slider']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		//3. scroll page till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		

	}

}
