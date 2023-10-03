package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.TestContextSetUp;

public class HomePageStepDefinitions {
//	WebDriver driver;
	TestContextSetUp testContextSetUp;
//	PageObjectManager pageObjManager;
//	HomePage homePage=pageObjManager.getHomePage();
	
	public HomePageStepDefinitions(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
	}
	
	@Then("User verifies the Homepage is displayed")
	public void user_verifies_the_homepage_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		HomePage homePage=testContextSetUp.pageObjManager.getHomePage();
		homePage.verifyHomepage();
	}
	
	@When("User selects the {string} values from Time-track dropdown")
	public void user_selects_the_values_from_time_track_dropdown(String dropVal) {
		HomePage homePage=testContextSetUp.pageObjManager.getHomePage();
		homePage.SelectTimeTrack(dropVal);
	}
	@Then("User verifies the {string} is displayed")
	public void user_verifies_the_is_displayed(String dropVal) {
		HomePage homePage=testContextSetUp.pageObjManager.getHomePage();
		homePage.verifyDropVal(dropVal);
	}


}
