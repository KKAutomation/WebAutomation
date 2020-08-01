Feature: TO VALIDATE BY ADDING SOME CART AND BUYING FROM AMAZON

  Scenario: To check login credentials for amazon
    When I enter url "https://www.amazon.in/"
    When I click on Signin button it should open sign in page
    Then Enter id as "nehanagar89@gmail.com"
    And Click on Continue button
    And Password as "satyaneha311"
    And click login so it should open homepage
    Then I should able to view my name


#  Scenario: To check login credentials for amazon
#    When I enter url "https://www.amazon.in/"
#    When I click on Signin button it should open sign in page
#    Then Enter id as "nehanagar89@gmail.com"
#    And Click on Continue button
#    And Password as "satyaneha313"
#    Then click login so it should open homepage
#
#
#  Scenario: To check the video option playing in amazon for echo
#    When I enter url "https://www.amazon.in/"
#    When I click on Signin button it should open sign in page
#    Then Enter id as "nehanagar89@gmail.com"
#    And Click on Continue button
#    And Password as "satyaneha311"
#    Then click login so it should open homepage
#    And Slect the menu option
#    When I select the echo and alexa it should open list of all option of the products.
#    Then I sleect all new amazon echo option and it should display all products to me
#    And Select the video option so video should be played.
#
#  Scenario: To add item from pantry option in cart
#    When I enter url "https://www.amazon.in/"
#    When I click on Signin button it should open sign in page
#    Then Enter id as "nehanagar89@gmail.com"
#    And Click on Continue button
#    And Password as "satyaneha311"
#    Then click login so it should open homepage
#    Given I am on amazon homepage and i select the pantry option to add tem to cart
#    Then i slect kahonoor basmati rice
#    And i slect the quesntity to 3 kg
#    When i add the item to cart it should be displayed in cart to me.

