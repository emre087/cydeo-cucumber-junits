





Feature: Searching verification
  Agile Story: As a user When I write a string into the google search box
  I want to see that string in the title

  Scenario: Title Verification
    When I write "apple" in the google search box and clicks the enter key
    Then I should be able to see "apple" in the title.

