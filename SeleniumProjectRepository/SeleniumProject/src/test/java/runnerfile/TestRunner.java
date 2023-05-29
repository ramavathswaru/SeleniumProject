package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Featurefile"},
        glue = {"stepdefenitionfile"},
        tags = "@DropDownTest"
)
public class TestRunner {

}
