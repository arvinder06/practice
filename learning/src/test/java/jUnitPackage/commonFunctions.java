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
	public static String OSName=System.getProperty("os.name");
	
	/**
	 * To launch the browser
	 * @param browserToLaunch
	 * @throws MalformedURLException
	 */
	public void launchBrowser(String browserToLaunch) throws MalformedURLException 
	{	
		if(OSName.contains("Windows"))
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"\\Desktop\\Current Code\\maven.1503022456224\\learning\\src\\test\\resources\\chromedriverWindows.exe");
		else
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/eclipse-workspace/maven.1502674278044/learning/src/test/resources/chromedriver/MAC");
		
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
				url="https://www.google.com";
			break;
			
			default:
				url="https://www.google.com\"";
			break;
			
		}
		driver.get(url);
		System.out.println("URL successfully launched: "+url);		
	}
}