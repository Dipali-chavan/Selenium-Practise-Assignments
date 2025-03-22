package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
		//boolean logostatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logostatus);
		
		//linkText and PartialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//class
		//List<WebElement> headerlink=driver.findElements(By.className("list-inline-item"));
		//System.out.println("size"+headerlink.size());
		
		//tagname
		//List<WebElement> link = driver.findElements(By.tagName("a"));
		//System.out.println("totallink"+link.size());
          
		
		List<WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}

}
