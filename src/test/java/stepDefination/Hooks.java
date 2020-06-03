package stepDefination;

import CucumberPractice.BasePageObject;
import io.cucumber.java.After;

public class Hooks extends BasePageObject {
	
	@After("@CucuSmokeTest")
	public void tearDown() {
		
		driver.close();
		
	}
	@After("@CucuParameterTest")
	public void tearDown01() {
		
		driver.close();
		
	}
	@After("@CucuDataDrivenTest")
	public void tearDown02() {
		
		driver.close();
		
	}

}
