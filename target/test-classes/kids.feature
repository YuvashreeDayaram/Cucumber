Feature: Ajio

Background: Ajio launching function
Given Launch the Ajio website "https://www.ajio.com"
And To check the broken link "https://www.ajio.com"
And Navigate to Kids and click the clothing
@Kids
Scenario: kids clothing sorthing

When user click sort dropdown and select option in a dropdown with one dim map
|sort1|highest|
|sort2|Discount|
|sort3|lowest|
|sort4|What|
|sort5|Ratings|
|sort6|Relevance|

Then validate the outcome