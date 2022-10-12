Feature: Title verifications
  As a user When  go to website of Cydeo I want to get the title as Cydeo

  Scenario: Title verification for Cydeo
    When I go to the website of Cydeo
    Then I should be able to see the title as Cydeo

    Scenario: Title 2
      Given I go to the website of Cydeo
      Then I should be able to see title in the web site as Cydeo
