package jUnitPackage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class commonFunctions {

	WebDriver driver=null;
	public static String OSName=System.getProperty("os.name");
	public static String userDirectory=System.getProperty("user.dir");
	public static DesiredCapabilities capability;
	public static String url="";
	public String grid="http://localhost:5000//wd/hub";
	
	/**
	 * To launch the browser
	 * @param browserToLaunch
	 * @throws MalformedURLException
	 */
	public void launchBrowser(String browserToLaunch,String grid) throws MalformedURLException 
	{	
		this.grid=System.getProperty("seleniumGrid");
		try
		{
			if(this.grid.equals(""))
			{
				
			}
		}
		catch(Exception e)
		{
			this.grid="local";
			//this.grid="http://localhost:5000//wd/hub";
		}
		
		String chromeDriverpath="";
			
		if(OSName.contains("Windows"))
		{
			chromeDriverpath=userDirectory+"\\src\\test\\resources\\chromedriverWindows.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverpath);
		}
		else
		{
			chromeDriverpath=userDirectory+"/src/test/resources/chromedriverMAC";
			System.setProperty("webdriver.chrome.driver", chromeDriverpath);
			
		}
		System.out.println("Chromedriver Path: "+chromeDriverpath);
		
		
		if(this.grid.equalsIgnoreCase("local"))
		{
			switch(browserToLaunch.toUpperCase())
			{
				case "CHROME":
					driver=new ChromeDriver();
				break;
				
				default:
					driver=new ChromeDriver();
				break;
			}
			System.out.println("Browser successfully launched locally:"+browserToLaunch);
		}
		
		else
		{
			setGrid(this.grid);
			setCapabilities(browserToLaunch,this.grid);
			driver=new RemoteWebDriver(new URL(this.grid),capability);
			System.out.println("Browser successfully launched :"+browserToLaunch+" on Grid: "+grid+" : "+this.grid);
		}
			
	}

	/**
	 * To set the actual grid
	 * @return
	 */
	private void setGrid(String grid) 
	{
		switch(grid.toLowerCase())
		{
			case "localgrid":
				this.grid="http://localhost:4444//wd/hub";
				break;
				
			case "dockergrid":
				this.grid="http://localhost:5000//wd/hub";
				break;
		}
	}

	/**
	 * To set the capabilities
	 * @param browserToLaunch
	 * @param grid
	 */
	private void setCapabilities(String browserToLaunch, String grid) 
	{	
		switch(browserToLaunch.toUpperCase())
		{
			case "CHROME":
				capability=DesiredCapabilities.chrome();
				capability.setBrowserName("chrome");
				capability.setPlatform(Platform.ANY);				
			break;
			
			default:
				capability=DesiredCapabilities.chrome();
				capability.setBrowserName("chrome");
				capability.setPlatform(Platform.ANY);
			break; 
		}
	}

	/**
	 * To launch the Website
	 * @param website
	 * @throws Exception 
	 */
	public void launchWebsite(String website) throws Exception 
	{
		switch(website.toUpperCase())
		{
			case "GOOGLE":
				url="https://www.google.com";
			break;
			
			default:
				url="https://www.google.com\"";
			break;
			
		}
		driver.get(url);
		System.out.println("URL successfully launched: "+url);	
		getScreenshot("urlOpen");
	}
	
	/**
	 * This function will take screenshots
	 * @throws Exception
	 */ 
	public void getScreenshot(String fileName) throws Exception 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(scrFile, new File("/Arvinder/Work/SeleniumScreenshot/"+fileName+"_"+getTimeStamp()+".png"));
	}
	
	/**
	 * Get time stamp
	 */
	public String getTimeStamp()
	{
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	}
}