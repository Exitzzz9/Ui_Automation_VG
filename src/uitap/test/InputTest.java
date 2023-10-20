package src.uitap.test;

import org.junit.jupiter.api.Test;

import src.uitap.pagebase.PageBase;
import src.uitap.pages.InputPage;
import src.uitap.testbase.TestBase;

public class InputTest extends TestBase{
	@Test
	void testInputField() {
		InputPage inputPage = new InputPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("http://uitestingplayground.com/textinput?");
		inputPage.testInput();
	}
}
