package com.bdd.stepDef;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import com.bdd.utils.driverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Step;

public class hooks {
	
//	public static WebDriver driver = null;
		
	@Before
	public void beforeScenario() {
		System.out.println("in BeforeScenario");
        System.out.println("Current Thread Id = " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_32.exe");
            System.setProperty("webdriver.chrome.silentOutput", "true");
            ChromeOptions options = new ChromeOptions();
//            options.setHeadless(true);
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driverFactory.addDriver(driver);
            
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("in AfterScenario");
        System.out.println("Current Thread Id = " + Thread.currentThread().getId());
		WebDriver driver = driverFactory.getDriver();
		String path = "./extent-report/"+scenario.getName().replaceAll("\\s", "")+".png";
		if (scenario.isFailed()) {
			takeScreenshot(driver,path);
		}
		driver.quit();
	}
	
	private void takeScreenshot(WebDriver driver, String dest) {
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(dest));				
		} catch (IOException ex) {
			System.out.println("takeScreenshot method: "+ ex.getMessage());
		}
	}

}
