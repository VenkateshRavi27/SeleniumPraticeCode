Feature: Shopping Application Demo

  Background: Given User should navigate to the application

  #@CleanUp
  Scenario Outline: Add a product to the cart
    And User clicks on the create an login link
    And User enters the "<email>" and "<password>"
    And User search the men "<hoodie>"
    When User add the hoodie to the cart
    And user selects size "<size>"
    And user selects color "<color>"
    And user clicks the add to cart button
    And Cart badge should be updated
    And User clicks the badge button
    And User clicks the checkout button
    And User clicks next button for address selection
    And User clicks the place and order button
    Then verify the thank you message

    Examples: 
      | email                | password   | hoodie                      | size | color  |
      | jackrose98@gmail.com | Test@12345 | Radiant Tee                 | xs   | purple |
      | viratanu96@gmail.com | Test@7890  | Jupiter All-Weather Trainer | s    | green  |
      | jackrose98@gmail.com | Test@12345 | Diva Gym Tee                | m    | orange |
      | viratanu96@gmail.com | Test@7890  | Ajax Full-Zip Sweatshirt    | l    | red    |
      | jackrose98@gmail.com | Test@12345 | Desiree Fitness Tee         | xl   | yellow |
