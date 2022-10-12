Feature: wiki search verifications

  User Story: As a user I should be able to do practice with different search options

  @Messi
  Scenario Outline:
    Given I ama in the wikipedia home page
    When  I type "<name>" in the wiki search box
    Then I should be able to see "<title>" in the main header

    Examples:
      | name         | title        |
      | Lionel Messi | Lionel Messi |
      | Elon Musk    | Elon Musk    |
      | Lady Gaga    | Lady Gaga    |