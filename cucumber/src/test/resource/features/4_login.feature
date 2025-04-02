Feature: SauceDemo Login with ScenarioContext

Background:
Given The login page is diplayed

Scenario Outline: Login with valid and invalid login credentials
When user enters "<username>" and "<password>"
When user click the login button
Then the message is displayed "<message>"

Examples: 
| username          | password     | message   |
| standard_user     | secret_sauce | Products  |