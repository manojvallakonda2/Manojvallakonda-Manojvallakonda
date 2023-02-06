package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { "src/test/resources/NHSBSA.feature" }, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber.json" }, glue = { "com.nhsbsa.steps" }, strict = true, dryRun = false, 
		monochrome = true)

public class CucumberRunnerTest {

}
