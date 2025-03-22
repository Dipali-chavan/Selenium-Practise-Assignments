package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Assign1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\SWSetup\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
		Set<String> w1 = driver.getWindowHandles();
		System.out.println(w1);

	}

}
