package arviLearning.learning;

import java.io.IOException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class General_practice {

	public void main(String[] args) throws IOException 
	{
		WebDriver driver;
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setVersion("santosh");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\s99185\\Desktop\\Current Code\\maven.1501742340241\\SSCResponsive\\src\\test\\resources\\chromedriverWindows.exe");
		driver=new RemoteWebDriver(new URL("http://sdc1as739:4444/wd/hub"),capabilities);
		driver.get("C:\\Users\\s99185\\Desktop\\santosh.html");
		//driver.quit();
		
		
//		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability("ignoreZoomSetting", true);
//		
//		
//		driver = new InternetExplorerDriver(caps);
//		driver.get("https://www.google.com/");
	}
}
