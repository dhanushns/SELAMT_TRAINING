package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features = {"src//test//resource//features"},
				  glue= {"stepdef"},
				  plugin= {"pretty","html:target/htmlreports/report.html"},
				  tags= "@set1"
				  )	

public class Runner extends AbstractTestNGCucumberTests {

}
