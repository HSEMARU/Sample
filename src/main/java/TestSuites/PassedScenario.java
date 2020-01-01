package TestSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SampleBase.AbstractBase;
import SampleModule.Module;

public class PassedScenario extends AbstractBase {
	
	Module module;
	
	
	@BeforeMethod()
	public void beforeMethod() {
	module = new Module(getDriver());
	}
	
	
	
	@Test(groups= {"Sample"})
	public void PassedCase() throws InterruptedException {
		
		module.navigateToURLOfApplication();
		module.selectVehicleType();
		
		
		
	}
	
}
