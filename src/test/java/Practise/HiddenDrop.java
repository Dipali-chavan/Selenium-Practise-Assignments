package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	       // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	        
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    Thread.sleep(5000);
	       // driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
	    
	    driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
	    //emplyee name
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Dipali");
	//emp code
	    driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("55099050");
	    
	    
	    //click on select dropdown
	    driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();

	    Thread.sleep(5000);
	    //select one item
	  driver.findElement(By.xpath("//span[normalize-space()='developer']")).click();
	    
	    driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
	     driver.findElement(By.xpath("//span[normalize-space()='Full-Time Permanent']")).click();
	     
	     driver.findElement(By.xpath("//div[contains(text(),'Current Employees Only')]")).click();

	     driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Saurabh");
	      driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[7]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
	      
	      driver.findElement(By.xpath("//span[normalize-space()='Development']")).click();
	      
	      WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
	    		  ele1.click();
	      if(ele1.isSelected())
	      {
	    	  System.out.println("info search");
	      }
	      

	}

}
