package SpiceJet.CucumberSpiceJet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initilizer() throws IOException
	{
	 prop=new Properties();
	
	FileInputStream fis= new FileInputStream("G:\\eclipse-java-2019-09-R-win32-x86_64\\SpiceJetE2E\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browser= prop.getProperty("Browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\Chrome 85\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	}
	
	
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver.exe\\");
		driver=new FirefoxDriver();
	}
	
	else 
	{
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	return driver;
	}

}
