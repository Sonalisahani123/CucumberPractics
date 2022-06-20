package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	@Given("User select the car type {string} from uber app")
	public void user_select_the_car_type_from_uber_app(String carType) {
		System.out.println("Step 1:"+ carType);
	  
	}

	@When("User wants to travel from {string} to {string}")
	public void user_wants_to_travel_from_to(String pickupLocation, String dropLocation) {
		System.out.println("Step 2:"+ pickupLocation+" " + dropLocation);
	    
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3:");
	    
	}

	@Then("Driver end the journey")
	public void driver_end_the_journey() {
		System.out.println("step 4:");
	    
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		 System.out.println("step 5:" + price);
		
	    
	}


}
