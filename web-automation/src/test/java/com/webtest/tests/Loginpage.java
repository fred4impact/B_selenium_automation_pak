package com.webtest.tests;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpage {


@Given("^A user is on gumtree\\.com  login page$")
public void a_user_is_on_gumtree_com_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is on gumtree");
    
}

@When("^User click on login link on the home page$")
public void user_click_on_login_link_on_the_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User clicks on login link");
    
}

@Then("^User enter valid email and password$")
public void user_enter_valid_email_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User enteres valid username and valid password");
}

@Then("^click on login button$")
public void click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User clicked onthe login button");
}

@Then("^User should see welcome to gumtree$")
public void user_should_see_welcome_to_gumtree() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is logged in to gumtree");
}


}
