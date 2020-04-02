package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "stepDefinitions",
        tags = "@Register"
)

public class ThirdRunner extends AbstractTestNGCucumberTests {

}
