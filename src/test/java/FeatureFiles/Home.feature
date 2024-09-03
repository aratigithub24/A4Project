
Feature: Home page

#Background:
 #Given username and password and perform login operation
  #
  #Scenario: verify the home page is visible or not
  #Given Dashboard name should be displayed
  #
  #Scenario: verify user is able to click on Admin option
  #When click on Admin
  #
  #Scenario:  verify user is able to click on Admin option
  #When click on Pim
  
  
  Background:
 Given username and password and perform login operation
  
  @Smoke
  Scenario: verify the home page is visible or not
  Given Dashboard name should be displayed
  
  @Smoke @Regression
  Scenario: verify user is able to click on Admin option
  When click on Admin
  
  @Regression
  Scenario:  verify user is able to click on Pim option
  When click on Pim
   