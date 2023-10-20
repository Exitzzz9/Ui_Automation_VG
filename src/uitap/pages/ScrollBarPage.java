package src.uitap.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ScrollBarPage {
	private final Page page;
	
	public Locator button;
	
	public ScrollBarPage (Page page) {
		this.page = page;
		this.button = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Hiding Button"));
	}

	public void testScrolling() {
        button.scrollIntoViewIfNeeded();
	

	}
}
