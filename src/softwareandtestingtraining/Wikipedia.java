package softwareandtestingtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Must have to use Chrome; BEST ONE
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");

		//Find WebElement "English" and click
		
		//Line below is a combo of amazon and wiki; didn't work
		//driver.findElement(By.linkText("English")).click();
		
		//Lines below are exactly like demo and didn't work, looks like linkText isn't picking it up
		//WebElement link;
		//link = driver.findElement(By.linkText("English"));
		//link.click();
		
		//Demo had find (By.linkText) but didn't work so changed to (By.cssSelector)
		driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
		Thread.sleep(2000);
		
		//Search box
		
		//WebElement searchBox;
		//searchBox = driver.findElement(By.id("searchInput"));
		//searchBox.sendKeys("Software");
		//searchBox.submit();

		//Line below is combo of amazon and wiki, with 2 ways to Submit
		
		WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software testing");
		//driver.findElement(By.className("searchButton")).click();
		searchBox.submit();
		Thread.sleep(2000);
		
	}

}
