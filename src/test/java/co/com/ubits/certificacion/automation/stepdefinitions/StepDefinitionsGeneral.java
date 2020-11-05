package co.com.ubits.certificacion.automation.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.ubits.certificacion.automation.util.constants.Url.QA_ENVIRONMENT;

import co.com.ubits.certificacion.automation.util.driver.MyDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

public class StepDefinitionsGeneral {

	public void setUp() {
		setTheStage(new Cast());
		theActorCalled("user");
		theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().inPage(QA_ENVIRONMENT)));

	}
}