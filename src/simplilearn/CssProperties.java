package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperties {

	WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		
	public void getCssProp(){
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("email")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.id("email")).getCssValue("padding-bottom"));
	}
		
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		CssProperties obj = new CssProperties();
		obj.launchbrowser();
		obj.getCssProp();
		obj.closeBrowser();
	}
	
	
}
