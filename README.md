# DisneyAmazonTestCase
Selenium automation tests for amazon.com, using Google Chrome Webdriver.

<p>&nbsp;Scenario: Search for a mickey mouse stuffed toy, add the item successfully to the car, and fail to log in
<p>&emsp;Given I am on the Amazon homepage</p>
<p>&emsp;Enter "mickey mouse stuffed toy" in the search box</p>
<p>&emsp;Click the "Search" button</p>
<p>&emsp;Verify that the correct results are shown</p>
<p>&emsp;Click in the image of the first result in the search list result page</p>
<p>&emsp;Click the button "Add to Cart" on the items page</p>
<p>&emsp;Click the button "View Your Cart" in the "Add to Cart" page</p>
<p>&emsp;Then in My Cart, should be populated with the item Mickey Mouse Plush - Medium - 17''</p>
<p>&emsp;Click in the "Sign In" button</p>
<p>&emsp;Enter "email@email.com" into the field "Email"</p>
<p>&emsp;Enter "pwd" into the field "Password"</p>
<p>&emsp;Click in the "Sign In" button</p>
<p>&emsp;Then verify that login fails, with invalid credentials</p>
</p>

<b>Requirements:</b>
<ul>
<li>Java</li>
<li>Selenium WebDriver - https://www.seleniumhq.org/download/</li>
<li>Chrome Driver - https://sites.google.com/a/chromium.org/chromedriver/</li>
</ul>

<b>Author:</b>
Chris Garza (chris@azrag.com)