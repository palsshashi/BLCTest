$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Register User",
  "description": "",
  "id": "register-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Registration of a new user",
  "description": "",
  "id": "register-user;successful-registration-of-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to Register Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Mandatory details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message is displayed \"Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTest.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 7223315200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.user_Navigate_to_Register_Page()"
});
formatter.result({
  "duration": 3219095100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.user_enters_Mandatory_details()"
});
formatter.result({
  "duration": 10783956600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successful",
      "offset": 22
    }
  ],
  "location": "RegistrationTest.message_is_displayed(String)"
});
formatter.result({
  "duration": 3638961100,
  "status": "passed"
});
});