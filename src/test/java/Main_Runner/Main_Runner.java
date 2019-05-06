package Main_Runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/features",
        glue= {"Step_Definitions"},
        plugin = { "pretty", "html:target/cucumber/reports" },
        monochrome = true
)

public class Main_Runner {
}
