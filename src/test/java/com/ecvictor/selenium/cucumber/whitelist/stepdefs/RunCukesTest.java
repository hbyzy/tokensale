package com.ecvictor.selenium.cucumber.whitelist.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report",
				"json:target/cucumber.json"},
		tags = {"@whitelistEthAmount,@whitelistUserAndEmail"}
		)
public class RunCukesTest {
	
}