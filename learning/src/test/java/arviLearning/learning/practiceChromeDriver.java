package arviLearning.learning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class practiceChromeDriver {

	public static void main(String[] args) {
		String usrdir=System.getProperty("user.dir");
		usrdir=usrdir+"\\src\\test\\resources";
		System.setProperty("webdriver.chrome.driver",usrdir+"\\chromedriverWindows.exe");		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com");

//		System.setProperty("webdriver.ie.driver", userDir + "\\src\\test\\resources\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("www.google.com");
		int initial_size = driver.manage().window().getSize().getWidth();
		System.out.println(initial_size);
	}

}