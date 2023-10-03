package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import util.DynamicLocator;

public class HomePage {
	
	WebDriver driver;
	
	By me_Link = By.xpath("//span[text()='Me']");
	By logOut_Link = By.id("logoutLink");
	By timeTrack_Dropdown= By.xpath("//span[text()='%s']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyHomepage() throws InterruptedException {
		Thread.sleep(5000);
	    boolean b1=driver.findElement(me_Link).isDisplayed();
	    boolean b2=driver.findElement(logOut_Link).isEnabled();
	    Assert.assertTrue(b1&&b2, "The Homepage not displayed");
	}
	
	public void SelectTimeTrack(String val) {
		driver.findElement(me_Link).click();
		driver.findElement(DynamicLocator.getNewLocator(timeTrack_Dropdown, val)).click();
	}
	
	public void verifyDropVal(String val) {
		String actualVal=driver.findElement(DynamicLocator.getNewLocator(timeTrack_Dropdown, val)).getText();
		Assert.assertEquals(actualVal, val,"The dropval is not displaye");
	}
	
	

}
