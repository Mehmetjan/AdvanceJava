Feature: test all elements on Elements page

  Scenario Outline: test text box
    Given user on main page
    When user click on Elements menu
    And user click on text box menu
    When user enter "fullName"
    And user enter "email"
    And user enter "address1"
    And user enter permanent "address2"
    Then click on submit button

    Examples: 
      | fullName | email            | address1                | address2      |
      | mehmet   | mehmet@gmail.com | '522 North Piedmont St' | Penderview Dr |
