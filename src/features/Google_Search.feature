Feature: Google Search
      This feature will check the search functionality in google.

  Scenario Outline: Google Search
      Given Browser is opened to navigate to google
      When user searches for "<phrase>"
      Then the search result for "<phrase>" must be shown
      And the screenshot must be taken of the result

      Examples: Phrase
        | phrase |
        | Bahamas |
        | Amsterdam |