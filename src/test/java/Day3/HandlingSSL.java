package Day3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;


public class HandlingSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		option.addArguments("--incognito");
		
         WebDriver driver = new ChromeDriver(option);
         driver.get("https://www.expired.badssl.com/");
         System.out.println(driver.getTitle());
	}

}
