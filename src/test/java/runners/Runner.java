package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //path to our features package
        features = "src/test/resources/features",
        //path to our step_definitions package
        glue = "step_definitions",
        tags = "@regression and @login",
        dryRun = false,
        monochrome = false
)
public class Runner {



}
