package jUnitPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		format = {"pretty"},
		features = { "src/test/resources/gerkinFile.feature"},
		tags="@test"
) 

public class TestRunner {

}