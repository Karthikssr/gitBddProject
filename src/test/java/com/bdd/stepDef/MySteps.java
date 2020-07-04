package com.bdd.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


public class MySteps {

    @Given("my step")
    public void myStep() {
       System.out.println("my step: " + Thread.currentThread().getId());
    }

    @When("my sleep")
    public void mySleep() {
        System.out.println("my sleep: " + Thread.currentThread().getId());
    }
    
    @Then("my close")
    public void close() throws InterruptedException {
    	Thread.sleep(2000);
        System.out.println("my close: " + Thread.currentThread().getId());
    }
}
