package src.uitap.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import src.uitap.pagebase.PageBase;
import src.uitap.pages.ScrollBarPage;
import src.uitap.testbase.TestBase;

public class ScrollBarTest extends TestBase{
	@Test
	void testScrollButton() {
		ScrollBarPage scrollBarPage = new ScrollBarPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("http://uitestingplayground.com/scrollbars");
		scrollBarPage.testScrolling();
		assertThat(scrollBarPage.button).isEnabled();
	}

}
