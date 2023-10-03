package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetUp {
	public WebDriver driver;
	public PageObjectManager pageObjManager;
	public BaseSetup base=new BaseSetup();
	
	public TestContextSetUp() throws IOException {
		pageObjManager=new PageObjectManager(base.getWebDriver());
	}

}
