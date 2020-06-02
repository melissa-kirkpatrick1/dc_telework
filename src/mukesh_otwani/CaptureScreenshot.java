package mukesh_otwani;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	@Test
	
	public void capscreen() throws InterruptedException
	{
	
		//Write this for Chrome driver; BEST ONE
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
				
		Thread.sleep(2000);	
		
		//Searches for input box
		//driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
		//Thread.sleep(2000);
		
		//Inputs text
		//WebElement searchBox = driver.findElement(By.id("searchInput"));
		//searchBox.sendKeys("Software testing");
		
		//All of the 3 below can be used for Submit
		
		//driver.findElement(By.className("searchButton")).click();
		//driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
		//searchBox.submit();
		
		
		//Takes a Screenshot
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile
		
		
	}
}
