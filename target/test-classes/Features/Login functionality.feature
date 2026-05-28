Feature: Login functionality


  Scenario: Valid login functionality
    Given user insert username"Admin"
    And user insert password"admin123"
    When user clicks on Login button
    Then user is redirected to homepage
    And  user click on Admin page
    And user click on Username
    And user click on search Button
    And user edit needed information
    And user clicks on save button
    And user insert invalid credential1

#    And user edit an existing username
#    And user introduce text in Usernamefield


  Scenario: Invalid login functionality
    Given user insert username"Admin1"
    And user insert password"admin123"
    When user clicks on Login button
    And user insert invalid credentials
    And user insert username"Admin"
    And user insert password"admin123"
   And user clicks on Login button
    Then user is redirected to homepage

  @UI @Run
  Scenario: Valid logout functionality
    Given user insert username"Admin"
    And user insert password"admin123"
    When user clicks on Login button
    Then user is redirected to homepage
    And user clicks on logout button
