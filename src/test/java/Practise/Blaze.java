package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Blaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           driver.get("https://blazedemo.com/");
           driver.manage().window().maximize();
           
           WebElement ele = driver.findElement(By.xpath("//select[@name='fromPort']"));
           Select one = new Select(ele);
           one.selectByVisibleText("Paris");
           
           
           WebElement ele2 = driver.findElement(By.xpath("//select[@name='toPort']"));
           Select two = new Select(ele2);
           two.selectByVisibleText("London");
           
           driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
           
           int row = driver.findElements(By.xpath("//tbody//tr")).size();
           System.out.println(row);
           
           int col = driver.findElements(By.xpath("//table[@class='table']//th")).size();
           System.out.println(col);
           
           driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
           
           driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Dipali Chavan");
           driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Ghansoli");
           driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Navi mumbai");
           driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
           driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("423501");
            
           WebElement web = driver.findElement(By.xpath("//select[@id='cardType']"));
           Select s1 = new Select(web);
           s1.selectByVisibleText("Visa");
           
           driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678910");
           driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Dipali");
           
           driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
           driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
           
           
          
	}

}
