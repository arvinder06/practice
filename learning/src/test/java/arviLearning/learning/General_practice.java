package arviLearning.learning;

import java.io.IOException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.jagacy.util.JagacyException;

public class General_practice {

	public void main(String[] args) throws IOException, JagacyException 
	{
		WebDriver driver;
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.LINUX);
		capabilities.setVersion("67.0.3396.87");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\s99185\\Desktop\\Current Code\\maven.1501742340241\\SSCResponsive\\src\\test\\resources\\IEDriverServer.exe");
		driver=new RemoteWebDriver(new URL("http://localhost:5000/wd/hub"),capabilities);
		driver.get("https://www.google.com/");
		driver.quit();
		
		
//		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability("ignoreZoomSetting", true);
//		
//		
//		driver = new InternetExplorerDriver(caps);
//		driver.get("https://www.google.com/");
	}
}
