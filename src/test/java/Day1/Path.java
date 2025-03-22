package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



public class Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","C:\\SWSetup\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             
             driver.get("https://demo.opencart.com");
             driver.manage().window().maximize();
             
             //xpath with single attribute
             //driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("shirt");
             
             //xpath with multiple attribute
            // driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("top");
             
             //driver.findElement(By.xpath("//*[text()='MacBook']")).click();
             /*boolean ms = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
             System.out.println(ms);
             
             String m2 = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
             System.out.println(m2);
             */
             
             //driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("hii");)
             
             
             
	}

}
