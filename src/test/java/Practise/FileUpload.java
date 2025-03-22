package Practise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://www.davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Dipali1.Chavan\\Desktop\\Testing\\Acs.txt");
        
	}

}
