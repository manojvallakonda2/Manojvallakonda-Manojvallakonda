package com.nhsbsa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

class MozilaLocalDriverFactory{

    private FirefoxOptions  fireFoxOptions;

    MozilaLocalDriverFactory(FirefoxOptions fireFoxOptions) {
        this.fireFoxOptions = fireFoxOptions;
    }

    WebDriver driver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(fireFoxOptions);
    }
}
