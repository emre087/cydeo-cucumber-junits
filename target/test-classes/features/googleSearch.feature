Feature: Google search functionality

  Agile Story: As a user When I am on google search page I should be able to search Whatever I want and see relevant information

  Scenario:  Search page title verification

    When user is on google webpage
    Then user should see title as google


    Scenario: Search functionality result
      Given user is on google webpage
      When user types apple in the search box and click the enter key
      Then user should be able to see apple in the title

    Scenario: Search functionality result title verifiactions
      Given user is on google webpage
      When  user types "apple" in the search box and click the enter key
      Then user should be able to see "apple" in the title