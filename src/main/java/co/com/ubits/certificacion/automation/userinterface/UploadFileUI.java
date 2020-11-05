package co.com.ubits.certificacion.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UploadFileUI {

	public static final Target BTN_GO_TO_IOMAD = Target.the("button go to iomad")
			.locatedBy("//button[@class='btn pull-xs-left btn-secondary linesbutton sm-drawer-btn']");
	public static final Target LABEL_PRIVATE_FILES = Target.the("labe to select fle private")
			.locatedBy("//*[@id='nav-drawer']/nav[1]/a[4]/div/div/span[2]");
	public static final Target BTN_ADD_FILE = Target.the("Button to add file").locatedBy("[title='Add...']");
	public static final Target BTN_SELECT_FILE = Target.the("Button to select file").locatedBy("[type='file']");
	public static final Target TXT_SAVE_AS = Target.the("txt save as").locatedBy("//*[@name='title']");
	public static final Target SELECT_CHOOSE_LICENSE = Target.the("Llist select choose liscense")
			.locatedBy("(//select[@class='custom-select form-control'])[1]//*[contains(text(),{0})]");
	public static final Target BUTTON_UPLOAD_THIS_FILE = Target.the("Button upload this file")
			.locatedBy("//*[@name='title']");
	public static final Target LABEL_MESSAGE_ERROR_UPLOAD = Target.the("Message upload file")
			.locatedBy("//*[@id='moodle-dialogue-yui_3_17_2_1_1604545340392_977-wrap-header-text']");
	public static final Target LB_SAVE_CHANGES = Target.the("save changes")
			.locatedBy("//*[@id='yui_3_17_2_1_1604555540770_319']");

	private UploadFileUI() {

	}
}
