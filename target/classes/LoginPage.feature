Feature: Amazon Login
  
  Scenario: Login to Amazon
    Given Customer is on Amazon page
    When Customer clicks on sign in menu
    And Enters mobile no. and Password 
    Then clicks on Continue
    And Customer logged in successfully
    And Browser closed

 