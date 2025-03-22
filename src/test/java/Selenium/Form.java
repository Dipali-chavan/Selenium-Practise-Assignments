package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Dipali");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dipali@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("demo123");

		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement option = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select opt = new Select(option);
		opt.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("27-04-2001");
		driver.findElement(By.xpath("//input[@name='bday']")).click();
		System.out.println("success");
		

	}

}
