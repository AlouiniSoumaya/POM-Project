
@PaymentFeature
Feature: Test the payment feature
  I want to proceed to payment section

 Background:
  Given add url "https://automationexercise.com/"
    And click on signupp btn
    Then Add email address  "tessstt@gmail.com" 
    And Add a password "test1234!"
    And click on login btn 
 
  Given Click on product button
    When Hover on First porduct
    And Click on Add to cart button first product 
    And Click on Continue Shopping button
    And Hover on Second Product
    And click on Add to cart button second product
    Then Click View Cart button
 
  @PaymentSteps
  Scenario Outline: Payment steps 
    Given Click on proceed to checkout btn
    And Add a comment "Comment test"
    When Click on palce order btn 
    And Add a name "<name>" on the card 
    And Add acard number "<Card Number>" 
    And Add a cvc "<CVC>" an expiration day "<expiration day>" and an expiration year "<expiration year>"
    Then Clicko on pay an confirm order btn

    Examples: 
      | name     | Card Number      | CVC    | expiration day   | expiration year   |
      | User1  | 09878564893830 | 889  | 12             | 2025            |
      | User2  | 00849564897890 | 009  | 03             | 2026            |
 