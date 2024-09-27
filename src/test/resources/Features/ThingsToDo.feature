Feature: Things to do

  Scenario: verify the details in things to do
    Given user opens application
    Then verify user is on home screen
    When user click on things to do
    Then verify user is on search page
    And user enters "things.to.do.destination" into enter destination
    And user select the destination
    When user gives the dates
    And user click on search button
    Then verify things to do page is displayed
    When user clicks on the card
    Then verify user entered details with details on the card