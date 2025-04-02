package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//features_2"},
				 glue= {"stepdef_2"},
				 plugin= {"pretty","html:target/htmlreports/report.html"},
				 tags= "@set3"
		)

public class TestRunner_2 extends AbstractTestNGCucumberTests{
	
}
