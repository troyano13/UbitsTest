package co.com.ubits.certificacion.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "resources/features/to_login_account.feature", glue = "co.com.ubits.certificacion.automation.stepdefinitions",
snippets = SnippetType.CAMELCASE)

public class LoginAccount {

}