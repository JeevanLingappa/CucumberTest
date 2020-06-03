package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import CucumberPractice.BasePageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObject.CheckOutPO;
import pageObject.HomePagePO;
import pageObject.OrderConfirmationPO;

@RunWith(Cucumber.class)
public class StepDefinationGK {
	public WebDriver driver;
	HomePagePO hm;
	CheckOutPO cp;
	OrderConfirmationPO oc;

	@Given("^User logged into greenKart home page$")
	public void user_logged_into_greenkart_home_page() throws Throwable {

		driver = BasePageObject.getWebDriver();

	}

	@When("^User search \"([^\"]*)\" on search option$")
	public void user_search_something_on_search_option(String strArg1) throws Throwable {
		hm = new HomePagePO(driver);
		hm.getSearchOption().sendKeys(strArg1);
		
	}

	@Then("^\"([^\"]*)\" vegetable should be shortlisted$")
	public void something_vegetable_should_be_shortlisted(String strArg1) throws Throwable {
		hm = new HomePagePO(driver);
		String veg = hm.getSearchDisplay().getText();
		
		Assert.assertTrue(veg.contains(strArg1));
		

	}

	/////// ------------Scenario 2

	@Then("^User should navigate to order confirmation page$")
	public void user_should_navigate_to_order_confirmation_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@And("^Added \"([^\"]*)\" items to the cart by clicking add to cart button$")
	public void added_something_items_to_the_cart_by_clicking_add_to_cart_button(String strArg1) throws Throwable {
		hm = new HomePagePO(driver);
		WebElement ele = hm.getAddItems();
		
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(strArg1).build().perform();

		Thread.sleep(2000);
		
		hm.getAddToCart().click();
		
		Thread.sleep(5000);
	}

	@And("^User clicks on ProccedToCheckOut button$")
	public void user_clicks_on_proccedtocheckout_button() throws Throwable {

		cp = new CheckOutPO(driver);
		cp.getCartIcon().click();
		// driver.findElement(By.cssSelector("a.cart-icon img")).click();
		Thread.sleep(2000);
		cp.getProceedToCheckOut().click();
		// driver.findElement(By.xpath("//button[text()='PROCEED TO
		// CHECKOUT']")).click();
		Thread.sleep(2000);
	}

	@And("^product name should contains \"([^\"]*)\" and Quantity as \"([^\"]*)\"$")
	public void product_name_should_contains_something_and_quantity_as_something(String strArg1, String strArg2)
			throws Throwable {
		
		oc = new OrderConfirmationPO(driver);
		
		Assert.assertTrue(oc.getItemName().getText().contains(strArg1));
		System.out.println(oc.getItemName().getText());
		System.out.println(strArg1);
		Assert.assertTrue(oc.getQuantity().getText().contentEquals(strArg2));
		System.out.println(strArg2);
	}

	@And("^Place order button should be enabled$")
	public void place_order_button_should_be_enabled() throws Throwable {
		oc = new OrderConfirmationPO(driver);
		
		Assert.assertTrue(oc.getPlaceOrder().isDisplayed());

	}

}