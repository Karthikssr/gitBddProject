Feature: Title of your feature
  I want to use this template for my feature file

  @Tag1
  Scenario: Navigate to home Loan
    Given I am in ally home page
    When I click on HomeLoan - Buy a home in the header
    When user clicks on the Customize your rate link
    Then I am navigated to Home Loan Mortgage Page

  @Tag2
  Scenario: Navigate to Self Directed trading
    Given I am in ally home page
    When I click on Invest-Managed Portfolio in the header
    Then I am navigated to Managed Portfolio Page
    
  @Tag2
  Scenario: Navigate to Self Directed trading - 1
    Given I am in ally home page
    When I click on Invest-Managed Portfolio in the header
    Then I am navigated to Managed Portfolio Page
 