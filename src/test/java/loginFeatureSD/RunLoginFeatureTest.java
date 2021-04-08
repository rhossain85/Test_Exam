package loginFeatureSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/main/resources/features/LoginFeature.feature"},
		glue= {"loginFeatureSD"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				
		}
		
		
		
		)

public class RunLoginFeatureTest {

}
