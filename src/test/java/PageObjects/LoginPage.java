package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	//locator
	private By uname=By.id("username");
	private By pass_word= By.name("pwd");
	private By loginbtn= By.id("loginButton");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//methods (Actions)
	public void enterUsername_Password(String username, String password ) {
	  driver.findElement(uname).sendKeys(username);
	  driver.findElement(pass_word).sendKeys(password);
	}
	
	public void clickOnLoginbtn() {
		driver.findElement(loginbtn).click();
	}

}
