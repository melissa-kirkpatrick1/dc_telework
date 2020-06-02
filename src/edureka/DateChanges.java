package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateChanges {

	public static void main(String[] args) throws InterruptedException {

		//Must have to use Chrome; BEST ONE
		System.setProperty("webdriver.chrome.driver", "C:\\development\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vitalets.github.io/combodate/");
		driver.manage().window().maximize();
		
		//Day 1
		WebElement day1 = driver.findElement(By.cssSelector("#div-date > span > select.day"));
		Select daySelected1 = new Select (day1);
		Thread.sleep(2000);
		daySelected1.selectByIndex(30);
		
		WebElement month1 = driver.findElement(By.cssSelector("#div-date > span > select.month"));
		Select monthSelected1 = new Select (month1);
		Thread.sleep(2000);
		monthSelected1.selectByVisibleText("Sep");
		
		WebElement year1 = driver.findElement(By.cssSelector("#div-date > span > select.year"));
		Select yearSelected1 = new Select (year1);
		Thread.sleep(2000);
		yearSelected1.selectByValue("1977");
		
		//Day2
		WebElement day2 = driver.findElement(By.cssSelector("#div-date > span > select.day"));
		Select daySelected2 = new Select (day2);
		Thread.sleep(2000);
		daySelected2.selectByIndex(27);
		
		WebElement month2 = driver.findElement(By.cssSelector("#div-date > span > select.month"));
		Select monthSelected2 = new Select (month2);
		Thread.sleep(2000);
		monthSelected2.selectByVisibleText("May");
		
		WebElement year2 = driver.findElement(By.cssSelector("#div-date > span > select.year"));
		Select yearSelected2 = new Select (year2);
		Thread.sleep(2000);
		yearSelected2.selectByValue("2001");
		
	}

}
