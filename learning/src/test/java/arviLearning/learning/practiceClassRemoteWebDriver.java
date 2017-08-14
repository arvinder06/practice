package arviLearning.learning;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class practiceClassRemoteWebDriver {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=null;
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);

		driver=new RemoteWebDriver(new URL("http://172.17.0.1:4444/wd/hub"),capability);
		driver.get("http://www.google.com");
	} 

}
