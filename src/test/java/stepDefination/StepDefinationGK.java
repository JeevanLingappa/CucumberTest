package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class StepDefinationGK {
	public  WebDriver driver;

	@Given("^User logged into greenKart home page$")
	public void user_logged_into_greenkart_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	

	@When("^User search \"([^\"]*)\" on search option$")
	public void user_search_something_on_search_option(String strArg1) throws Throwable {
		driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(strArg1);
	}

	@Then("^\"([^\"]*)\" vegetable should be shortlisted$")
	public void something_vegetable_should_be_shortlisted(String strArg1) throws Throwable {
		String veg = driver.findElement(By.xpath("//div[@class='product']/h4")).getText();
		Assert.assertTrue(veg.contains(strArg1));
		System.out.println(veg);
//		if (veg.contains(strArg1)) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
		driver.close();
	}
	
	
	
	///////------------Scenario 2
	
	   @Then("^User should navigate to order confirmation page$")
	    public void user_should_navigate_to_order_confirmation_page() throws Throwable {
		   String title =driver.getTitle();
	    	System.out.println(title);
	    }

	    @And("^Added \"([^\"]*)\" items to the cart by clicking add to cart button$")
	    public void added_something_items_to_the_cart_by_clicking_add_to_cart_button(String strArg1) throws Throwable {
	       driver.findElement(By.cssSelector("input.quantity")).sendKeys(strArg1);
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	       Thread.sleep(2000);
	    }

	    @And("^User clicks on ProccedToCheckOut button$")
	    public void user_clicks_on_proccedtocheckout_button() throws Throwable {
	    	
	    	driver.findElement(By.cssSelector("a.cart-icon img")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    	Thread.sleep(2000);
	    }

	    @And("^product name should contains \"([^\"]*)\" and Quantity as \"([^\"]*)\"$")
	    public void product_name_should_contains_something_and_quantity_as_something(String strArg1, String strArg2) throws Throwable {
	    Assert.assertTrue( driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
	    
	    Assert.assertTrue(driver.findElement(By.cssSelector("p.quantity")).getText().contains(strArg2));
	    }

	    @And("^Place order button should be enabled$")
	    public void place_order_button_should_be_enabled() throws Throwable {
	    	Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed());
	    	driver.close();
	        
	    }

}