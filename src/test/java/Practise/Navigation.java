package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Navigation {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        
        //driver.get("https://demo.nopcommerce.com/");
       // driver.navigate().to("https://demo.nopcommerce.com");
        
       // URL my = new URL("https://demo.nopcommerce.com");
        //driver.navigate().to(my);
        // driver.navigate().to("https://demo.nopcommerce.com");

         driver.navigate().to("https://demo.nopcommerce.com/");
         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         driver.navigate().back();
         System.out.println(driver.getCurrentUrl());
         
         driver.navigate().forward();
         System.out.println(driver.getCurrentUrl());
         
         driver.navigate().refresh();
	}

}
