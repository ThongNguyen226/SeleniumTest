package pages.trello;

import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.Label;
import com.logigear.control.common.imp.Link;
import com.logigear.driver.DriverUtils;

public class BoardDetailsPage extends TrelloGeneralPage {

	private Label boardName = new Label("//div[@id='content']//span[contains(@class,'board-header')]");
	private Link moreLink = new Link("//a[contains(.,'%s')]");

	private Link closeBoardLink = new Link("//a[contains(.,'Close Board')]");
	private Button closeBoardConfirmationButton = new Button("//input[@value='Close']");
	private Link permanentlyDeleteBoardLink = new Link("//a[contains(.,'Permanently Delete Board')]");
	private Button deleteBoardConfirmationButton = new Button("//input[@value='Delete']");

	/**
	 * get board name
	 * @return name of board
	 */
	public String getBoardName() {
		boardName.waitForDisplay();
		return boardName.getText();
	}

	public void deleteBoard() {
		DriverUtils.setWaitForAjax(false);
		moreLink.setDynamicValue("More");
		moreLink.waitForDisplay();
		moreLink.click();
		closeBoardLink.click();
		closeBoardConfirmationButton.click();
		permanentlyDeleteBoardLink.click();
		deleteBoardConfirmationButton.click();
	}
}
