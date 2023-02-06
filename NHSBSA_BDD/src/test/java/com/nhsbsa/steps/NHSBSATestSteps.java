package com.nhsbsa.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import com.nhsbsa.startup.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NHSBSATestSteps extends BaseTest {
	private static final Logger LOGGER = LogManager.getLogger();

	@Before
	public void setUp() {
		preCondition();
	}

	@Given("I am a citizen of the UK")
	public void validatePageTitle() throws InterruptedException {
		LOGGER.info("Verifying the page title");
		Assert.assertEquals(driver.getTitle().trim(), "Check what help you could get to pay for NHS costs - NHSBSA",
				"Page title not matched");
		LOGGER.info("Verifying I am a UK citizen");
		Assert.assertTrue(driver.getCurrentUrl().trim().contains("nhs.uk"), "I am not UK citizen");
	}

	@Then("I put my circumstances into the Checker tool for negative answers")
	public void enterDetailsForNoValue() throws InterruptedException {

		LOGGER.info("Putting my circumstances into the Checker tool");
		getHelpPage.btnAllowCookies.click();
		getHelpPage.btnStart.click();
		getHelpPage.enterCountryDetails("ENGLAND");
		getHelpPage.enterPracticeDetails("No");
		getHelpPage.enterDentalPracticeCountry("ENGLAND");
		getHelpPage.enterDateOfBirth("14", "02", "1990");
		getHelpPage.selectAllNegative();
		LOGGER.info("All input details shared to get help for NHS cost");
}

	@Then("I should get a result of whether I will get help or not for negative answers")
	public void validateUserEligibleForHelpForNoValue() throws InterruptedException {
		LOGGER.info("Checking the result");
		String expectedText = "You could get help to pay for your NHS costs";
		Assert.assertTrue(getHelpPage.lblResultHeading.getAttribute("innerText").contains(expectedText),"Wrong Text information in UI");
		LOGGER.info("I am eligible to get help");
	}
	
	@Then("I put my circumstances into the Checker tool for positive answers")
	public void enterDetailsForYesValue() throws InterruptedException {

		LOGGER.info("Putting my circumstances into the Checker tool");
		getHelpPage.btnAllowCookies.click();
		getHelpPage.btnStart.click();
		getHelpPage.enterCountryDetails("ENGLAND");
		getHelpPage.enterPracticeDetails("Yes");
		getHelpPage.enterDentalPracticeCountry("ENGLAND");
		getHelpPage.enterDateOfBirth("14", "02", "1990");
		getHelpPage.selectAllPositive();
		LOGGER.info("All input details shared to get help for NHS cost");
}

	@Then("I should get a result of whether I will get help or not for positive answers")
	public void validateUserEligibleForHelpForYesValue() throws InterruptedException {
		LOGGER.info("Checking the result");
		String expectedText = "You get help with NHS costs";
		Assert.assertTrue(getHelpPage.lblResultHeading.getAttribute("innerText").contains(expectedText),"Wrong Text information in UI");
		LOGGER.info("I am eligible to get help");
	}

	@After
	public void tearDown() {
		postCondition();
	}

}
