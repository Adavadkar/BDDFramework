Feature: Verify Your Cart page of sauce labs

Background: Verify user lands on Products page after successful login
    Given User accesses saucedemo website
    When User enters credentials and Logs In
    Then User lands on products page of the website
    
  Scenario: Verify user is redirected to Your Cart screen upon clicking shopping cart icon
    When user clicks on shopping cart icon
    Then user is redirected to Your Cart screen
    
    
  Scenario: Verify user is redirected back to Products page upon clicking Continue Shopping button on Your Cart page
    When user clicks Continue Shopping button on Your cart screen
    Then user is redirected back to Products page
    
    
  