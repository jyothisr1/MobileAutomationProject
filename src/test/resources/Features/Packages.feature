Feature: Packages Search

  Scenario: Verify user can search packages
    Given user opens application
    Then verify user is on home screen
    When user click on packages tab
    Then verify user is on packages search page
    When user enters "packages.enter.origin" into enter origin field
    And user enters "packages.enter.destination" into enter destination field
    And select dates from "packages.start.month" "packages.start.date" to "packages.end.month" "packages.end.date"
    When user gives traveler details with rooms
    And user gives "packages.preferred.class"
    And click on search button
    Then verify package listing page is displayed

  Scenario: Verify user can search packages with Flight + Car
    Given user opens application
    Then verify user is on home screen
    When user click on packages tab
    Then verify user is on packages search page
    And user clicks on Flight + Car
    When user enters "Chicago" into from
    And user enters "Florida" into to
    And select from "September 18, 2024" date to "September 19, 2024" date
    And click on search button
    Then verify package listing page is displayed