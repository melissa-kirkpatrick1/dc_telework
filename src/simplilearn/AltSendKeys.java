package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AltSendKeys {

	WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://www.duckduckgo.com");
	}
	
	//Use Javascript executor to enter text into email text fields
	
	public void enteruserID() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('search_form_input_homepage').value='selenium tutorials'");
		//js.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		driver.findElement(By.id("search_button_homepage")).click();
	}	
				
	public static void main(String[] args) {
		AltSendKeys obj = new AltSendKeys();
		obj.launchbrowser();
		obj.enteruserID();
	}	
}
