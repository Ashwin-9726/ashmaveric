# Author
# Date
# Description
#
#@SmokeFeature
#Feature: feature to test login functionality
#	
#	@smoketest
  #Scenario: Check login is successful with valid credentials
  #
  #	Given user is on login page
    #When user enters username and password
    #And clicks on login button
    #Then user is navigated to the home page

   Scenario Outline: validate google search is working 
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
  