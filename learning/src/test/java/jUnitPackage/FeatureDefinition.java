package jUnitPackage;

import java.net.MalformedURLException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class FeatureDefinition
{
	commonFunctions comm=new commonFunctions();
	
	@Given("^I have open browser \"([^\"]*)\"$")
	public void i_have_open_browser(String browserToLaunch) throws MalformedURLException
	{
		comm.launchBrowser(browserToLaunch,"");
	}
		
	@And("^I have launch \"([^\"]*)\" website$")
	public void i_have_launch_website(String website) throws MalformedURLException
	{
		comm.launchWebsite(website);		
	}
}
