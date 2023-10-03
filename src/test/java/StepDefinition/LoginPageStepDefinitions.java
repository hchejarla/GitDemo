package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.TestContextSetUp;

public class LoginPageStepDefinitions {
//	WebDriver driver;
	
	TestContextSetUp testContextSetUp;
//	PageObjectManager pageObjManager=new PageObjectManager() ;
//	LoginPage loginPage=testContextSetUp.pageObjManager.getLoginPage();
	
	public LoginPageStepDefinitions(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
	}
	
	@Given("Launch the actiTime application")
	public void launch_the_acti_time_application() {
//		System.setProperty("webdriver.chrome.driver","E:\\SeleniumForNirusha\\Dependencies\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//		testContextSetUp.driver= new ChromeDriver();
//		testContextSetUp.driver.manage().window().maximize();
//		testContextSetUp.driver.get("https://demo.actitime.com/login.do");
//		testContextSetUp.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@When("User Enters {string} and {string} into username and passowrd fields")
	public void user_enters_and_into_username_and_passowrd_fields(String username, String password) {
		LoginPage loginPage=testContextSetUp.pageObjManager.getLoginPage();
		loginPage.enterUsername_Password(username, password);
	}
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		LoginPage loginPage=testContextSetUp.pageObjManager.getLoginPage();
		loginPage.clickOnLoginbtn();
	}
	

}
