package co.com.sanangel.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
glue = "co.com.sanangel.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)



public class LoginRunner {
}
