

package com.ui.automation.runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "./src/test/java/com/ui/automation/features/Testfeature.feature",
	glue = {"com.ui.automation.stepdefinition"},
	plugin = {"pretty", "html:target/cucumber-reports.html"},
	strict = false)

	public class Testrunner {
		
	
}
