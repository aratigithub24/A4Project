
Feature: Login feature 
  Scenario Outline: Verify login feature is working with valid credentials or not
  
  Given Launch the browser with the given url and maximize the window
  Given Provide valid "<username>" and "<password>"
  And click on the login button
  
  Examples: 
  |username|password|
  |Admin|admin123|
  |admin|admin678|