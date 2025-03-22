package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              WebDriver driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
              
               driver.get("https://demo.opencart.com/");
               driver.manage().window().maximize();
               WebElement desk = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
               WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
               
               Actions act =new Actions(driver);
               
              // act.moveToElement(desk).moveToElement(mac).click().build().perform();
               act.moveToElement(desk).moveToElement(mac).click().perform();

               
               
               
	}

}
