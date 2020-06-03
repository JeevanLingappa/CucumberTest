package CucumberPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageObject {
	public static WebDriver driver;
	public static Properties prop;
	static String dir = System.getProperty("user.dir");
	static String fileName= dir+"\\src\\test\\java\\CucumberPractice\\global.properties";
	
	public static WebDriver getWebDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(fileName);
		
		prop.load(fis);
		String SITurl = prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(SITurl);
		driver.manage().window().maximize();
		return driver;		
		
	}

}
