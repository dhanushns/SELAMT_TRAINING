Feature: Login Feature

  Background: 
    Given The login page is diplayed

  @set1
  Scenario Outline: Login with valid login credentials
    When user enters "<username>" and "<password>"
    When user click the login button
    Then the page title is displayed "Products"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  @set1
  Scenario Outline: Login with in-valid login credentials
    When user enters "<username>" and "<password>"
    When user click the login button
    Then the error message is displayed "<message>"

    Examples: 
      | username        | password     | message                                             |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
