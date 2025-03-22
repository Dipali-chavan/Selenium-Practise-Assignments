package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 launch browser
	    System.setProperty("webdriver.chrome.driver","C:\\SWSetup\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
	    String m2 = driver.getTitle();
	    if (m2.equals("nopCommerce demo Store"))
	    {
	    	System.out.println("test pass");
	    }
	    else
	    {
	    	System.out.println("Test fail");
	    }
	    driver.close();
		
		
		

	}

}
