Feature: Car Booking

  Scenario: Verify user can see the car listing
    Given user opens the application
    Then verify user is on home screen
    When user clicks on the car tab
    Then user is on the car booking page
    When user enters "car.pick.up" into the Pick-up location field
    And user enters "car.drop.off" into the Drop-off location field
    And user selects "car.pick.up.date" and "car.pick.up.time"
    And user selects "car.drop.off.date" and "car.drop.off.time"
    When user click on car search
    Then verify car listing page is displayed