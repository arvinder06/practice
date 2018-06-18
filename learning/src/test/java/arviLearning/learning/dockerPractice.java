package arviLearning.learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerPractice {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		String usrdir=System.getProperty("user.dir");
		usrdir=usrdir+"\\src\\test\\resources";
		System.setProperty("webdriver.chrome.driver",usrdir+"\\chromedriverWindows.exe");		
	
		WebDriver driver;
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.ANY);
		capabilities.setVersion("67.0.3396.87");
		
		driver=new RemoteWebDriver(new URL("http://localhost:5000/wd/hub"),capabilities);
		driver.get("https://www.google.com/");
		driver.quit();
		System.out.println("######End####");

	}

}
