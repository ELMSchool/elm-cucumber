Feature: Login with parameterized steps

  @regression @smoke
  Scenario: Login with valid credentials
    Given User navigates to login page
    When User enters "Admin" and "admin123" as credentials
    And Clicks on "login"
    Then User should see the dashboard page
    And User closes the driver

  @regression
  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters "invalid" and "invalid" as credentials
    And Clicks on "login"
    Then User should see the error message
    And User closes the driver

  @regression
  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters "invalid" and "invalid" as credentials
    And Clicks on "login"
    Then User should see the error message
    And User closes the driver

  @regression
  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters "invalid" and "invalid" as credentials
    And Clicks on "login"
    Then User should see the error message
    And User closes the driver