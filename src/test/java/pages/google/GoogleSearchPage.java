package pages.google;

import com.logigear.control.common.imp.TextBox;

public class GoogleSearchPage {
	private TextBox googleSearchTextBox = new TextBox("name=q");
	
	/**
	 * Search a keyword on google
	 * @param keyword
	 *            the value that you need to search
	 */
	public void search(String keyword) {
		googleSearchTextBox.waitForDisplay();
		googleSearchTextBox.enter(keyword);
		googleSearchTextBox.submit();
	}
}
