package src.uitap.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProgressBarPage {
	
	private final Page page;
	
	Locator startButton; 
	Locator stopButton;
	public Locator progressBar;
	
	public ProgressBarPage(Page page) {
		this.page = page;
		this.startButton = page.locator("#startButton");
		this.stopButton = page.locator("#stopButton");
		this.progressBar = page.locator("#progressbar");
	}
		
	public void testProgressBar() {
	startButton.click();
	// Wait for the progress bar to reach 75%
   
	
	}

  

	}


