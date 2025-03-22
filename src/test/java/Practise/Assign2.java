package Practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\SWSetup\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[10]/div[2]/header/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/form/div[1]/div/input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/form/div[2]/div/input")).sendKeys("1234@Jio");
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div[2]/form/div[3]/div/button")).click();
	}

}
