package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\java\\features\\",
    glue = "src\\test\\java\\stepDefinitions\\",
    tags = "@Activity2"
)

public class ActivitiesRunner {
    //empty
}
