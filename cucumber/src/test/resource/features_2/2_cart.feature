@set3
Feature: Add products to the cart

Scenario Outline: Verify that user can able to add the products to their cart
When user clicks "<category>" categories section
When user clicks the sortBy option and choose the option
When user clicks the product "<product_name>"
When user adds the "<unit>" and price "<price>"
When user clicks the add to cart button
Then the confirmation message should be displayed

Examples:
|	category		|	product_name						|  unit		| price		|
|	books				|	Computing and Internet	|		2			|	10			|
| books				| Fiction									|		3			|	24			|
| books 			| Health Book							|		4			|	10			|

Scenario: Verify the added products inside the users cart
When user clicks the shopping cart
Then verify the products in the cart
	

Scenario Outline: Verify that user can able to change the unit and should display the correct total
When user changes the unit of "<product_name>" to "<unit>" 
When user clicks the update cart button
Then verify the products in the cart

Examples:
|	category		|	product_name						|  unit		| price		|
|	books				|	Computing and Internet	|		1			|	10			|
| books 			| Health Book							|		3			|	10			|


Scenario Outline: Verify the user can able to remove products and should display the correct total
When user clicks the selection button of "<product_name>"
When user clicks the update cart button
Then verify the products in the cart 

Examples:
|	category		|	product_name						|  unit		| price		|
|	books				|	Computing and Internet	|		1			|	10			|





