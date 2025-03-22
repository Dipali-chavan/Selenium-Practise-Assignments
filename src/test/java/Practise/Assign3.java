package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\SWSetup\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//isDisplayed()
		//WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(logo.isDisplayed());
		
		//isEnabled
		//boolean status= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println(status);
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println("before selection");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		System.out.println("after selection");
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
		

	}

}
