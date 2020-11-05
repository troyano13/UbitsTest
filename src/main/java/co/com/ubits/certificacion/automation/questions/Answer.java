package co.com.ubits.certificacion.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Answer implements Question<String> {

	private Target mensaje;

	public Answer(Target mensaje) {
		this.mensaje = mensaje;
	}

	public static Answer is(Target mensaje) {
		return new Answer(mensaje);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(mensaje).viewedBy(actor).asString();
	}
}
