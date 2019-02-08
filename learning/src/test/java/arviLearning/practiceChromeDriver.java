package arviLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceChromeDriver {

	public static void main(String[] args) {
		
		String usrdir=System.getProperty("user.dir");
		usrdir=usrdir+"\\src\\test\\resources";
		System.setProperty("webdriver.chrome.driver",usrdir+"\\chromedriverWindows.exe");		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();

//		System.setProperty("webdriver.ie.driver", userDir + "\\src\\test\\resources\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("www.google.com");		
	}

}