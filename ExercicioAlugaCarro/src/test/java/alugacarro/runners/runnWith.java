package alugacarro.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featurealugacarro.feature",
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE,
		glue = "alugacarro.steps",
		dryRun = false
)
public class runnWith {

}
