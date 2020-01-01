package Util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SafeActions {
	
	private WebDriver driver;

	public SafeActions(WebDriver driver)
	{
		this.driver=driver;
	}

	public void safeSelectOptionInDropDownByVisibleText(By locator, String sVisibleTextOptionToSelect)
	{
		try
		{
				WebElement selectElement = driver.findElement(locator);
				Select select = new Select(selectElement);
				select.selectByVisibleText(sVisibleTextOptionToSelect);
				Reporter.log(select.toString(), true);
		}
		catch(Exception e)
		{
		}
	}
	
	
	public static void killInstances(String browserName) {

		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /C \"TASKKILL /fi \"IMAGENAME eq "+browserName+"*\" /f /t\"");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
