package CucumberPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageObject {
	public static WebDriver driver;
	
	public static WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		return driver;		
		
	}

}
