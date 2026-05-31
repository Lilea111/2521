Feature: Login functionality


  Scenario: Valid login functionality
    Given user inserts username"Admin"
    And user inserts password"admin123"
    When user clicks on Login button
    Then user is redirected to homepage
    And  user clicks on Admin page
    And user clicks on Username
    And user clicks on search Button
    And user edits needed information
    And user clicks on save button
    And user inserts invalid credential1


  Scenario: Invalid login functionality
    Given user inserts username"Admin1"
    And user inserts password"admin123"
    When user clicks on Login button
    And user inserts invalid credentials
    And user inserts username"Admin"
    And user inserts password"admin123"
   And user clicks on Login button
    Then user is redirected to homepage



  @UI @Run
  Scenario: Valid logout functionality
    Given user inserts username"Admin"
    And user inserts password"admin123"
    When user clicks on Login button
    Then user is redirected to homepage
    And user clicks on logout button


//Scenario: 
