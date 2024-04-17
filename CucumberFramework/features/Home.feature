Feature: Home Screen screnarios

Scenario: Login and choose Female as Gender
Given User launch the application in "Edge"
Given User is on "LoginPage"
Then User waits for Element "Username"
Then User Enter into the text box "Username" "admin123@gmail.com"
Then User Enter into the text box "Password" "admin123"
Then Click on the button "Login"
Given User is on "HomePage" 
Then User waits for Element "Home"
Then Click on the button "Home"
Then User Enter into the text box "FirstName" "Jnanesh" 
Then User Enter into the text box "FatherName" "Mahadevaswamy"
Then User Click on a RadioButton  "Female"


Scenario: Login and choose male as Gender
Given User launch the application in "Edge"
Given User is on "LoginPage"
Then User waits for Element "Username"
Then User Enter into the text box "Username" "admin123@gmail.com"
Then User Enter into the text box "Password" "admin123"
Then Click on the button "Login"
Given User is on "HomePage" 
Then User waits for Element "Home"
Then Click on the button "Home"
Then User Enter into the text box "FirstName" "Jnanesh" 
Then User Enter into the text box "FatherName" "Mahadevaswamy"
Then User Click on a RadioButton  "Female"
Then User Click on a RadioButton  "Male"