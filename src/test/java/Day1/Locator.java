package Day1;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.demoblaze.com/index.html");
         driver.manage().window().maximize();
         
        List<WebElement> ele = driver.findElements(By.tagName("a"));
        System.out.println("Total links"+ele.size());
        
        List<WebElement> ele1 = driver.findElements(By.tagName("img"));
        System.out.println("Total images"+ele1.size());
         
        driver.findElement(By.linkText("Nokia lumia 1520")).click();
        
         
	}

}
