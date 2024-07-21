
@AddProductFeature
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
  Given add url "https://automationexercise.com/"
    And click on signupp btn
    Then Add email address  "tessstt@gmail.com" 
    And Add a password "test1234!"
    And click on login btn 
    
   
  @AddProductSteps
  Scenario: ajout produit
    Given Click on product button
    When Hover on First porduct
    And Click on Add to cart button first product 
    And Click on Continue Shopping button
    And Hover on Second Product
    And click on Add to cart button second product
    Then Click View Cart button
   