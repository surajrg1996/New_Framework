Feature: Order submit & verification

  Scenario: Order creation & verfication
    Given Redirect to Home Page
    Then Login to application
    And Select dropdown and select LYNX-North America
    When Click on Order Creation
    Then Enter Order id details
    And Submit Order ID Details
    Then Redirect to Tracking in Order Menu
    Then Select the date & Apply
    And Check the Order details
    Then Logout from Application
