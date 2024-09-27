Feature: Change Display Appearance

  Scenario: Verify user can change appearance
    Given user opens application
    Then verify user is on home screen
    When user clicks on account
    Then verify user is on profile page
    When user clicks on settings
    And user clicks on change display appearance
    And user selects "theme.color"
    When user clicks on done
    Then verify user is having the appearance selected