package arviLearning.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practiceChromeDriver {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/eclipse-workspace/maven.1502674278044/learning/src/test/java/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	} 

}