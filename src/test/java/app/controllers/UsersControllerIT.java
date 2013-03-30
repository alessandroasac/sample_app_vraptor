package app.controllers;

import org.junit.Test;

public class UsersControllerIT extends BaseTestController {

	@Test
	public void homePageTest() {
		visit("/signup");
		shouldHaveSelector("h1", "Sign up");
		shouldHaveSelector("title", fullTitle("Sign up"));
	}
}