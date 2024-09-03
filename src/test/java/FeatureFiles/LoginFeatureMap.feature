
Feature: Login feature 
  Scenario: Verify login feature is working with valid credentials or not
  
  Given Launch the browser with the given url and maximize the window
  Given Provide valid username and password
 
  
  |username|password|
  |Admin|admin123|
  |admin|admin678|
   And click on the login button