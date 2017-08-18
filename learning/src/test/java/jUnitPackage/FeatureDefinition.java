package jUnitPackage;

import java.net.MalformedURLException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class FeatureDefinition
{
	commonFunctions comm=new commonFunctions();
	
	@Given("^I have open browser \"([^\"]*)\" using grid \"([^\"]*)\"$")
	public void i_have_open_browser(String browserToLaunch,String grid) throws MalformedURLException
	{
		comm.launchBrowser(browserToLaunch,grid);
	}
		
	@And("^I have launch \"([^\"]*)\" website$")
	public void i_have_launch_website(String website) throws MalformedURLException
	{
		comm.launchWebsite(website);
	}
}
