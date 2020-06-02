package simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	
	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Must use explicit wait first
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		//Alert class is used to verify the alert
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		//Once verified, provide the credentials
		//alert.authenticateUsing(new UserAndPassword(<username>, <password>));
	}

}
