package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = {
				"src/test/java/Features/addToCart.feature",
				"src/test/java/Features/Registration_Negative.feature"}, 
				dryRun = !true,  
				glue = {"StepDefinition","hooks"},
				snippets = SnippetType.CAMELCASE,
				monochrome = true,
				plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

)

public class Runner extends AbstractTestNGCucumberTests {

}
