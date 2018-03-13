package com.webtest.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsite {
        WebDriver driver = null;

		@Given("^I open \"([^\"]*)\"$")
		public void i_open(String Url) throws Throwable {
		  driver = new ChromeDriver();
	      driver.get(Url);
	      driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	      
		}
		
		@When("^I search for \"([^\"]*)\"$")
		public void i_search_for(String bok) throws Throwable {
	     driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(bok);
	     driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();
	   }
	
		
     	@When("^I open the first book$")
		public void i_open_the_first_book() throws Throwable {
		
		driver.findElement(By.linkText("The 4-Hour Workweek: Escape 9-5, Live Anywhere, and Join the New Rich")).click();
		}
		
		@When("^I add the first book to shopping cart$")
		public void i_add_the_first_book_to_shopping_cart() throws Throwable {
		   driver.findElement(By.id("add-to-cart-button")).click();
	    
		}
		
	    @Then("^I should see the book in my shopping cart$")
		public void i_should_see_the_book_in_my_shopping_cart() throws Throwable {
	    	
		String check =  driver.findElement(By.linkText("Added to Cart")).getText();
	    //assert.assertArrayEquals(check.contains("Added to Cart"), "Added to Cart", check);  
		Assert.assertEquals(check.contains("Added to Cart"), check);
		System.out.println("==================The 4hour work week was successfully added to cart============");
		
		driver.close();
	}
		

}
