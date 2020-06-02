package getStuff;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlesUrlsEtc {

	@Test
	
	public void GetStuffFromHomePage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		//browser.get("https://youtube.com/");
		browser.get("https://www.selenium.dev");
		//browser.get("http://www.mktechinc.com");
		System.out.println(browser.getCurrentUrl());
		System.out.println(browser.getTitle());
		browser.quit();
		
	}
}
