package co.com.ubits.certificacion.automation.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.ubits.certificacion.automation.userinterface.LogPageIU.LABEL_MANAGER;
import static co.com.ubits.certificacion.automation.util.constants.AnswerWait.LABEL_ROL_MANAGER;
import static co.com.ubits.certificacion.automation.util.constants.Url.QA_ENVIRONMENT;
import co.com.ubits.certificacion.automation.exceptions.ExceptionLogAccount;

import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import co.com.ubits.certificacion.automation.model.LoginData;
import co.com.ubits.certificacion.automation.questions.Answer;
import co.com.ubits.certificacion.automation.tasks.ToLogPage;
import co.com.ubits.certificacion.automation.util.driver.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginAccount {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^user is the home page$")
	public void userIsTheHomePage() {
		theActorCalled("User");
		theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().inPage(QA_ENVIRONMENT)));
	}

	@When("^user enter of userame and password$")
	public void userEnterOfUserameAndPassword(List<LoginData> data) {
		theActorInTheSpotlight().attemptsTo(ToLogPage.with(data));
	}

	@Then("^user can see welcome$")
	public void userCanSeeWelcome() {
		theActorInTheSpotlight().should(seeThat(Answer.is(LABEL_MANAGER), equalTo(LABEL_ROL_MANAGER))
				.orComplainWith(ExceptionLogAccount.class));
	}

}