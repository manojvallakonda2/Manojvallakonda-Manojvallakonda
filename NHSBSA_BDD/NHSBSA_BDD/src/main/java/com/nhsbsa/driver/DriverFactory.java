package com.nhsbsa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	MozilaLocalDriverFactory firefoxLocalDriverFactory;
	ChromeLocalDriverFactory chromeLocalDriverFactory;
	String expectedDriver = System.getProperty("driver");

	public DriverFactory() {
		if (this.expectedDriver.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptionsFactory().build();
			chromeLocalDriverFactory = new ChromeLocalDriverFactory(chromeOptions);
			chromeOptions.setHeadless(false);
		} else if (this.expectedDriver.equalsIgnoreCase("firefox")) {
			FirefoxOptions fireFoxOptions = new FirefoxOptionsFactory().build();
			firefoxLocalDriverFactory = new MozilaLocalDriverFactory(fireFoxOptions);

		}
	}

	public WebDriver createInstance() {
		WebDriver driver = null;
		if (this.expectedDriver.equalsIgnoreCase("chrome")) {
			driver = chromeLocalDriverFactory.driver();
		} else if (this.expectedDriver.equalsIgnoreCase("firefox")) {
			driver = firefoxLocalDriverFactory.driver();
		}
		return driver;

	}
}
