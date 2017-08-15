package arviLearning.learning;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class practiceClassRemoteWebDriver {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/eclipse-workspace/maven.1502674278044/learning/src/test/java/chromedriver");

		WebDriver driver=null;
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.ANY);

		driver=new RemoteWebDriver(new URL("http://localhost:5000//wd/hub"),capability);
		System.out.println("*********Execution Started*********");
		System.out.println("Launched browser successfully");
		driver.get("http://www.google.com");
		System.out.println("Launched browser successfully");
		driver.quit();
	} 

}
