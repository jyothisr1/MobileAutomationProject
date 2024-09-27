Feature: Finding Stays

  Scenario: Verify user can see the stays listing
    Given user opens the application
    Then verify user is on home screen
    When user clicks on the stays tab
    Then user is on the stays page
    When user enters "stays.destination" location field
    And user select the destination of stays
    And user selects the "stays.start.date" and "stays.end.dates"
    When user selects travelers and room
    Then verify stays listing page is displayed