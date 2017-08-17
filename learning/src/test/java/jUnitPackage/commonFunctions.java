package jUnitPackage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class commonFunctions {

	WebDriver driver=null;
	
	/**
	 * To launch the browser
	 * @param browserToLaunch
	 * @throws MalformedURLException
	 */
	public void launchBrowser(String browserToLaunch) throws MalformedURLException 
	{	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/eclipse-workspace/maven.1502674278044/learning/src/test/java/chromedriver");
		
		switch(browserToLaunch.toUpperCase())
		{
			case "CHROME":
				driver=new ChromeDriver();
			break;
			
			default:
				driver=new ChromeDriver();
			break;
		}
		
		System.out.println("Browser successfully launched :"+browserToLaunch);		
	}

	/**
	 * To launch the Website
	 * @param website
	 */
	public void launchWebsite(String website) {
		String url="";
		switch(website.toUpperCase())
		{
			case "GOOGLE":
				url="https://www.google.com\"";
			break;
			
			default:
				url="https://www.google.com\"";
			break;
			
		}
		driver.get(url);
		System.out.println("URL successfully launched: "+url);		
	}
}