package utils.common;

import utils.helper.PropertiesHelper;

public class Constants {

	public static final String BROWSER_SETTING_FILE = "src/test/resources/browsers.setting.properties";
	public static final String TRELLO_USER_NAME = PropertiesHelper.getPropValue("profile.user.name");
	public static final String TRELLO_PASSWORD = PropertiesHelper.getPropValue("profile.user.password");
}
