package arviLearning.learning;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jagacy.util.JagacyException;

public class General_practice {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, JagacyException 
	{
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:\\Users\\s99185\\Desktop\\Current Code\\maven.1501742340241\\SSCResponsive\\src\\test\\resources\\IEDriverServer.exe");
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		
		
		driver = new InternetExplorerDriver(caps);
		driver.get("https://www.google.com/");
	}
}
