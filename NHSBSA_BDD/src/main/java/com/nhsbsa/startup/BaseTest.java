package com.nhsbsa.startup;

import static com.nhsbsa.startup.PropertyLoader.returnConfigValue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.nhsbsa.driver.DriverFactory;
import com.nhsbsa.page.GetHelpPage;
import com.nhsbsa.report.ReportListener;

@Listeners({ ExtentITestListenerClassAdapter.class, ReportListener.class })
public class BaseTest {

	public static WebDriver driver;
	public static GetHelpPage getHelpPage;

	public static WebDriver getDriver() {
		return driver;
	}

	public void preCondition() {
		driver = new DriverFactory().createInstance();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(returnConfigValue("url.base"));
		getHelpPage = new GetHelpPage(driver);

	}

	public void postCondition() {
		driver.quit();
	}
}