Feature: Ajio
@Mens @Clothing
Scenario: mens 
Given launch the Ajio "https://www.ajio.com"
And To check broken link "https://www.ajio.com"
And navigate To Mens clothing
When user Click sort dropdown and select a value
Then validate outcome