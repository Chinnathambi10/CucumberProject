package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",
		monochrome=true,
		plugin = { "pretty", "html:target/cucumber-reports" }
		)
public class TestRunnerTest {
	
	//Other person did this cahnge - uma
	//Other person did this cahnge - neera

}
