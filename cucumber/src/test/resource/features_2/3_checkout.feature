@set3
Feature: Checkout Cart Products

Scenario Outline: Verif that user can able to checkout
When user clicks the tick-box of terms and services
When user clicks the checkout button
When user clicks the select country option
When user choose the country "<country>"
When user enters the city "<city>"
When user enters the address_line "<address>"
When user enters the postal code "<code>"
When user enters the phone number "<phone_number>"
When user clicks the billing address continue button
When user clicks the shipping address continue button
When user clicks the shipping method continue button
When user clicks the payment option
When user clicks the payment method continue button
When user clicks the payment information continue button
When user clicks the confirm order button
Then the order confirmation message is displayed "Your order has been successfully processed!"
Then the order number is displayed

Examples: 
| country   |   city   | address      | code   | phone_number  |
| India     |  salem   | Allikuttai   | 636001 | 9878907681    |




