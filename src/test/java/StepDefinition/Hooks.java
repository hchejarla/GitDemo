package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import util.BaseSetup;
import util.TestContextSetUp;

public class Hooks {
//	Before --> only once it will be executed before scenario
//	After --> only once it will be executed After scenario
//	AfterStep --> only once it will be executed before each step
//	BeforeStep --> only once it will be executed After step
	TestContextSetUp testContextSetUp;
    
    public Hooks(TestContextSetUp testContextSetUp) throws IOException {
    	this.testContextSetUp=testContextSetUp;
    }

	@After
	public void closeBrowser() throws IOException {
		testContextSetUp.base.getWebDriver().close();
	}
	
	@AfterStep
	 public void addScreenshot(Scenario scenario) throws IOException {
		 
		
		 if(scenario.isFailed()) {
			 WebDriver driver=testContextSetUp.base.getWebDriver();
			 File sourcepath=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
			 scenario.attach(fileContent, "image/png", "image");
		 }
		 }
	
	
}
