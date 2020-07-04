package com.bdd.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bdd.utils.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	private WebDriver driver = driverFactory.getDriver();
	
	@Given("I am in ally home page")
	public void i_am_in_ally_home_page() throws Exception {
		System.out.println("Print1");
		driver.get("https://www.ally.com/");
		Thread.sleep(5000);
	}

	@When("I click on HomeLoan - Buy a home in the header")
	public void i_click_on_HomeLoan_Buy_a_home_in_the_header() throws Exception {
		System.out.println("Print2");
//		driver.findElement(By.xpath("(//button[contains(text(),'Home Loans')])[3]"));
		driver.findElement(By.xpath("//li[@class='nav-main-item']//button[@data-track-name = 'HomeLoans']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Buy a Home'])[1]")).click();
	}

	@Then("I am navigated to Home Loan Mortgage Page")
	public void i_am_navigated_to_Home_Loan_Mortgage_Page() throws Exception {
		System.out.println("Print3");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}
	
	@When("user clicks on the Customize your rate link")
	public void user_clicks_on_the_Customize_your_rate_link() throws Exception {
		System.out.println("Print4");
	}

	@When("I click on Invest-Managed Portfolio in the header")
	public void i_click_on_Invest_Managed_Portfolio_in_the_header() throws Exception {
		System.out.println("Print5");
		driver.findElement(By.xpath("//li[@class='nav-main-item']//button[@data-track-name = 'Invest']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Managed Portfolios'])[2]")).click();
	}

	@Then("I am navigated to Managed Portfolio Page")
	public void i_am_navigated_to_Managed_Portfolio_Page() throws Exception {
		System.out.println("Print6");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Create Your Plan']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}	
}
