package SampleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SamplePage.Locators;
import Util.SafeActions;

public class Module extends SafeActions implements Locators {
	
	private WebDriver driver;
	SafeActions safeActions = new SafeActions(driver);
	public Module (WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public void navigateToURLOfApplication() throws InterruptedException {
		
		driver.get("http://67.43.12.211/NavotarReservation/(X(1)S(lfwmbj43gi2rqraiftgvld1n))/?clientid=321&mode=qa&AspxAutoDetectCookieSupport=1#/?lang=en");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	public void selectVehicleType() {
		
		safeActions.safeSelectOptionInDropDownByVisibleText(vehileTypeDropdown, "Mini Van");
	}
	
	
	
	
}
