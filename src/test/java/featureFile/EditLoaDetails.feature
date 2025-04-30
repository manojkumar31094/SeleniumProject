
@tag
Feature: Edit LOA Details
  I want to use this template for my feature file
  
  Background:
  Then Click on login with Staff AD button
  Then Enter the user name "nageshwar@naditek-myairports.my"
  Then Enter the password "Naditek.12345*"
  And Click on the Sign in button


  

  @tag2
  Scenario Outline: Edit LOA Details
 # Then Click on the LOA Creator role
  Then Click on the LOA in the side menu
  Then Select an loa from the list
  Then click on the edit button in the loa details
  Then Edit the Email message "<em>"
  Then Click on the loa details save button
  
  
  
  
  
  
    

    Examples: 
    |em|
     |12345|
