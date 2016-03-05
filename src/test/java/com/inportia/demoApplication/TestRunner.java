package com.inportia.demoApplication;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = "src/test/java/features",
		glue = "com.inportia.stepDefinitions",
		strict = true,
		format = {"pretty", "html:target/cucumber", "json:target_json/cucumber.json", "junit:taget_junit/cucumber.xml" }
		)
public class TestRunner {

}
