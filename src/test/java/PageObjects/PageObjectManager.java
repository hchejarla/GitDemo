package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	static WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		LoginPage loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public HomePage getHomePage() {
		HomePage homePage=new HomePage(driver);
		return homePage;
	}
	

}
