Feature: Login into Application
Scenario: Positive test validating 
Given Initialize the browser with chrome
And Navigate to "QAClickacademy" Site
And Click on Login link in home page to land on Secure sign in page
When User enters "Username" and "password" and logs in
Then Verify that user is succesfully logged in
