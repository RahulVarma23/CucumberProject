package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"@target/rerun.txt"},
		glue="stepDefination",
		dryRun=false,
		monochrome = true,
		strict=true,
		//plugin= {"pretty", "html:target/cucumber-report"},
		plugin= {"pretty","html:target/cucumber-report" ,
				"junit:target/cucumber-results.xml",
				"rerun:target/rerun.txt"				
				}
		)

public class FailedScenarios {

}
