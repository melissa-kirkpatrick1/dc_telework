package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching {

	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void switchingwindow( ) {
	
		driver.get("https://www.bookyogaretreats.com/");
		
	//Use getFrame or getAlert to switch between them
		
		//String handle = driver.getWindowHandle();
		//driver.switchTo().window(handle);
		
	//Can also use
		
		//for(String handle = driver.getWindowHandle()) {
		//driver.switchTo().window(handle); }
		
	//From Amazon: Go to a different window
		//java.util.Set<String> handles = driver.getWindowHandles();
		//String winHandle1 = driver.getWindowHandle();
		//handles.remove(winHandle1);
		
		//String winHandle = handles.iterator().next();
		//String winHandle2 = " ";
		
	//To retrieve the handle of second window, extracting the handle which does
		//if (winHandle!=winHandle1) {	
		//winHandle2 = winHandle;	//Storing handle of second window handle
		
	//Switch control to new tab
		//driver.switchTo().window(winHandle2);
		//System.out.println(winHandle2);
		
	//iframes
		//http://demo.automationtesting.in/Frames.html
		//driver.get("http://demo.automationtesting.in/Frames.html");
		//WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		//driver.switchTo().frame(frame);
		//Thread.sleep(2000);
	}
	
	public static void main(String[] args) {
		Switching obj = new Switching();
		obj.launchbrowser();
		obj.switchingwindow();
	}
	
}
