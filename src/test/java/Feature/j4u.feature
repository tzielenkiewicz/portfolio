Feature: feature to test the login functionality
Business Need: user is able to login to the webpage using valid credentials

  Scenario: check if the login process is successful with correct email and password
    Given user opened the login page of tested website
    When user inputs valid email and password
    And clicks login button
    Then the page is redirected to user panel