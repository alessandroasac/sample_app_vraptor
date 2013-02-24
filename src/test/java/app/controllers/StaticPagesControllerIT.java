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
		visit("/staticPages/home");
		shouldHaveSelector("h1", "Sample App");
		shouldHaveSelector("title", "VRaptor Sample App | Home");
	}

	@Test
	public void helpPageTest() {
		visit("/staticPages/help");
		shouldHaveSelector("h1", "Help");
		shouldHaveSelector("title", "VRaptor Sample App | Help");
	}

	@Test
	public void aboutPageTest() {
		visit("/staticPages/about");
		shouldHaveSelector("h1", "About Us");
		shouldHaveSelector("title", "VRaptor Sample App | About Us");
	}

	@Test
	public void contactPageTest() {
		visit("/staticPages/contact");
		shouldHaveSelector("h1", "Contact");
		shouldHaveSelector("title", "VRaptor Sample App | Contact");
	}
}