package jUnitPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
		
		glue= {"src/test/java/jUnitPackage"}, features = { "src/test/java/jUnitPackage" }
) 

public class TestRunner {

}