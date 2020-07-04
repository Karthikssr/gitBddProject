package com.bdd.testRunner;

import java.io.File;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/file1.feature"}
        ,glue = {"com.bdd.stepDef"}
        ,plugin= {"com.bdd.utils.ExtentReportListener",
        		"json:target/cucumber-report/cucumber.json"
        		,"html:target/cucumber-report/cucumber-report-HTML"}
		,monochrome= true
		,strict = true
		,dryRun = false
//		,tags = "@Tag1"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    
    @BeforeSuite
    public void beforeSuite(){
    	System.out.println("IN BEFORESUITE METHOD");
    	String reportPathString = System.getProperty("user.dir") + "/extent-report/";
    	File file = new File(reportPathString);
    	if (!file.exists()) {
    		file.mkdir();
    	}
    	
    }
}
