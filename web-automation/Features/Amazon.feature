Feature: Search book on google
  
  In order to purchase it later As a consumer
  I want to add a book to my shopping cart

  Scenario: Consumer can saerch products
  
		     Given I open "https://www.google.com/"
		     When search for "The Lean Startup"
		     And I open the first book
		     Given i add the first book to shopping cart
		     Then I should see the book in my shopping cart
		     Then close browser