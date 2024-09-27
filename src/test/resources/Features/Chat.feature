Feature: Chat Option

  Scenario: Verify user can use the chat
    Given user opens the application
    Then verify user is on home screen
    When user clicks on chat option
    Then verify user is on chatting page
    When user enters a query
    Then verify user is able to get the reply