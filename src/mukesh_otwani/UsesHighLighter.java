package mukesh_otwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsesHighLighter {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
		HighLighter.highLightElement(driver, username);
		username.sendKeys("mukesh@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		HighLighter.highLightElement(driver, password);
		password.sendKeys("mypassword");
		
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		HighLighter.highLightElement(driver, loginbutton);
		loginbutton.click();
	}

}
