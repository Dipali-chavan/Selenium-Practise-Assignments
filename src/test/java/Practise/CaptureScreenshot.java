package Practise;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class CaptureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        //full page screenshot
        /*
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\Dipali1.Chavan\\eclipse-workspace\\Assign2\\Screenshot\\full.png");
        source.renameTo(target); //copy sourcefile
        */
        
        //capture specific section 
       WebElement feature =  driver.findElement(By.xpath("//p[@class='demo-conversion']"));
       File source = feature.getScreenshotAs(OutputType.FILE);
       File target = new File("C:\\\\Users\\\\Dipali1.Chavan\\\\eclipse-workspace\\\\Assign2\\\\Screenshot\\\\feature.png");
       source.renameTo(target);
       
        
        
	}

}
