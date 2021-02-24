Feature: Spicejet land page validation
Scenario: Fill Passanger details
Given launch SpiceJet website
And Select trip "Round trip" radio button
And Select from "Pune"
And Select To "Delhi"
And Select departure date as "25 Sep"
And Select Passenger "adult 2" and  "Child 1"
And Select currency as "INR"
Then All details should be select successfully
And Close window

