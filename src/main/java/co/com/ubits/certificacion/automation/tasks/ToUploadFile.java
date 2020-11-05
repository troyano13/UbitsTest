package co.com.ubits.certificacion.automation.tasks;

import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.BTN_ADD_FILE;
import static co.com.ubits.certificacion.automation.util.constants.WaitTime.DIEZ;
import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.BUTTON_UPLOAD_THIS_FILE;
import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.LABEL_PRIVATE_FILES;
import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.TXT_SAVE_AS;
import static co.com.ubits.certificacion.automation.util.constants.DataForms.COMENTARIO;
import static co.com.ubits.certificacion.automation.util.constants.DataForms.DIRECTORIO_USUARIO;
import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.SELECT_CHOOSE_LICENSE;
import static co.com.ubits.certificacion.automation.util.constants.DataForms.RUTA;
import static co.com.ubits.certificacion.automation.userinterface.UploadFileUI.BTN_GO_TO_IOMAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.com.ubits.certificacion.automation.interactions.WaitInteraction;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ToUploadFile implements Task {
	private String license;
	public final WebDriver driver;
	String path = System.getProperty(DIRECTORIO_USUARIO) + RUTA;

	public ToUploadFile(String license) {
		driver = Serenity.getWebdriverManager().getCurrentDriver();
		this.license = license;
	}

	public static ToUploadFile with(String license) {
		return instrumented(ToUploadFile.class, license);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitInteraction.waitClass(DIEZ), WaitUntil.the(BTN_GO_TO_IOMAD, isVisible()),
				Click.on(BTN_GO_TO_IOMAD), WaitUntil.the(LABEL_PRIVATE_FILES, isVisible()),
				Click.on(LABEL_PRIVATE_FILES), WaitInteraction.waitClass(DIEZ), Click.on(BTN_ADD_FILE),
				WaitInteraction.waitClass(DIEZ));

		WebElement element = driver.findElement(By.name("repo_upload_file"));
		element.sendKeys(path);

		actor.attemptsTo(Enter.theValue(COMENTARIO).into(TXT_SAVE_AS), Click.on(SELECT_CHOOSE_LICENSE.of(license)),
				WaitInteraction.waitClass(DIEZ), Click.on(BUTTON_UPLOAD_THIS_FILE));
	}
}