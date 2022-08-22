Feature: Login page feature

  Scenario: Login page title
    Given User is on Home Page
    When User click on Login/Register
    Then User Should redirect to Login Page
    Then Page title should be "Web Trading Platform | Angel One"

  Scenario: Forgot Password link
    Given User is on Home Page
    When User click on Login/Register
    Then User Should redirect to Login Page
    And Forget password link should be displayed

  Scenario Outline: Login with correct credentials
    Given User is on Home Page
    When User click on Login/Register
    Then User Should redirect to Login Page
    And User enter Username "<username>"
    And User enter Password "<password>"
    Then Click on Login button
    Then User should redirect to Portfolio Page
    Then Page title should be "Portfolio | Equity_New"

    Examples: 
      | username              | password    |
      | vaishrg1007@gmail.com | Nandini@123 |
      | vaishrg1007@gmail.com | Nandini@313 |
      | vaishrg@gmail.com     | Nandini@123 |
      | prati05m@gmail.com    | Nandini@123 |
