package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	WebDriver driver;

	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void selectDrop( ) {
	
		driver.get("https://www.facebook.com/");
		
	//Find the dropdowns using any attributes
		WebElement day_elem = driver.findElement(By.id("day"));
		WebElement month_elem = driver.findElement(By.id("month"));
		WebElement year_elem = driver.findElement(By.id("year"));
		
	//You need to use select class to with with dropdowns
		Select day_sel = new Select (day_elem);
		Select month_sel = new Select (month_elem);
		Select year_sel = new Select (year_elem);
		
	//Select the day by value
		day_sel.selectByValue("10");
		System.out.println("Selected day is : " + day_sel.getFirstSelectedOption().getText());
		
	//Select the month by index
		month_sel.selectByIndex(6);
		System.out.println("Selected month is : " + month_sel.getFirstSelectedOption().getText());
		
	//Select the year by visible text
		year_sel.selectByVisibleText("2005");
		System.out.println("Selected year is : " + year_sel.getFirstSelectedOption().getText());
	}
	
	public static void main(String[] args) {
		Dropdown obj = new Dropdown();
		obj.launchbrowser();
		obj.selectDrop();
	}
}
