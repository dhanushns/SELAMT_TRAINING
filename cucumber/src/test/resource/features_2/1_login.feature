Feature: Login feature of demoWebShop Application

Background:
Given The login page is displayed

@set3 # valid users
Scenario Outline: Verify the user can able to login with valid username and password
When User enters the "<username>" and "<password>"
When User clicks the login button
Then the user-id is displayed "<mail-id>"

Examples:

| username    				| password   | mail-id					 |
| dddemo1@gmail.com   | 123456		 | dddemo1@gmail.com |

# in-valid users
Scenario Outline: Verify the user unable to login with in-valid username and password
When User enters the "<username>" and "<password>"
When User clicks the login button
Then the error message is displayed "<message>"

Examples:

| username    				| password   | message					 										  | 
| dddemo1@gmail.com		| 1234 			 | The credentials provided are incorrect |