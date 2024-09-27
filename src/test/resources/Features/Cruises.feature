Feature: Cruises Search

  Scenario: Verify user can search flight
    Given user opens application
    Then verify user is on home screen
    When user click on cruises tab
    Then verify user is on cruises search page
    When user enters "destination"
    And select dates "September 18, 2024" to "September 19, 2024"
    When user gives duration
    And user gives the traveler information
    And click on search button
    Then verify cruises listing page is displayed
