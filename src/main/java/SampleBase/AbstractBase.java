package SampleBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import SampleModule.Module;
import Util.SafeActions;
public class AbstractBase {
	
	private WebDriver driver;
	Module module;
	
	public WebDriver getDriver() {
		String driverPath = System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		return new ChromeDriver();
	}
	
	@BeforeMethod()
	public void beforeMethod() {
	
	}
	
	@BeforeSuite()
	public void beforeSuite() {
		SafeActions.killInstances("Edge");
		
	}
	
	@BeforeClass()
	public void beforeClass() {
		
	}
	

}
