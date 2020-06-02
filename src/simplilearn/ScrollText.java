package simplilearn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollText {

	
	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void scrolldown( ) {
	
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		//js.executeScript("window.scrollBy(0,1000)");
	}
	
	public static void main(String[] args) {
		ScrollText obj = new ScrollText();
		obj.launchbrowser();
		obj.scrolldown();
	}
}