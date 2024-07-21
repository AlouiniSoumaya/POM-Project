
@Compte_Automation
Feature: CompteAutoEx
  As a useR I want to create an account

  @signUp
  Scenario: new account
    Given add url "https://automationexercise.com/"
    And click on signupp btn
    And add a name "tessst"
    And add an email address "tesssttjttt@gmail.com"
    When click on signup btn
    And check title checkbox "Mme"
    And add password "test1234!"
    And choose day "1" , month "1" , year "1998"
    And add a first name and a last name "test" "test"
    And add an address "test"
    And select country "India"
    And add a state and a city  "tunis" "tunis"
    And add a zipcode "1234"
    And add a mobile number "23456543"
    And click on create account btn
    Then verify that account is created successfully "Account created!"
    
    @connexion
    Scenario: connexion
    Given add url "https://automationexercise.com/"
    And click on signupp btn
    Then Add email address  "tessstt@gmail.com" 
    And Add a password "test1234!"
    And click on login btn 
    And Verify that user logged in successfully