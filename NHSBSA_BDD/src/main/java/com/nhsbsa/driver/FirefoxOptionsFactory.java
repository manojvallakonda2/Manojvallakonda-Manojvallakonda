package com.nhsbsa.driver;

import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Arrays;

class FirefoxOptionsFactory {

	FirefoxOptions build(){

        FirefoxOptions optionsFirefox = new FirefoxOptions();
        optionsFirefox.addArguments("start-maximized");
        optionsFirefox.addArguments("lang=pt-BR");
        optionsFirefox.setCapability("firefox.switches", Arrays.asList("--ignore-certificate-errors,--web-security=false,--ssl-protocol=any,--ignore-ssl-errors=true"));
        optionsFirefox.setAcceptInsecureCerts(true);

       return optionsFirefox;
    }
}
