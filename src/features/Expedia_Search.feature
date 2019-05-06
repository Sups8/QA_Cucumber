Feature: Flight Search in Expedia Website
      This feature will check the search functionality in Expedia

  Scenario: Search for Flights and Accommodation
    Given I navigate to the Expedia website
    When I look for a flight + accommodation from Brussels to New York
    Then the result page should contain travel option for the chosen destination