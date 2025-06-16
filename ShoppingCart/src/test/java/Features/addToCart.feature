Feature: Shopping Application Demo

  Background: Given User should navigate to the application

  @CleanUp
  Scenario Outline: Add a product to the cart
    And User clicks on the create an login link
    And User enters the "<email>" and "<password>"
    And User search the men "<hoodie>"
    When User add the hoodie to the cart
    Then Cart badge should be updated

    Examples: 
      | email                | password  | hoodie                   |
      | viratanu96@gmail.com | Test@7890 | Ajax Full-Zip Sweatshirt |
