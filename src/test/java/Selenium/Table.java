package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int row = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tr")).size();
		
		System.out.println("Total rows" + row);
		int col = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//th")).size();
		System.out.println(col);
		
		String data = driver.findElement(By.xpath("//div[@class='left-align']//table[@id='product']//tr[3]")).getText();
		System.out.println(data);

	}

}
