package Step_Definitions;

import Base.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(strict = false,
        features = "src/test/resources",
        plugin = {"pretty", "json:target/cucumber.json"},
        tags = {"~@ignore"} )
@RunWith(Cucumber.class)

 RunnerClass
public class RunnerClass extends TestBase {

}