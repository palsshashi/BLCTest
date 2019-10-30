
Feature: Register User
 
Scenario: Successful Registration of a new user
 Given User is on Home Page
 When User Navigate to Register Page
 And User enters Mandatory details
 Then Message is displayed "Successful"
