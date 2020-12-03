package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/main/java/features/CreateLead.feature"} , glue = {"StepDefinition" } , monochrome = true )

public class RunTest extends AbstractTestNGCucumberTests {

	 
		

	}


