package src.uitap.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class VisibilityPage {
	private final Page page;
	
	Locator hideButton;
	Locator removedButton;
	Locator zeroWidthButton;
	Locator overlappedButton;
	Locator opacity0Button;
	Locator visibilityHiddenButton;
	Locator displayNoneButton;
	Locator offScreenButton;
	public Locator hiddenVerification;
	
	public VisibilityPage(Page page) {
		this.page = page;
		this.hideButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Hide"));
		this.removedButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Removed"));
		this.zeroWidthButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Zero Width"));
		this.overlappedButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Overlapped"));
		this.opacity0Button = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Opacity 0"));
		this.visibilityHiddenButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visibility Hidden"));
		this.displayNoneButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Display None"));
		this.offScreenButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Offscreen"));
		//this.hiddenVerification = page.locator(")
	}
	
	public void testVisbility() {
		hideButton.press("Enter");
     

	}
	

}
