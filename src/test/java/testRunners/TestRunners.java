package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse\\SeleniumProject\\src\\test\\java\\featureFile\\EditLoaDetails.feature",
				glue = {"stepDefinitions","hooks"}, dryRun = false,
				publish = true,
				plugin = { "pretty",                                // human-readable console output
				        "html:target/cucumber-reports.html",     // HTML report
							})
public class TestRunners {
	

}
