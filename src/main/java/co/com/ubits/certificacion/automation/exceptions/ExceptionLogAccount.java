package co.com.ubits.certificacion.automation.exceptions;

public class ExceptionLogAccount extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionLogAccount(String message, Throwable cause) {
		super(co.com.ubits.certificacion.automation.util.constants.ExceptionMessages.ERROR_LOGIN, cause);
	}
}

