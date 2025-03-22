package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class FirstTestCase {
	
	/*
	 1. Launch browser(chrome)
	 2. Open URl https://demo.opencart.com/
	 3. validate title should "your store"
	 4.close browser
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	//launch browser
        //ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2. Open URl https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3. validate title should "your store"
		  String act_title = driver.getTitle();
		  if(act_title.equals("Your Store"))
		  {
			  System.out.println("Test passed");
		  }
		  else {
			  System.out.println("test not passed");
		  }
		   
		  driver.close();
		   //driver.quit();
        
	}

}
