package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
          driver.manage().window().maximize();
          WebElement select = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
          Select drop = new Select(select);
          drop.selectByIndex(3);
          System.out.println(drop.getFirstSelectedOption().getText());
	}

}
