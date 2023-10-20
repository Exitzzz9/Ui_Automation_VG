package src.uitap.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import src.uitap.pagebase.PageBase;
import src.uitap.pages.VisibilityPage;
import src.uitap.testbase.TestBase;

public class VisbilityTest extends TestBase{
	@Test
	void testVisibilityButton() {
		VisibilityPage visibilityPage = new VisibilityPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("http://uitestingplayground.com/visibility");
		visibilityPage.testVisbility();
	
		
		assertThat(page.locator("#hidingLayer")).isVisible();
		
	}

}
