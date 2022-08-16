@login
Feature: 
  To Validate the Login Functionality of the Face Book Application

  Background: 
    Given User Have To Open Google Chrome and Open face book page

  Scenario: 
    To Validate Login By Using Valid User Name and Valid Password

    When User provide Valid User name and Valid Password
      | vijayan92jkm@gmail.com | Gsavijayan23@ | prdisdasd@gmail.com | asfg3 |
    And User Click the Login button
    Then User Should Be logged in

  Scenario: 
    To Validate Login Functionality by giving invalid User Name and invalid Password

    When User Provide invalid User name and invalid password
      | priyafab | akpriya714@gmail.com        | dharshuu |
      | gokieee  | gokulsurya@gmail.com        | dhdwe34  |
      | surya    | suryanarayanan263@gmsil.com | hsdhdg   |
      | venkat   | venkat.dwdh@gmail.com       | dfhef46  |
    And User Click the Login button
    Then User Should be Navigate to invalid credentials page
