Feature: Add a book to my shopping cart
  In order to purchase it later
  As a consumer
  I want to add a book to my shopping cart

  Scenario: Consumer can add a book to shopping cart
    Given I open "https://www.amazon.com/"
    When I search for "the 4 hour work week"
    And I open the first book
    And I add the first book to shopping cart
    Then I should see the book in my shopping cart
