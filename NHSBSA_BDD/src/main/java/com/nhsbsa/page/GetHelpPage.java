package com.nhsbsa.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhsbsa.utils.WaitElement;

public class GetHelpPage {

	private WebDriver driver;

	public GetHelpPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//button[text()=\"I'm OK with analytics cookies\"]")
	public WebElement btnAllowCookies;

	@FindBy(xpath = ".//input[@id='next-button']")
	public WebElement btnStart;

	@FindBy(xpath = ".//*[@class='form-date']//input")
	public List<WebElement> formDate;

	@FindBy(xpath = ".//input[@value='No']")
	public List<WebElement> ansNO;
	
	@FindBy(xpath = ".//input[contains(@value,'Yes') or contains(@value,'YES')]")
	public List<WebElement> ansYes;

	@FindBy(xpath = ".//h1[@id='result-heading']|.//h2[@class='heading-large']")
	public WebElement lblResultHeading;

	private void customXpath(String fieldName, String value) {
		By by = By.xpath(".//*[@id='" + fieldName + "']//input[@value='" + value + "']");
		WaitElement.waitPresenceOf(driver, by);
		WebElement element = driver.findElement(by);
		element.click();
		btnStart.click();
	}

	public void enterCountryDetails(String value) {
		customXpath("livingCountry_fieldset", value);

	}

	public void enterPracticeDetails(String value) {
		customXpath("gpPracticeInScotlandOrWales_fieldset", value);

	}

	public void enterDentalPracticeCountry(String value) {
		customXpath("dentalPracticeCountry_fieldset", value);

	}

	public void isLivedWithPartner(String value) {
		customXpath("partner_fieldset", value);

	}

	public void selectAllNegative() {
		int count=0;int MaxCount=20;
		while (ansNO.size() == 1) {
			    ansNO.get(0).click();
				btnStart.click();
				if(count==MaxCount)
				{
					break;
				}
			count++;
		}
	}
	
	public void selectAllPositive() {
		int count=0;int MaxCount=20;
		while (ansYes.size() == 1) {
			ansYes.get(0).click();
				btnStart.click();
				if(count==MaxCount)
				{
					break;
				}
			count++;
		}
	}

	public void enterDateOfBirth(String day, String month, String year) {
		formDate.get(0).click();
		formDate.get(0).sendKeys(day);
		formDate.get(1).click();
		formDate.get(1).sendKeys(month);
		formDate.get(2).click();
		formDate.get(2).sendKeys(year);
		btnStart.click();

	}

}
