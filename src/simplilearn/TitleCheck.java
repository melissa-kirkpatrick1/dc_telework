package simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Use this to find actual title
		System.out.println(driver.getTitle());
	}
	
	public void retrieveTitle( ) {
		String actualTitle = driver.getTitle();
		
		//Change the actual title here to make it false
		String expectedTitle = "Facebook - Log In or Sign Up";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Title Matched");
		else
				System.out.println("Title didn't match");
		
		//Or you can use the following to assert a title
		//Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void closeBrowser() {
		driver.quit();
	}	
	
	public static void main(String[] args) {
		TitleCheck obj = new TitleCheck();
		obj.launchbrowser();
		obj.retrieveTitle();
		obj.closeBrowser();
	}
		
}
