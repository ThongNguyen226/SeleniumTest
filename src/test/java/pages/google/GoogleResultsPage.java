package pages.google;

import com.logigear.control.common.imp.Link;

public class GoogleResultsPage {

	private Link firstResult = new Link("//div[@class='g']//h3/a");

	public String getFirstResultTitle() {
		firstResult.waitForDisplay();
		return firstResult.getText();
	}
}
