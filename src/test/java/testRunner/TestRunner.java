package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefination",
		tags= {"@CucuParameterTest"},
		monochrome=true,
		plugin= {"pretty","html:target/cucuReport","junit:target/cucuJunitReport.xml"})

public class TestRunner {

}
