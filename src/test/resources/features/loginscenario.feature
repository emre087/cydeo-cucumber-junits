Feature: Login Scenarios

  As a user when I login and passes some daya to the username and password  expected url should end with
  "orders"
@login2
  Scenario Outline: login
    Given I am on chrome browser
    When I go to log in page
    And enter username as "<Test>"
    And enter password as "<Tester>"
    Then I should be able to have a url that ends with "<Orders>"

  Examples:
      | Test    | Tester  | Orders |
      | Apple   | Cydeo   | orders |
      | Samsung | TechPro | orders |
      | Tesla   | tesla1  | orders |