package src.uitap.test;

import org.junit.jupiter.api.Test;

import src.uitap.pagebase.PageBase;
import src.uitap.pages.ProgressBarPage;
import src.uitap.testbase.TestBase;

public class ProgressBarTest extends TestBase {

	@Test
	void testInputField() {
		ProgressBarPage progressBarPage = new ProgressBarPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("http://uitestingplayground.com/progressbar");
		progressBarPage.testProgressBar();
	}
}
