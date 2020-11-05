package co.com.ubits.certificacion.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LogPageIU {

	public static final Target TXT_USURNAME = Target.the("TXT to write username").locatedBy(
			"(//*[contains(text(),'Login ')]//ancestor::div//descendant::div[@class='form-group fa_pwdcion_container']//input)[1]");
	public static final Target TXT_PASSWORD = Target.the("TXT to write password").locatedBy(
			"(//*[contains(text(),'Login ')]//ancestor::div//descendant::div[@class='form-group fa_pwdcion_container']//input)[2]");
	public static final Target BTN_SING_IN = Target.the("Button to go to login").locatedBy("//*[@id='loginbtn']");
	public static final Target LABEL_MANAGER = Target.the("Button to go to login")
			.locatedBy("//*[@id='dropdown-1']/span/span[1]");

	private LogPageIU() {

	}
}
