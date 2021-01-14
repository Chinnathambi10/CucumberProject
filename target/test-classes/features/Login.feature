Feature: Login functionality
@chinna
Scenario: User login successfully
Given User landed on login page using "https://beta-selvbetjening.tdc.dk/"
When User given valid username and password
|smoketest|Oytwx438|
Then Front page should be displayed
And frequently user cards displayed
But Account number card is not displayed