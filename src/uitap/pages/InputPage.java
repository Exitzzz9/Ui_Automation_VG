package src.uitap.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class InputPage {
	private final Page page;
	
	Locator inputField;
	Locator button;
	
	public InputPage(Page page) {
		this.page = page;
		this.inputField = page.getByPlaceholder("MyButton");
		this.button = page.locator("#updatingButton");
	}
	
	public void testInput () {
		for (int i = 0; i < 5; i++) {
			inputField.fill("Hello");
			button.click();
			inputField.fill("World");
			button.click();
		}
	}
}
		
