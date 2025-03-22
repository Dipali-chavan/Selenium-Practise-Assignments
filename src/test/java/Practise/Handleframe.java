package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handleframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://ui.vision/demo/webtest/frames/");
            driver.manage().window().maximize();
            WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
            
            driver.switchTo().frame(frame1);
            driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
            
            driver.switchTo().defaultContent();
            
            WebElement frame2 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
            
            driver.switchTo().defaultContent();
            
            WebElement frame3 = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
            driver.switchTo().frame(frame3);
            driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
            
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
            driver.switchTo().defaultContent();
            
            WebElement frame4 = driver.findElement(By.xpath("//frameset//frame[3]"));
            driver.switchTo().frame(frame4);
            driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("learning");
             driver.switchTo().defaultContent();
 
            
           
            
            
            
            
	}

}
