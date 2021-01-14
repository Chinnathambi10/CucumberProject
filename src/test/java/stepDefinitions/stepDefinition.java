package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("User landed on login page using {string}")
	public void user_landed_on_login_page_using(String string) {
	    System.out.println("testing cucumber fraework");
	}

	@When("User given valid username and password")
	public void user_given_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("Front page should be displayed")
	public void front_page_should_be_displayed() {

	}

	@Then("frequently user cards displayed")
	public void frequently_user_cards_displayed() {
	}

	@Then("Account number card is not displayed")
	public void account_number_card_is_not_displayed() {
		System.out.println("End testing************************************");
	}

}
