Feature: Login scenarios 

Scenario: Login with valid username and password
Given User launch the application in "Edge"
Given User is on "LoginPage"
Then User waits for Element "Username"
Then User Enter into the text box "Username" "ambika@com.sand"
Then User Enter into the text box "Password" "Anoopkp@15"
Then Click on the button "Login"
