Feature: Verify Products page of Sauce Labs

  
  Background: Verify user lands on Products page after successful login
    Given User accesses saucedemo website
    When User enters credentials and Logs In
    Then User lands on products page of the website

  
  Scenario: Verify user is able to scroll up-down the entire page
    And user scrolls and views bottom of the page
    And user scrolls and views top of the page

  
  Scenario: Verify user is redirected to Your Cart screen upon clicking shopping cart icon
    When user clicks on shopping cart icon
    Then user is redirected to Your Cart screen


  
  Scenario: Verify user is able to view all Menu options upon clicking menu icon
    When User clicks on Menu icon
    Then Menu options should get displayed

  
  Scenario: Verify user redirects to Product detail screen upon clicking on any product from Products page
    When user clicks on any product on Products Page
    Then user should be redirected to product detail screen

 
  
  


