Feature: Validate the new price information after applying the promocode if not applied before

Scenario: Check the price of selected item in the cart

Given Launch the application URL
When Mouse over for selecting All Categories link
And Select Offers link
And Select Health and Safety
And Clicking on a link under Health and Safety
And Select an item
And Capture the price of the selected item
And Goto the cart and view the cart