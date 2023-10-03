package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/Features",
glue="StepDefinition",plugin= {"html:target/actTime.html","json:target/actTime.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failure-scenarios.txt"})

public class TestRunnerTestNg extends AbstractTestNGCucumberTests{

//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//		
//	}
}
