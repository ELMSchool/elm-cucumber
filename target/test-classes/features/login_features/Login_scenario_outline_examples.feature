Feature: Login with scenario outline and examples table
#reformart => ctrl + alt + shift + L
  @outline
  Scenario Outline: Login with invalid credentials
    Given User navigates to login page
    When User enters "<username>" and "<password>" as credentials
    And Clicks on "login"
    Then User should see the error message
    And User closes the driver

    Examples:
      | username | password |
      | invalid  | invalid  |
      | Admin    | invalid  |
      | invalid  | admin123 |