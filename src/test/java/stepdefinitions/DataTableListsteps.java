package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableListsteps {
	
	@Given("user is on registraion page")
	public void user_is_on_registraion_page() {
		System.out.println("user navigates registration page");
	   
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		for(List<String> e: userList)
		{
			System.out.println(e);
		}
	   
	}

	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
	   
		System.out.println("registraion successfull");
	}

	

}
