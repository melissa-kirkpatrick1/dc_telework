package edureka;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	//open the web app and maximize window
		driver.navigate().to ("https://amazon.in");
	//driver.navigate().to ("http://www.mktechinc.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
	
		if (title.equalsIgnoreCase("Amazon.in"))
	//if(title.equalsIgnoreCase("MK Tech Home"))
			System.out.println("Title matches");
		else
			System.out.println(title);
	
	//identify a web element
		String tagname = " ";
		tagname = driver.findElement(By.cssSelector("#searchDropdownBox")).getText();
	//tagname = driver.findElement(By.cssSelector("body > div.glow-1 > headerhome > div.main > nav > ul > li:nth-child(3) > a")).getText();
		System.out.println(tagname);
	
	//dropdown
		WebElement All = driver.findElement(By.cssSelector("#nav-search-dropdown-card > div > div > i")); 
		Actions action = new Actions(driver);
		action.moveToElement(All).perform();
		action.click();
		action.perform();
		Thread.sleep(2000);
	
	//WebElement Services = driver.findElement(By.cssSelector("body > div.glow-1 > headerhome > div.main > nav > ul > li:nth-child(3) > a"));
	//Actions action = new Actions(driver);
	//action.moveToElement(Services).perform();
	//action.click();
	//action.perform();
	//Thread.sleep(2000);
	
	//select Books #searchDropdownBox > option:nth-child(13)
	//Could not click "Books" in amazon.com so switched back to amazon.in
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);		

	
	//select Engineering
	//WebElement Engineering = driver.findElement(By.cssSelector("body > div.glow-1 > headerhome > div.main > nav > ul > li:nth-child(3) > ul > li:nth-child(3) > a"));
	//action.moveToElement (Engineering);
	//action.click();
	//action.perform();
	//Thread.sleep(2000);
		
	
	//typing the text
		WebElement myElement = driver.findElement(By.id("twotabsearchtextbox"));
		myElement.sendKeys("john grisham");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
	
	//select the book "The Firm"
		driver.findElement(By.partialLinkText("Reckoning")).click();
		Thread.sleep(2000);
	
	//Go to a different window
		java.util.Set<String> handles = driver.getWindowHandles();
		String winHandle1 = driver.getWindowHandle();
		handles.remove(winHandle1);
	
		String winHandle = handles.iterator().next();
		String winHandle2 = " ";
	
		if (winHandle!=winHandle1)
	{
			
	//To retrieve the handle of second window, extracting the handle which does
		winHandle2 = winHandle;	//Storing handle of second window handle
	
	//Switch control to new tab
		driver.switchTo().window(winHandle2);
		System.out.println(winHandle2);
		
	}
	Thread.sleep(2000);
	
	//add to cart
		//driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		//Thread.sleep(5000);
	
	//scroll the web page till end
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	//iframes
		//http://demo.automationtesting.in/Frames.html
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
	
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("hey");
		Thread.sleep(2000);
	
		//driver.close();
		//driver.quit();
	
	
	}
}
