# DisneyAmazonTestCase
Selenium automation tests for amazon.com, using Google Chrome Webdriver.

<b>Requirements:</b>
<ul>
<li>Java</li>
<li>Selenium WebDriver - https://www.seleniumhq.org/download/</li>
<li>Chrome Driver - https://sites.google.com/a/chromium.org/chromedriver/</li>
</ul>

<hr> 

<h4>&nbsp;Scenario: Search for "mickey mouse stuffed toy", add item successfully to the cart, and fail to login</h4>
<p>&emsp;Given I am on the Amazon homepage</p>
<p>&emsp;Enter "mickey mouse stuffed toy" in the search box</p>
<p>&emsp;Click the "Search" button</p>
<p>&emsp;Verify that the correct results are shown</p>
<p>&emsp;Click on the second item in the result page</p>
<p>&emsp;Click the button "Add to Cart" on the items page</p>
<p>&emsp;Click the button "Cart" on the Added to Cart slideout</p>
<p>&emsp;Then in the Shopping Cart, Mickey Mouse Plush - Medium - 17'' should be visible</p>
<p>&emsp;Click on the "Sign In" button</p>
<p>&emsp;Enter "email@email.com" into the field "Email"</p>
<p>&emsp;Enter "pwd" into the field "Password"</p>
<p>&emsp;Click in the "Sign In" button</p>
<p>&emsp;Then verify that login fails, with invalid credentials</p>

<b>Author:</b>
Chris Garza (chris@azrag.com)