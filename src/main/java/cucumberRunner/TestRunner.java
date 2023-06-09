package cucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepDefinitions","hooks"},
        plugin = { "pretty", "html:src/main/resources/reports/cucumber.html" },
        tags = "@SmokeTest"
)
public class TestRunner {

}
