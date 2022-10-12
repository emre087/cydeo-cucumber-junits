Feature: Wikipedia Search Functionality Title Verification

  User Story: As a user When I am on wikipedia home page and When I type Steve Jobs
  in the wiki input box I should be able to see Steve Jobs in the title.


  Scenario: Title Verification for Wikipedia

    Given user is on the wikipedia home page
    When user types "Steve Jobs" in the wiki searck box
    And user clikcs the wiki button
    Then then user should be able to see "Steve Jobs" in the title


    Scenario: Header Verification
      Given user is on the wikipedia home page
      When user types "Steve Jobs" in the wiki searck box
      And user clikcs the wiki button
      Then user should be able to see "Steve Jobs" in the main header


      Scenario Outline: Wikipedia Search Functionality Title Verification
        Given user is on the wikipedia home page
        When user types "<searchValue>" in the wiki searck box
        And user clikcs the wiki button
        Then user should be able to see "<expectedTitle>"in the title
        Then user should be able to see "<expectedMainHeader>" in the main header

        Examples: search values we are going to use in this scenario as below
          | searchValue       | expectedTitle     | expectedMainHeader |
          | Steve Jobs        | Steve Jobs        | Steve Jobs         |
          | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
          | Bob Marley        | Bob Marley         | Bob Marley         |