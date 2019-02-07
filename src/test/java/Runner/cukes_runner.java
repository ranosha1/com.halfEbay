package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "./src/test/resources/features", plugin = "html:target/cucumber-reports", glue = "stepDef", dryRun = false
// tags = { "@Smoky" }

)

public class cukes_runner {

}
