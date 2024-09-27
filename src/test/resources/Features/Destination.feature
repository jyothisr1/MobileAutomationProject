Feature: Finding Destination

  Scenario: Verify user can see the destination listing
    Given user opens the application
    Then verify user is on home screen
    When user scrolls to explore stays in popular destination if needed
    Then user slides to the "Mumbai" if needed
    When user clicks on "Mumbai"
    And user drags the first card to left
    When user selects select compare option
    And user drags the second card to left
    When user selects select compare option
    And user selects the compare option
    Then verify comparison page is displayed