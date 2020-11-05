package co.com.ubits.certificacion.automation.tasks;

import static co.com.ubits.certificacion.automation.userinterface.LogPageIU.BTN_SING_IN;
import static co.com.ubits.certificacion.automation.userinterface.LogPageIU.TXT_PASSWORD;
import static co.com.ubits.certificacion.automation.userinterface.LogPageIU.TXT_USURNAME;
import static co.com.ubits.certificacion.automation.util.constants.WaitTime.CINCO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.ubits.certificacion.automation.interactions.WaitInteraction;
import co.com.ubits.certificacion.automation.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ToLogPage implements Task {

	private String username;
	private String password;

	public ToLogPage(List<LoginData> data) {
		this.username = data.get(0).getUsername();
		this.password = data.get(0).getPassword();

	}

	public ToLogPage(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public static ToLogPage with(List<LoginData> data) {
		return instrumented(ToLogPage.class, data);
	}

	public static ToLogPage withRol(String username, String password) {
		return instrumented(ToLogPage.class, username, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitInteraction.waitClass(CINCO), Enter.theValue(username).into(TXT_USURNAME),
				Enter.theValue(password).into(TXT_PASSWORD), Click.on(BTN_SING_IN));
	}
}