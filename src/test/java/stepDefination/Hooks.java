package stepDefination;

import CucumberPractice.BasePageObject;
import io.cucumber.java.After;

public class Hooks extends BasePageObject {
	
	@After("@MainTest")
	public void tearDown() {
		
		driver.close();
		
	}

}
