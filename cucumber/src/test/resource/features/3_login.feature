Feature: Login Feature

Background:
Given The login page is diplayed

@set3
Scenario Outline: Login with valid and invalid login credentials
When user enters "<username>" and "<password>"
When user click the login button
Then the message is displayed "<message>"

Examples: 
| username          | password     | message   |
| standard_user     | secret_sauce | Products  |
| locked_out_user   | secret_sauce | Epic sadface: Sorry, this user has been locked out.|