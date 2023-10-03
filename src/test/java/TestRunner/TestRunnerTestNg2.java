package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="@target/failure-scenarios.txt",
glue="StepDefinition",plugin= {"html:target/actTime.html","json:target/actTime.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunnerTestNg2 extends AbstractTestNGCucumberTests{

//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//		
//	}
}
