package utils.config;

import com.google.inject.Binder;
import com.google.inject.Module;
import data.trello.NewBoardData;
import pages.google.GoogleResultsPage;
import pages.google.GoogleSearchPage;
import pages.trello.BoardDetailsPage;
import pages.trello.PersonalBoardsPage;
import pages.trello.TrelloLoginPage;

public class ModuleFactory implements Module {

	@Override
	public void configure(Binder binder) {

		// Bind Page google object
		binder.bind(GoogleSearchPage.class);
		binder.bind(GoogleResultsPage.class);

		// Bind Page Trello object
		binder.bind(TrelloLoginPage.class);
		binder.bind(PersonalBoardsPage.class);
		binder.bind(BoardDetailsPage.class);

		// Bind test data
		binder.bind(NewBoardData.class);
	}
}
