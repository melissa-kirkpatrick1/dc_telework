package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void mousemove( ) throws InterruptedException {
		
		driver.get("http://mktechinc.com/home.htm");
		WebElement elem = driver.findElement(By.xpath("/html/body/div[1]/headerhome/div[2]/nav/ul/li[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(elem).perform();
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		MouseHover obj = new MouseHover();
		obj.launchbrowser();
		obj.mousemove();
	}
	
}
