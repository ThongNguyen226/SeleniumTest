package tests.google;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import pages.google.GoogleResultsPage;
import pages.google.GoogleSearchPage;
import utils.common.TestBase;

import com.google.inject.Inject;

import data.trello.NewBoardData;

public class Search extends TestBase {

	@Inject
	GoogleSearchPage searchPage;

	@Inject
	GoogleResultsPage resultsPage;

	@Inject
	NewBoardData newBoardData;

	@Test
	public void TC001() {
		searchPage.search("LogiGear");
		assertTrue(resultsPage.getFirstResultTitle().contains("LogiGear"));
	}
}
