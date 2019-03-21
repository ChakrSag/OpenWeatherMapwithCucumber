Feature: Coverage of a couple of smoke tests on Open Weather Map


Scenario Outline: Invalid City Weather Scenario
		Verify weather should not be found if user searches with an invalid city name
		
Given User launches OpenWeatherMap website in desired "<Browser>" 	
When User provides an invalid city input
And User clicks on search button
Then No Weather should be found
	
Examples:
|Browser|
|Chrome |
|Firefox|


Scenario Outline: Valid City Weather Scenario
		Verify weather details should be displayed if user searches with a valid city name
		
Given User launches OpenWeatherMap website in desired "<Browser>" 	
When User provides a valid city input 
And User clicks on search button
Then Proper city details should be found 
And Weather details should be updated
	
Examples:
|Browser|
|Chrome |
|Firefox|