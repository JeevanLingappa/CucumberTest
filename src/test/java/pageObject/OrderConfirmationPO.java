package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPO {
	
	public WebDriver driver;

	public OrderConfirmationPO(WebDriver driver) {
		this.driver = driver;
	}
	
	By quantity =By.cssSelector("p.quantity");
	By itemName=  By.cssSelector("p.product-name");
	By placeOrder =By.xpath("//button[text()='Place Order']");
	
	
	

	public WebElement getQuantity() {

		return driver.findElement(quantity);

	}
	

	public WebElement getItemName() {

		return driver.findElement(itemName);

	}
	public WebElement getPlaceOrder() {

		return driver.findElement(placeOrder);

	}


}
