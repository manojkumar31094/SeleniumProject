
@tag
Feature: Login
  I want to use this template for my feature file

 

  @tag2
  Scenario Outline: Login 
  Then Click on login with Staff AD button
  Then Enter the user name "<uname>"
  Then Enter the password "<pwd>"
  And Click on the Sign in button
  Then User should see the Dashboard page
  
  Examples:
	|uname|pwd|
	|nageshwar@naditek-myairports.my|Naditek.12345*|
   