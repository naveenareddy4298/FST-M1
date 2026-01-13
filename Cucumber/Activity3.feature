@activity3
Feature: Testing with Tags

  Scenario: Testing with Simple Alert
    Given the user is on the alert page
    When the user clicks the simple alert button
    Then the alert should be displayed
    And the user accepts the alert

  Scenario: Testing with Confirm Alert
    Given the user is on the alert page
    When the user clicks the confirm alert button
    Then the alert should be displayed
    And the user dismisses the alert

  Scenario Outline: Testing with Prompt Alert
    Given the user is on the alert page
    When the user clicks the prompt alert button
    And the user enters "<text>" in the alert
    Then the alert should be displayed
    And the user accepts the alert
