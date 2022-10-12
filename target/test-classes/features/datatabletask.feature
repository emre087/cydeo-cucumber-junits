Feature: Seeing the dropdown list in the page
  As a user I should be able to get all the dropdown list from the dropdown.

  Scenario: List of Dropdowns
    Given user in on the dropdown page
    Then user should see below info in the dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

    @wip1
    Scenario: List of Dropdowns with map
      When user is on the month dropdown page
      And user enters below credentials

        | username | Test   |
        | password | Tester |

      Then user should be able to see that url contains the order
