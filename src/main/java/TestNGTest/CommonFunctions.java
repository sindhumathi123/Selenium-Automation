package TestNGTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class CommonFunctions {
	public static WebDriver driver=null;
	public static Properties properties =null;
	public static  int implwait=30;
	public Properties loadpropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;																												
	}
	
	
	@BeforeSuite
public void browserlaunch() throws IOException, InterruptedException {
	loadpropertyFile();
	
	String browser=properties.getProperty("browser");
	 String url= properties.getProperty("url"); 
	 String driverlocation=properties.getProperty("driverlocation");
	 System.setProperty("webdriver.chrome.driver", driverlocation); 
	 driver=new ChromeDriver(); 
	 driver.manage().window().maximize(); driver.get(url);
	 driver.manage().timeouts().implicitlyWait(implwait, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 
		
	}
	@AfterSuite
	public void closeprogramm() {
		 driver .quit();
	}
}

