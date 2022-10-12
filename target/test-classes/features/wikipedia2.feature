
  Feature: Verifications on the wikipediapage

    @wikipedia2
    Scenario Outline: wikipedia search functionality


    Given user is on the wikipedia homepage
    When user typess "<searchValue>" in the wiki searck box
    And user clicks the click box
    Then user should be able to see the "<expectedTitle>" in the title
    Then user should be able to see the "<expectedMainHeader>" in the main header

      Examples: search values that we are gonna use as below

        | searchValue  | expectedTitle | expectedMainHeader |
        | Steve Jobs   | Steve Jobs    | Steve Jobs         |
        | Aaron Lennon | Aaron Lennon  | Aaron Lennon       |
        | Wayne Rooney | Wayne Rooney  | Wayne Rooney       |



