package runner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;


@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 0
//detailedReport = false,
//detailedAggregatedReport = false,
//overviewReport = false,
//coverageReport = false,
////jsonUsageReport = "target/cucumber-usage.json",
//usageReport = false,
//toPDF = true,
//outputFolder = "target"
)

@CucumberOptions(
		features=".//src//test//java//feature//Scenarios.feature",
		glue="stepDefination",
		dryRun=false,
		monochrome = true,
		strict=true,
		//plugin= {"pretty", "html:target/cucumber-report"},
		plugin= {"pretty","html:target/cucumber-report" ,
				"usage:target/cucumber-report.json",
				"junit:target/cucumber-results.xml",
				"rerun:target/rerun.txt"				
				}
		)

public class TestRunner {

}
