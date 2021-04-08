package phoneixAutomationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/main/resources/features/PhoenixAutomationTest.feature"},
		glue= {"phoneixAutomationSD"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				
		}
		
		
		
		)

public class RunPhoneixAutomationTest {

}
