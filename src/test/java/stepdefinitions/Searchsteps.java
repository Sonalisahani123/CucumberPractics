package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("I search  for a product  with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("product  with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
