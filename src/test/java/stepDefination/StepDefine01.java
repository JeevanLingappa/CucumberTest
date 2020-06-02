package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class StepDefine01 {

	public static WebDriver driver;
	public String url = "https://www.seleniumeasy.com/test";
	boolean notice;
	String str1 = "Test01";
	
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Initiating browser");
		
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("at-cv-lightbox-win"));
		System.out.println(ele.getText());
		notice = driver.findElement(By.id("at-cv-lightbox-win")).isDisplayed();
		System.out.println(notice);
		if (notice == true) {
			driver.findElement(By.id("at-cv-lightbox-close")).click();
		}

		driver.findElement(By.id("btn_basic_example")).click();
		System.out.println("Button clicked");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Simple Form Demo")).sendKeys(Keys.ENTER);

		System.out.println("Simple Form Demo clicked");
    }

    @Then("^check browser is loaded$")
    public void check_browser_is_loaded() throws Throwable {
        System.out.println("Browser loaded");
    }
    

	@Given("^user logged in to practice website$")
	public void user_logged_in_to_practice_website() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("at-cv-lightbox-win"));
		System.out.println(ele.getText());
		notice = driver.findElement(By.id("at-cv-lightbox-win")).isDisplayed();
		System.out.println(notice);
		if (notice == true) {
			driver.findElement(By.id("at-cv-lightbox-close")).click();
		}

	}

	@Given("click on startPractising buttton")
	public void click_on_startPractising_buttton() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btn_basic_example")).click();
		System.out.println("Button clicked");
		Thread.sleep(2000);

	}

	@When("user clicks on simple_form_demo tab")
	public void user_clicks_on_simple_form_demo_tab() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Simple Form Demo")).sendKeys(Keys.ENTER);
		;
		System.out.println("Simple Form Demo clicked");
	}

	@Then("user should navigate to base demo form")
	public void user_should_navigate_to_base_demo_form() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Base page loaded");
	}

	@Then("Page title should be validated")
	public void page_title_should_be_validated() {
		// Write code here that turns the phrase above into concrete actions
		String Ptitle = driver.getTitle();
		System.out.println(Ptitle);

	}

	@Given("user is on simple demo form page")
	public void user_is_on_simple_demo_form_page() {
		// Write code here that turns the phrase above into concrete actions
		// System.out.println(driver.getTitle());

	}

	@When("user enters  a message on Enter Message test box")
	public void user_enters_a_message_on_Enter_Message_test_box() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input.form-control")).sendKeys(str1);
	}

	@When("click on show message button")
	public void click_on_show_message_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	}

	@Then("user should see the entered message")
	public void user_should_see_the_entered_message() {
		// Write code here that turns the phrase above into concrete actions
		String name = driver.findElement(By.cssSelector("span#display")).getText();
		Assert.assertEquals(name, str1);
	}

	///////// -------------3-------------------////

	@When("user enters a value of a")
	public void user_enters_a_value_of_a() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#sum1")).sendKeys("30");
	}

	@When("value of b")
	public void value_of_b() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#sum2")).sendKeys("50");
	}

	@When("click on get total button")
	public void click_on_get_total_button() {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.cssSelector("button.btn.btn-default")).click();
		driver.findElement(By.xpath("//button[@type='button' and text()='Get Total']")).click();
	}

	@Then("user should see the sum of a and b")
	public void user_should_see_the_sum_of_a_and_b() {
		// Write code here that turns the phrase above into concrete actions

		String sum = driver.findElement(By.id("displayvalue")).getText();
		System.out.println(sum);
		driver.close();

	}

	//// ------------------------4----------With data driven

	@Given("user is on simple demo form homepage")
	public void user_is_on_simple_demo_form_homepage() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("at-cv-lightbox-win"));
		System.out.println(ele.getText());
		notice = driver.findElement(By.id("at-cv-lightbox-win")).isDisplayed();
		System.out.println(notice);
		if (notice == true) {
			driver.findElement(By.id("at-cv-lightbox-close")).click();
		}

		driver.findElement(By.id("btn_basic_example")).click();
		System.out.println("Button clicked");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Simple Form Demo")).sendKeys(Keys.ENTER);

		System.out.println("Simple Form Demo clicked");
	}

	@When("user enters a value of {string} and {string}")
	public void user_enters_a_value_of_and(String a, String b) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#sum1")).sendKeys(a);
		driver.findElement(By.cssSelector("input#sum2")).sendKeys(b);
	}

	@When("click on Get_Total button")
	public void click_on_Get_Total_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='button' and text()='Get Total']")).click();
	}

	@Then("user should see the sum of {string} and {string}")
	public void user_should_see_the_sum_of_and(String a, String b) {
		// Write code here that turns the phrase above into concrete actions

		String sum = driver.findElement(By.id("displayvalue")).getText();
		System.out.println("Sum of " + a + "and " + b + "is :");
		System.out.println(sum);
		driver.close();

	}

	////////// --------5--Data Parameterisation-----------///////

	@Given("user is on simple demo form homepage to validate data parameterisation")
	public void user_is_on_simple_demo_form_homepage_to_validate_data_parameterisation() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		
	}

	@When("^user enters value (.+) and (.+)$")
	public void user_enters_value_and(String first, String second) throws Throwable {

		driver.findElement(By.cssSelector("input#sum1")).sendKeys(first);
		driver.findElement(By.cssSelector("input#sum2")).sendKeys(second);
	}

	@When("clicks on GetTotal button")
	public void clicks_on_GetTotal_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='button' and text()='Get Total']")).click();
	}

	@Then("user should see the totalSum")
	public void user_should_see_the_totalSum() {
		// Write code here that turns the phrase above into concrete actions
		String sum = driver.findElement(By.id("displayvalue")).getText();

		System.out.println("Sum is :"+sum);
		driver.close();
	}
	
	//////////-----------6 DataTable------
	  @When("^user enters below value$")
	    public void user_enters_below_value(DataTable dt) throws Throwable {
		List<List<String>> str =  dt.asLists();
		str.get(0).get(0);
		str.get(0).get(1);
		System.out.println(str.get(0).get(0));
		System.out.println(str.get(0).get(1));
		
		driver.findElement(By.cssSelector("input#sum1")).sendKeys(str.get(0).get(0));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#sum2")).sendKeys(str.get(0).get(1));
		
	      
	    }
}
