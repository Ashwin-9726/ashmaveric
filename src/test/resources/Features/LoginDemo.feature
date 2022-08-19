Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page
    When user enters <Country> and <Address> and <Email> and <Phone>
    And user clicks on save
    Then user clicks on logout
    Examples: 
      | username | password |
      | Ashwin   |    12345 |
     Examples:
      |Country| Address | Email       |Phone 
      |India  | DLF     |Ash@gmail.com|9999944444 