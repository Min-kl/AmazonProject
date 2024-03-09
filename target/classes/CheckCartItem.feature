Feature: Check cart
 

  Scenario: Checking cart item
   Given Customer is on Amazon page
    When Customer clicks on sign in menu
    And Enters mobile no. and Password 
    Then clicks on Continue
    And Customer logged in successfully
    When Customer clicked on cart
    And check cart empty or not
   Then Browser closed
  
