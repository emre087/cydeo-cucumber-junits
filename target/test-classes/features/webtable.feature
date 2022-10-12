Feature: Web Table Scenarios
  User Story:
  chechknin soma credentials with


 @wip3
  Scenario Outline:

 Given user is already on web table orders page
  When user enters appropriate product "<Product>"
   And user enters appropriate quantity "<Quantity>"
   And user enters appropriate customer name"<Customer Name>"
   And user enters appropriate street"<Street>"
   And user enters appropriate city "<City>"
   And user enters appropriate state "<State>"
   And user enters appropriate zip code"<Zip>"
   And user enters appropriate card type "<Card Type>"
   And user enters appropriate card no"<Card No>"
   And user enters appropriate expire date "<Expire Date>"
   And user enters process order button
   And user enters appropriate expected name "<Expected Name>"

   And user clicks the "Proceed Order"
   Then user should see new order in the table on “View all orders” page


Examples:

 | Product  | Quantity | Customer Name | Street | City       | State | Zip   | Card Type | Card No           | Expire Date | Expected Name |
 | MoneyCog | 2        | Marie Curie   | Alfa   | Newyokr    | USA   | 34880 | Visa      | 1111222233334444  | 12/24       | Marie Curie   |

 | MoneyCog | 1        | Mariah Carey  | Alfa   | Washington | USA   | 34881 | Visa      | 11112222333344445 | 12/25       | Mariah Carey  |


