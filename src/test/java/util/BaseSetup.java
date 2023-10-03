package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSetup {
	
	WebDriver driver;
	
	public WebDriver getWebDriver() throws IOException {
		String br;
		String urlPath;
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Configuration\\Config.properties");
		 Properties prop=new Properties();
		 prop.load(fis);
		 br=prop.getProperty("browser");
		 urlPath=prop.getProperty("baseURL");
		 
		if(driver==null) {
		if(br.equalsIgnoreCase("chrome")) {
//			"C:\Users\WELCOME\eclipse-workspace\CucumberAutomationFramework\src\test\resources\Dependencies\chromedriver-win64\chromedriver.exe"
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Dependencies\\chromedriver-win64\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if(br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Dependencies\\geckodriver-v0.33.0-win32\\geckodriver.exe");
	        driver= new FirefoxDriver();
		}else if(br.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Dependencies\\geckodriver-v0.33.0-win32\\geckodriver.exe");
	        driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(urlPath);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		
		return driver;
		
	}

}
