Feature: Login using Facebook from settings menu, login screen and guest popup

  Scenario: Open app and go as guest then login via Facebook
    Given I am on home page
    When I decide to play as guest
    And I confirm to play as guest
    Then I see How to Play popup and click Next button
    Then I see second slide and close the the popup
#    And I want to unmute
    And I want to close cookie panel
    When I open settings panel
    And I want to login via Facebook
    When I enter valid credentials I login to Facebook
    Then I open settings panel and see Logout button
    And I verify UserID
    Then I click on logout button
    And I go back to the login screen

  Scenario: Open app and login via Facebook from login screen
    Given I am on home page
    And I want to login using Facebook
    When I enter valid credentials I login to Facebook
    Then I open settings panel and see Logout button
    And I verify UserID
    Then I click on logout button
    And I go back to the login screen

  Scenario: Open app as guest then login using Facebook from confirmation popup
    Given I am on home page
    When I decide to play as guest
    Then I decide to login using Facebook
    When I enter valid credentials I login to Facebook
    Then I open settings panel and see Logout button
    And I verify UserID
    Then I click on logout button
    And I go back to the login screen