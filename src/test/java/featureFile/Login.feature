
@tag
Feature: Login
  I want to use this template for my feature file

 

  @tag2
  Scenario Outline: Login with valid data
  Then Click on login with Staff AD button
  Then Enter the user name "<uname>"
  Then Enter the password "<pwd>"
  And Click on the Sign in button
  Then User should see the Dashboard page
  
  Examples:
	|uname|pwd|
	|nageshwar@naditek-myairports.my|Naditek.12345*|
	
	Scenario Outline: Login with invalid data
	Then Click on login with Staff AD button
  Then Enter the valid user name "<iname>"
  Then Enter the invalid password "<ipwd>"
  And Click on the Sign in button
  Then User should see the error message
  
  Examples:
	|iname|ipwd|
	|nageshwar@naditek-myairports.my|Naditek.123456*|
	

   