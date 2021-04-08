Feature: Place an order

Background: common login steps
  	Given user need to be on SWAGLAB login page
    When user enters username
    When when user enters password
    When user clicks on Login Button

  Scenario: Navigate to the product page and place an order 
    When user selects Sauce Lab Backpack from the product page
    When user adds the product to users cart 
    When user clicks on shopping cart link
    When user selects the checkout button
    When user enters first name
    Then user checks user first name is presesent
    When user enters last name
    Then user checks user last name is presesent
    When user enters zipcode
    Then user checks user zipcode is present
    When user clicks on continue button
    Then user checks the item in the order is the same item that was selected from the product page
    Then user clicks on Finish button 
    Then user validates that user order has been placed   
    And close browser


