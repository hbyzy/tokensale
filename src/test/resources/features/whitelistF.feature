
Feature: whitelist website functional test

  Background:
    Given whitelist home page
    And the whitelist page is up

  @whitelistUserAndEmail
  Scenario Outline: checking valid email with scenario outline
    When I enter "<email>" and "<isvalid>"

    Examples:
      | email                           | isvalid                        |
      | email@domain.com                | Yes                            |
      | firstname.lastname@domain.com   | Yes                            |
      | email@subdomain.domain.com      | Yes                            |
      | email@123.123.123.123           | Yes                            |
      | email@[123.123.123.123]         | Yes                            |
      | 'email'@domain.com              | Yes                            |
      | 1234567890@domain.com           | Yes                            |
      | email@domain-one.com            | Yes                            |
      | _______@domain.com              | Yes                            |
      | email@domain.name               | Yes                            |
      | email@domain.co.jp              | Yes                            |
      | firstname-lastname@domain.com   | Yes                            |
      | plainaddress                    | No                             |
      | #@%^%#$@#$@#.com                | No                             |
      | @domain.com                     | No                             |
      | Joe Smith <email@domain.com>    | No                             |
      | email.domain.com                | No                             |
      | email@domain@domain.com         | No                             |
      | .email@domain.com               | No                             |
      | email.@domain.com               | No                             |
      | email..email@domain.com         | No                             |
      | あいうえお@domain.com            | No                             |
      | email@domain.com (Joe Smith)    | No                             |
      | email@domain                    | No                             |
      | email@-domain.com               | No                             |
      | email@domain.web                | No                             |
      | email@111.222.333.44444         | No                             |
      | email@domain..com               | No                             |

  @whitelistEthAmount
  Scenario Outline: checking Ethamount
    When I generate a valid email
    And Input a valid "<EthAmount>" and "<isvalid>"

    Examples:
      |    EthAmount   |   isvalid  |
      |      50        | Yes        |
      |      25        | Yes        |
      |   49.00000001  | Yes        |
      |   49.99999999  | Yes        |
      |   0.100000001  | Yes        |
      |   0.999999999  | Yes        |
      |   9.999999999  | Yes        |
      |   10.00000009  | Yes        |
      |       0        | No         |
      |   50.00000001  | No         |
      |   50.00000009  | No         |
      |   50.10000001  | No         |
      |   50.99999999  | No         |
      |      100       | No         |
      |   1000000000   | No         |


