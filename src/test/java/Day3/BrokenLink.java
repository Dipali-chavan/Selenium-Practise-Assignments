package Day3;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLink {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noofbrlink = 0;
		for(WebElement link: links)
		{
			String hrefatt = link.getAttribute("href");
			if(hrefatt==null || hrefatt.isEmpty())
			{
				System.out.println("null value ");
				continue;
			}
			
			//convert string to url
		try {
			URL linkurl = new URL(hrefatt); 
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); //opens server conn
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println("it is broken link");
				noofbrlink++;
			}
			else
			{
				System.out.println("Not broken");
			}
		}
		catch(Exception e) {}
			
		}
		System.out.println("no of broken link"+noofbrlink);
		

	}
	

}
