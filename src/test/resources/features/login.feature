@Regression @Smoke
Feature: library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts,
  and dashboards should be displayed.
  Accounts are: librarian, student, admin
@Librarian @employee
  Scenario: Login as Librarian
    When user enters librarian username
    And user enter librarian password
    Then user should see the dashboard
@Student
    Scenario: Login as Student
      When user enters Student usenama
      And user enters Student password
      Then user should see the dashboard
@Admin
      Scenario: Login as admin
        When user enters admin username
        And user enters admin password
        Then user should see the dashboard