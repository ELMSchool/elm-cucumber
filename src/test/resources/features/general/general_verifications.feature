Feature: General Verifications

  @regression
  Scenario: Verify all menu options as an Admin
    Given User navigates to login page
    When User enters valid credentials
    Then Clicks on "login"
    Then User should see the dashboard page
    And User should see all menu options
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Buzz        |
    And User closes the driver


