

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mukesh_otwani.HighLighter;

class MkTechHomePageTest {
	
	@Test
	
	public void loginLinkOnHomePage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver browser=new ChromeDriver(options);
		browser.get("http://www.mktechinc.com");
		
		// Wait for element to appear, up to 20 seconds
		WebDriverWait wait = new WebDriverWait(browser, 1000);
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employee Login")));
		
//		This is one way to get the link by xpath
//	    WebElement el = browser.findElement(By.xpath("//a[@href='/intranet']"));
		assertTrue((el.isDisplayed()));
		
		//Added by me
		//browser.navigate().to("http://www.mktech.com");
		//browser.manage().window().maximize();
		//String title = browser.getTitle();
		
		//if(title.equalsIgnoreCase("MK Tech"))
			//System.out.println("Title matches");
		//else
			//System.out.println(title);
		
		//locate a web element
		String tagname=" ";
		tagname= browser.findElement(By.xpath("//a[@href='/intranet']")).getText();
		System.out.println(tagname);
		
		//dropdown
		
		
		System.out.println(browser.getCurrentUrl());
		System.out.println(browser.getTitle());
		
		
		browser.quit();       
	}

}

