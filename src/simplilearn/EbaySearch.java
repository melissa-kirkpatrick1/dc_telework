package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
	
	WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.ebay.com/");
	}
		
	public void searchProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		driver.findElement(By.id("gh-btn")).click();	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Daily Deals")).click();
	}
		
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.simplilearn.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("The title of this page is : " + driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		EbaySearch obj = new EbaySearch();
		obj.launchbrowser();
		obj.searchProduct();
		obj.navigate();
		obj.closeBrowser();
	}

}
