package arviLearning.learning;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class practiceClassRemoteWebDriver {

	public static void main(String[] args) throws MalformedURLException {

		System.setProperty("webdriver.ie.driver","C:\\Users\\s99185\\Desktop\\Current Code\\maven.1501742340241\\SSCResponsive\\src\\test\\resources\\chromedriverWindows.exe");

		WebDriver driver = null;
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.ANY);
		capability.setVersion("santosh");

		driver = new RemoteWebDriver(new URL("http://sdc1as739:4444/wd/hub"), capability);
		driver.get("C:\\Users\\s99185\\Desktop\\santosh.html");

		// System.out.println("*********Execution Started*********");
		// System.out.println("Launched browser successfully");
		// driver.get("C:\\Users\\s99185\\Desktop\\santosh.html");
		// System.out.println("Launched browser successfully");
		driver.quit();
	}
}