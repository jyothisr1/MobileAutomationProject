Feature: Finding Pools

  Scenario: Verify user can see the pool listing
    Given user opens the application
    Then verify user is on home screen
    When user scrolls to go beyond your typical stay if needed
    Then user slides to the pool if needed
    When user clicks on pool
    And user selects the first card
    When user selects select a room
    And user is able check more details
    Then user selects the stay card with "select and customize"
    When touch on reserve button
    Then verify the details in the page with more details option