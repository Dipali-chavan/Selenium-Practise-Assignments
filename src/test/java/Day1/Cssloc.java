package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Cssloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// tag id         tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Books");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Books");    can do in both way

		//driver.findElement(By.linkText("Search")).click();
		
		//tag class tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tshirt");
		
		//tag attribute      tag[attribute =value]
		//driver.findElement(By.cssSelector("input[placeholder= 'Search store']")).sendKeys("hii");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("hello");

	}

}
