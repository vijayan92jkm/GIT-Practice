@forgot
Feature: 
  To validate the forgotten password functionality of the facebook application

  Scenario: 
    To validate the forgotten pass by clicking forgotten password lable

    Given User have to open google chrome and launch facebook page
    When User have click forgotten password Lable
    And User have click email text box
      | Vijayan92jkm@gmail.com |
    And User have to click search button
    Then User should be navigate to reset password page
