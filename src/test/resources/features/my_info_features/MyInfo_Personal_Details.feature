Feature: My Info

  @regression @login
  Scenario: Verify user can change personal details
    Given User navigates to login page
    When User enters valid credentials
    And Clicks on "login"
    Then Clicks on "My Info"
    And User enters values to corresponding fields on personal details
      | First Name | Middle Name | Last Name | Nickname |
      | John       | Harry       | Doe       | JD       |
    Then User closes the driver

