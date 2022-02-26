Feature: Add searched item to Amazon cart and attempt to login

  Scenario: Search for a mickey mouse stuffed toy, add item to your cart, and attemp to login
    Given On the Amazon homepage
    And Enter "mickey mouse stuffed toy" in the search box
    And Click the "Search" button
    And Verify that the correct results are shown
    And Click the image of the second result on the page
    And Click the "Add to Cart" button on the item page
    And Click the button "Cart" on the slideout menu
    Then My Cart should be populated with the item Mickey Mouse Plush - Medium - 17''

  Scenario: Attemp to sign into Amazon
    Given on an Amazon page
    And Click the "Sign In" button
    And I enter "email@email.com" into the field "Email"
    And I enter "pwd" into the field "Password"
    And I click in the "Sign In" button
    Then receive error message when attemp to login fails