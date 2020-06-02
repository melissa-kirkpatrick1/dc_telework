package simplilearn;

import java.awt.List;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		String url;
		HttpURLConnection huc = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://mktechinc.com/home.htm");
	
	//Fetch all the elements with 'a'
	//Her code was...List<WebElement> links = driver.findElements(By.tagName("a"));...did not WORK
		java.util.List<WebElement>links = driver.findElements(By.tagName("a"));
		
		for(WebElement elem : links) {
			url = elem.getAttribute("href");
			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			
		try {
			huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			int respCode = huc.getResponseCode();
			
			if(respCode >= 400) {
				System.out.println(url = " is a broken link");
			}
			else {
				System.out.println(url = " is a valid link");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	//Collect all the links from the webpage. All links associated with Tag 'a'
		//List<WebElement> links = driver.findElements(By.tagName("a"))'
	
	//Create a list of type WebElement to store all the Link elements.
		//for(int i=0, i<links.size(); i++) {
			//WebElement element = links.get(i);
			//String url = element.getAttribute("href");
			//verifyLink(url);}
		}
		
	}
	
}
