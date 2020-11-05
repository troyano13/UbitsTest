package co.com.ubits.certificacion.automation.stepdefinitions;

import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.LB_SAVE_CHANGES;
import static co.com.ubits.certificacion.automation.util.constants.AnswerWait.LABEL_SAVE_CHANGES;
import static co.com.ubits.certificacion.automation.util.constants.DataLoginConts.PASSWORD;
import static co.com.ubits.certificacion.automation.util.constants.DataLoginConts.USER_MANAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.ubits.certificacion.automation.exceptions.ExceptionUploadFile;
import co.com.ubits.certificacion.automation.questions.Answer;
import co.com.ubits.certificacion.automation.tasks.ToLogPage;
import co.com.ubits.certificacion.automation.tasks.ToUploadFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadFile extends StepDefinitionsGeneral {

	@Before
	public void config() {
		setUp();
	}

	@Given("^user is login in the home page$")
	public void userIsLoginInTheHomePage() {
		theActorInTheSpotlight().attemptsTo(ToLogPage.withRol(USER_MANAGE, PASSWORD));
	}

	@When("^user upload file and to can select (.*) for Choose license$")
	public void userUploadFiletoAndCanSelectForChooseLicense$(String license) {
		theActorInTheSpotlight().attemptsTo(ToUploadFile.with(license));
	}

	@Then("^user can to see upload file$")
	public void userCanToSeeUploadFile() {
		theActorInTheSpotlight().should(seeThat(Answer.is(LB_SAVE_CHANGES), equalTo(LABEL_SAVE_CHANGES))
				.orComplainWith(ExceptionUploadFile.class));

	}

}