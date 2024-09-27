Feature: Finding Last Minute Weekend Deals

  Scenario: Verify offer price of weekend deals
    Given user opens the application
    Then verify user is on home screen
    When user scrolls to go Last-minute weekend deals
    And user slides to the deal with offer with "offer.price"
    Then verify the offer tag with offer price and actual price
    When user selects the offer card
    Then verify the first card price with offer with homepage price
#    When user selects select your room button
#    Then verify the price in the price details with offer price