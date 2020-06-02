package simplilearn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
	}

	public void takescreen () throws InterruptedException, IOException {
		
		driver.findElement(By.id("u_0_m")).sendKeys("firstName");
		driver.findElement(By.id("u_0_o")).sendKeys("secondName");
		driver.findElement(By.id("u_0_13")).click();
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakeScreenshot)driver).getScreenshotAs(outputType.FILE);
		File dest = new File("./Screenshot/fblogin.png");
		Files.copy(source, dest);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
			
	public static void main(String[] args) throws InterruptedException, IOException {
		ScreenShot obj = new ScreenShot();
		obj.launchbrowser();
		obj.takescreen();
		obj.closeBrowser();
	}
}
