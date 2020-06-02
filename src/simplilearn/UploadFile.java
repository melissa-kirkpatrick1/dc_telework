package simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	
	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void switchingwindow( ) {
	
		driver.get("https://www..com/");
		
		//Locate the browse button
		//WebElement browse = driver.findElement(By.id("uploadfile"));
		
		//Pass the path of the files to be uploaded using sendKeys method
		//browse.sendKeys("D:\\SeleniumInterview\\UploadFile.txt");
		}
}
