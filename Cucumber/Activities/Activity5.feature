@activity5
Feature: Login Test

  Scenario Outline: Testing Login with Example
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    And clicks the submit button
    Then get the confirmation message and verify it

    Examples:
      | username | password |
      | admin    | password |
      | admin    | admin123 |
