package data.trello;

import data.trello.base.DataBase;

public class NewBoardData extends DataBase {

	private static String jsonFile = "src/test/resources/data/new_board_data.json";

	public NewBoardData() {
		super(jsonFile);
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
