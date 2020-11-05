package co.com.ubits.certificacion.automation.exceptions;

public class ExceptionUploadFile extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionUploadFile(String message, Throwable cause) {
		super(co.com.ubits.certificacion.automation.util.constants.ExceptionMessages.ERROR_UPLOAD_FILE, cause);
	}
}

