package mukesh_otwani;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import simplilearn.AltSendKeys;

public class ComboHighLighter {

	WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	public void jsHighLight(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red')", element);
		try	{
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border:solid 2px white')", element);
		}	
			
	public void usernameLight() {
		WebElement username = driver.findElement(By.id("email"));
		jsHighLight(username);
		username.sendKeys("mukesh@gmail.com");
	}
	
	public void passwordLight() {
		WebElement password = driver.findElement(By.id("pass"));
		jsHighLight(password);
		password.sendKeys("mypassword");
	}
	
	public void loginclick() {
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		jsHighLight(loginbutton);
		loginbutton.click();
	}
	
	public static void main(String[] args) {
		ComboHighLighter obj = new ComboHighLighter();
		obj.launchbrowser();
		obj.usernameLight();
		obj.passwordLight();
		obj.loginclick();
	}	
	
}
