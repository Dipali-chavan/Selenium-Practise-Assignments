package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BrowMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> s2 = driver.getWindowHandles();
		List<String> l1 = new ArrayList(s2);
		
		String s3 = l1.get(0);
		String s4 = l1.get(1);
		
		driver.switchTo().window(s4);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(s3);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
