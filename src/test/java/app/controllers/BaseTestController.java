package app.controllers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public abstract class BaseTestController {

	private WebDriver browser;

	@Before
	public void setUp() {
		browser = new HtmlUnitDriver(false);
		// browser = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		browser.quit();
	}

	protected String fullTitle(String title) {
		return "VRaptor Sample App | " + (title != null ? title : "");
	}

	protected void shouldHaveSelector(String selector, String text) {
		assertTrue(String.format("There is no selector '%s' with text '%s'",
				selector, text), hasSelector(selector, text));
	}

	protected void shouldNotHaveSelector(String selector, String text) {
		assertFalse(String.format("There is selector(s) '%s' with text '%s'",
				selector, text), hasSelector(selector, text));
	}

	protected boolean hasSelector(String selector, String text) {
		boolean result = false;
		try {
			List<WebElement> elements = browser.findElements(By.cssSelector(selector));

			for (WebElement element : elements) {
				if ((result = element.getText().contains(text))) {
					break;
				}
			}
			
		} catch (NoSuchElementException e) {
			// DO NOTHING
		}
		return result;
	}

	protected void visit(String path) {
		browser.get("http://localhost:8080" + path);
	}

	protected void clickLink(String linkText) {
		WebElement element = browser.findElement(By.linkText(linkText));
		element.click();
	}

	protected void signIn(String email, String password) {
		browser.findElement(By.id("email")).sendKeys(email);
		WebElement element = browser.findElement(By.id("password"));
		element.sendKeys(password);
		element.submit();
	}
	
	protected void clickFormButton(String buttonText) {
		WebElement element = browser.findElement(By.cssSelector(String.format(
				"form input[value='%s']", buttonText)));
		element.click();
	}

}
