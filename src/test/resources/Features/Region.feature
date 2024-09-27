Feature: Change Region

  Scenario: Verify user can change region
    Given user opens application
    Then verify user is on home screen
    When user clicks on account
    Then verify user is on profile page
    When user clicks on settings
    And user clicks on change region
    And user select "region"
    Then user click on ok and confirms to clear the data
    When user reopens website
    Then verify user is on home screen
    When user clicks on account
    Then verify user is on profile page
    When user clicks on settings
    Then verify user is having the destination selected