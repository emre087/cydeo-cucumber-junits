Feature: The user story about parameterization and eating

  @eating
  Scenario: how many cucumbers are you eating

    Given "Emre" is hungry
    When He eats "banana"
    Then He will be full