package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement drops = driver.findElement(By.xpath("//select[@id='country']"));
        Select country = new Select(drops);
        //select By visible text
       // country.selectByVisibleText("Japan");
        
        //select By value
       // country.selectByValue("japan");
        
         //country.selectByIndex(5);
             List<WebElement> lst = country.getOptions();
             System.out.println(lst.size());
             for(int i=0;i<lst.size();i++)
             {
            	 System.out.println(lst.get(i).getText());
             }
             
             
             
        
        

	}

}
