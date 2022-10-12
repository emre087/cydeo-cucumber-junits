Feature: calculator should work with simple math
  As a user I should be able to do simple math

 @ddt_testing
  Scenario Outline: should be able to add two numbers
    Given calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalNumber>


    Examples:
      | firstNumber | secondNumber | finalNumber |
      | 2           | 3            | 5           |
      | 12          | 13           | 25          |
      | 22          | 33           | 55          |


