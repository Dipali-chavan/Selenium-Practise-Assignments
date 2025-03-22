package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver = new ChromeDriver();
           
           driver.get("https://rahulshettyacademy.com/locatorspractice/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           driver.findElement(By.id("inputUsername")).sendKeys("rahul");
           driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
           driver.findElement(By.className("signInBtn")).click();
           /*
           System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
           driver.findElement(By.linkText("Forgot your password?")).click();
           driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
           driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dipalisanjaychavan@gmail.com");
           driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7507200801");
           
           */
           System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
           //Assert.assertEquals(driver.findElements(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(), "You are successfully logged in");
           driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
	}

}
