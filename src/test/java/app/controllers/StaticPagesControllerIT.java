package app.controllers;

import org.junit.Test;

/**
 * Tests to {@link StaticPagesController}.
 * 
 * @author alessandro
 * 
 */
public class StaticPagesControllerIT extends BaseTestController {

	@Test
	public void homePageTest() {
		visitRootPath();
		shouldHaveSelector("h1", "Sample App");
		shouldHaveSelector("title", fullTitle("Home"));
	}

	@Test
	public void helpPageTest() {
		visit("/help");
		shouldHaveSelector("h1", "Help");
		shouldHaveSelector("title", fullTitle("Help"));
	}

	@Test
	public void aboutPageTest() {
		visit("/about");
		shouldHaveSelector("h1", "About Us");
		shouldHaveSelector("title", fullTitle("About Us"));
	}

	@Test
	public void contactPageTest() {
		visit("/contact");
		shouldHaveSelector("h1", "Contact");
		shouldHaveSelector("title", fullTitle("Contact"));
	}
}