Feature: Sign Up 
@tag @Smoky
Scenario Outline: Account Creation

Given User is on homepage
When User clicks on Sign Up tab
Then User enters select Eddition from dropdown
And User enters "<FirstName>" and "<LastName>"
And User submits "<Email>" and "<ConfirmEmail>"
And User enter "<username>"
And User write "<Password>" and "<PasswordConfirm>"
And User select checkbox
Then User clicks on Submit button
Then User type "<companyName>"
And User dial "<phone>" 
And User clicks on Continue button
Then User clicks on Finish button

#Scenario Outline: Account Names
Examples:
|FirstName  |LastName  |Email      |ConfirmEmail |username   |Password|PasswordConfirm|companyName |phone       |
|Arun       |Kumar     |r@gmail.com|r@gmail.com  |arun123    |test458|test458|Philps      |234-578-4566| 
|Smitha     |Ru        |r@gmail.com|r@gmail.com  |arug456    |test456|test456|Philps      |234-859-6589|
|Banita     |Ju        |r@gmail.com|r@gmail.com  |aruf789    |test789|test789|Philps      |896-565-2569|
