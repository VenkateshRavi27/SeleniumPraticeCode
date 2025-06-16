Feature: Shopping Application Demo

Background: Given User should naviagte to the application


  Scenario: Vaildating Registering Error Messages
    
    And User clicks the Registration link
    When User clicks the submit button without fill the form values
    Then User can get the FirstName error message
    And User can get the LastName error message
    And User can get the Email error message
    And User can get the Password error message
    And User can get the ConPass error message
