Scenario: new user wants to sign up

Given a webdriver
When fields provided firstname Jed , lastname Dayo, email jesus.dayo@zuhlke.com , password test
Then show success message "Sign up was successful"