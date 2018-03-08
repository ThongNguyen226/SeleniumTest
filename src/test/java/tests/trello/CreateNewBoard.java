package tests.trello;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.trello.BoardDetailsPage;
import pages.trello.PersonalBoardsPage;
import pages.trello.TrelloLoginPage;
import utils.common.Constants;
import utils.common.TestBase;
import utils.helper.Logger;

import com.google.inject.Inject;

import data.trello.NewBoardData;

public class CreateNewBoard extends TestBase {

	@Inject
	TrelloLoginPage loginPage;

	@Inject
	NewBoardData newBoardData;

	@Inject
	PersonalBoardsPage personalBoardsPage;

	@Inject
	BoardDetailsPage boardDetailsPage;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		newBoardData = newBoardData.getData();
	}

	@Test (description = "")
	public void TC001() {
		Logger.info("1. Login to Trello");
		loginPage.login(Constants.TRELLO_USER_NAME, Constants.TRELLO_PASSWORD);

		Logger.info("2. Create new board");
		personalBoardsPage.createNewBoard(newBoardData);

		Logger.verify("Verify the board is created");
		assertEquals(boardDetailsPage.getBoardName(), newBoardData.getTitle());
		boardDetailsPage.deleteBoard();
	}
	
	@Test (description = "")
	public void TC002() {
		Logger.info("1. Login to Trello");
		loginPage.login(Constants.TRELLO_USER_NAME, Constants.TRELLO_PASSWORD);

		Logger.info("2. Create new board");
		personalBoardsPage.createNewBoard(newBoardData);

		Logger.verify("Verify the board is not created");
		assertEquals(boardDetailsPage.getBoardName(), newBoardData.getTitle()  + " - falied");
		boardDetailsPage.deleteBoard();
	}
}
