package pages.trello;

import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.Link;
import com.logigear.control.common.imp.TextBox;

import data.trello.NewBoardData;

public class TrelloGeneralPage {

	private Button createBoardOrOrganizationButton = new Button(
			"//a[@aria-label='Create Board or Organization']");
	private Link createBoardLink = new Link("//a[contains(.,'Create Board')]");
	private TextBox boardNewTitleTexBox = new TextBox("id=boardNewTitle");
	private Button createButton = new Button("//input[@value='Create']");

	public void createNewBoard(NewBoardData newBoardData) {
		createBoardOrOrganizationButton.waitForDisplay();
		createBoardOrOrganizationButton.click();
		createBoardLink.click();
		boardNewTitleTexBox.enter(newBoardData.getTitle());
		createButton.click();
	}
}
