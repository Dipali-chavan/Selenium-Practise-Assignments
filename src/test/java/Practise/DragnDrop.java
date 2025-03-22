package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            
            driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            driver.manage().window().maximize();
            
            Actions act = new Actions(driver);
            WebElement ele1 = driver.findElement(By.xpath("//div[@id='box6']"));
            
            WebElement ele2 = driver.findElement(By.xpath("//div[@id='box106']"));
             act.dragAndDrop(ele1, ele2).build().perform();
            
            
	}

}
