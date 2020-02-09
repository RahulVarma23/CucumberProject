package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(
		features=".//src//test//java//feature//Scenarios.feature",
		glue="stepDefination",
		dryRun=false,
		monochrome = true,
		strict=true,
		plugin= {"pretty","html:target/cucumber-report" ,
				"usage:target/cucumber-report.json",
				"junit:target/cucumber-results.xml",
				"rerun:target/rerun.txt"				
				}
		)

public class TestRunner {

}
