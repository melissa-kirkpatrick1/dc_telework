package simplilearn;

import java.awt.Dimension;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	//Maximize - WORKS
		//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
	//Set dimension - Doesn't work
		//Dimension win_dim = new Dimension(400,600);
		//driver.manage().window().setSize(win_dim);
		//driver.get("https://www.facebook.com/");
		
	//Use Javascript
		
	//Rewrite from AltSendKeys example - Doesn't work
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.resizeTo(100,600)");
		//driver.get("https://www.facebook.com/");
		//js.executeScript("document.getElementById('search_form_input_homepage').value='selenium tutorials'");
		
	//Original - Doesn't work
		//((JavascriptExecutor)driver).executeScript("window.resizeTo(100,600)");
		//driver.get("https://www.facebook.com/");
		}
	
	public static void main(String[] args) {
		WindowSize obj = new WindowSize();
		obj.launchbrowser();
	}
	
}
