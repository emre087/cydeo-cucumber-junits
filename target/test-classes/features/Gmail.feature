
@Gmail
Feature: Gmail Title Verifiation

  User Story: As a user when I enter the google page and click the Gmail webelement ın the page I should be able
  to see the title as "Gmail"

  Scenario: Gmail page title verification

    When user is in google page
    And  user clicks the Gmail link
    Then  user should be able to see the title as "Gmail"
