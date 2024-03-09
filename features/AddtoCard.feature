Feature: Add product to cart
 
Scenario: Add to cart activity
Given Customer is on Amazon page
    When Customer clicks on sign in menu
    And Enters mobile no. and Password 
    Then clicks on Continue
    And Customer logged in successfully
    When Customer clicked on Echo and alexa
    And selected product
    Then Customer added product to card
    And product is displayed in cart
    And Browser closed