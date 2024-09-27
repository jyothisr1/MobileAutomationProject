Feature: Finding Sunny Getaways

  Scenario: Verify offer price of Sunny Getaways
    Given user opens the application
    Then verify user is on home screen
    When user scrolls to Sunny Getaways if needed
    And user slides to San Juan if needed
    When user clicks on Drive into San Juan
    And user scrolls down to change month option
    And user verifies the price of month with temperature
    When user clicks on desired temperature
    Then verify the price and previous price is different