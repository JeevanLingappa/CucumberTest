package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CucumberPractice.BasePageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObject.CheckOutPO;
import pageObject.HomePagePO;
import pageObject.OrderConfirmationPO;

@RunWith(Cucumber.class)

public class MultipleOrderStepDefination extends BasePageObject {

	//public WebDriver driver;
	HomePagePO hm;
	CheckOutPO cp;
	OrderConfirmationPO oc;

	@When("^User search (.+) on search options$")
	public void user_search_on_search_option(String vegname) throws Throwable {
		hm = new HomePagePO(driver);
		hm.getSearchOption().sendKeys(vegname);
	}

	@And("^Added (.+) items to the cart by clicking add toCart button$")
	public void added_items_to_the_cart_by_clicking_add_to_cart_button(String quantity) throws Throwable {

		hm = new HomePagePO(driver);
		WebElement ele = hm.getAddItems();

		Actions ac = new Actions(driver);
		ac.moveToElement(ele).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(quantity).build().perform();

		Thread.sleep(2000);

		hm.getAddToCart().click();

		Thread.sleep(5000);
	}

	@And("^product name should contains (.+) and quantity as (.+)$")
	public void product_name_should_contains_and_quantity_as(String vegname, String quantity) throws Throwable {

		oc = new OrderConfirmationPO(driver);

		Assert.assertTrue(oc.getItemName().getText().contains(vegname));
		System.out.println(oc.getItemName().getText());
		System.out.println(vegname);
		Assert.assertTrue(oc.getQuantity().getText().contentEquals(quantity));
		System.out.println(quantity);

	}
}
