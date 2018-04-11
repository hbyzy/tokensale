@login-feature
Feature: Tokensale website functional test

  Background:
    Given tokensale home page
    And the login page is up

  @TokensaleHome
  Scenario: Checking all of the login page is available
    Then the login page is up


  @TokensalePagedown
    Scenario: Checking all page of login page


  @TokensaleUser_SUC
    Scenario: checking username and password successfully
    When I enter the username as "ritaguowu@gmail.com" and password as "rita11111", I click an login button
    Then Login success

  @TokensaleUser_FAIL
  Scenario Outline: checking wrong username and password with scenario outline
    When I enter "<username>" and "<password>", I click an login button
    Then Login failed

    Examples:
      | username        | password |
      | info@gmail.com  | asdfsagg |
      | ritaj@gmail.com | dsafsdf  |
