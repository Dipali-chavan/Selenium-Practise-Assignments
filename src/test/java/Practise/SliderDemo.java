package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		//Min slider
		
		WebElement ele1= driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println("Before moving location"+ele1.getLocation());
		
		act.dragAndDropBy(ele1, 100, 250).perform();
		
		System.out.println("After moving"+ele1.getLocation());
		
		//Max slider
		WebElement max = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Before moving"+max.getLocation());
		act.dragAndDropBy(max, -49, 250).perform();
		System.out.println("After moving"+max.getLocation());
		
		
		
		
		

	}

}
