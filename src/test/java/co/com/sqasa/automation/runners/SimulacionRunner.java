package co.com.sqasa.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/simulacion.feature",
        glue = "co.com.sqasa.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SimulacionRunner {
}
