package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = ".//Features/LoginFeature.feature",
			glue  = "StepDefination",
			dryRun = true,
			monochrome = true,
			plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"html:target/Cucumber-Reports/report.html",
					"json:target/Cucumber-Reports/report_json.json"
				}
			
		)

public class Run {

}
