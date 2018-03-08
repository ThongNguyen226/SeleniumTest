package pages.trello;

import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.TextBox;

public class TrelloLoginPage {

	private TextBox usernameTextbox = new TextBox("id=user");
	private TextBox passwordTextbox = new TextBox("id=password");
	private Button loginButton = new Button("id=login");

	public void login(String userName, String password) {
		usernameTextbox.waitForDisplay();
		usernameTextbox.enter(userName);
		passwordTextbox.enter(password);
		loginButton.clickByJs();
	}
}
