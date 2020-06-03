package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePO  {
	public WebDriver driver;
	public HomePagePO(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.cssSelector("input.search-keyword");
	By displaySerach= By.xpath("//div[@class='product']/h4");
	By addItems = By.cssSelector("input.quantity");
	By addToCart = By.xpath("//button[text()='ADD TO CART']");
	
	
	
	
	
	public WebElement getSearchOption() 
	{
	 return driver.findElement(search);
		
	}
	
	public WebElement getSearchDisplay() 
	{
	 return driver.findElement(displaySerach);
		
	}
	public WebElement getAddItems() 
	{
	 return driver.findElement(addItems);
		
	}
	public WebElement getAddToCart() 
	{
	 return driver.findElement(addToCart);
		
	}

}
