package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPO {

	public WebDriver driver;

	public CheckOutPO(WebDriver driver) {
		this.driver = driver;
	}

	By cartIcon = By.cssSelector("a.cart-icon img");
	By proceedToCheckOut = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

	public WebElement getCartIcon() {

		return driver.findElement(cartIcon);

	}

	public WebElement getProceedToCheckOut() {

		return driver.findElement(proceedToCheckOut);

	}

}
