package Day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 WebElement searchBar = driver.findElement(By.name("q"));
		 if(searchBar.isDisplayed())
		 {
			 System.out.println("searchbar is present");
			 searchBar.sendKeys("hello google");
			 searchBar.submit();
		 }
		 else {
			 System.out.println("not present");
		 }
		
		   WebElement h1Element = driver.findElement(By.tagName("h1"));
            String h1Text = h1Element.getText();
            System.out.println("Text of <h1> element: " + h1Text);
	        
		
		

	}

}
