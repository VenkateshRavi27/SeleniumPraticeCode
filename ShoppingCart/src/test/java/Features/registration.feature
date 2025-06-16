Feature: Shopping Application Demo

  Scenario: Register Should be success
    Given User should navigate to the application
    And User clicks on the create an account link
    And User enter the First Name as "Virat"
    And User enter the Last Name as "Anu"
    And User enter the Email as "viratanu96@gmail.com"
    And User enter the Password as "Test@7890"
    And User enter the Confirm Password as "Test@7890"
    When user click the Create an Account
    Then login should be success
