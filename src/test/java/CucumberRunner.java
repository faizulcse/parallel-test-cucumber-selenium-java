
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepsdef"},
        tags = "@test-2 or @test-1",
        plugin = {"pretty", "html:target/cucumber-html", "json:target/cucumber.json"}
)

@RunWith(Cucumber.class)
public class CucumberRunner {

}