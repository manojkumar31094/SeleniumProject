package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse\\SeleniumProject\\src\\test\\java\\featureFile",
				glue = {"stepDefinitions","hooks"}, dryRun = false)
public class TestRunners {
	

}
