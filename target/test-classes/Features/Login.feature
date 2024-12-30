Feature: Test Login Feature

Scenario Outline: Test Login feature with valid credentials
  Given User is on Login screen
  When User enters "<username>" and "<password>"
  And User clicks on Login button
  Then User lands on home screen

Examples:
  | username       | password     |
  | standard_user  | secret_sauce |
