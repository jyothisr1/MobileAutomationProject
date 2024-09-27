Feature: Discover Option

  Scenario: Verify user can use discover option
    Given user opens application
    Then verify user is on home screen
    When user clicks on discover
    Then verify user is on discover page
    When user scrolls to dive into curated travel gems if needed
    And user slides to "Hotels for dream stays in paris" if needed
    Then verify the tag name by sliding to reach "Hotels for dream stays in paris"