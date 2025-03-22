package Day3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;


public class HeadlessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
         WebDriver driver = new ChromeDriver(options);
         driver.get("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();
         
         String act = driver.getTitle();
         if(act.equals("Your Store"))
         {
        	 System.out.println("Test passed");
         }
         else {
        	 
        	 System.out.println("Test not passed");
         }
	}

}
