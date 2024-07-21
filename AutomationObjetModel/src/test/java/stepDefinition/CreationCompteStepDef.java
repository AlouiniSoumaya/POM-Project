package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome;

public class CreationCompteStepDef {
	//linker les driver
	WebDriver driver = SetUp.driver;
	PageHome home = new PageHome (driver);
	
	@Given("add url {string}")
	public void add_url(String string) {
	home.GetUrl(string);
	}

	@Given("click on signupp btn")
	public void click_on_signupp_btn() {
	home.cliquer_sur_bt_signlogin();
	}

	@Given("add a name {string}")
	public void add_a_name(String string) {
	 home.set_name_signup(string);
	}

	@Given("add an email address {string}")
	public void add_an_email_address(String string) {
	 home.set_email_signup(string);
	}

	@When("click on signup btn")
	public void click_on_signup_btn() {
	 home.signup_btn();
	}

	@When("check title checkbox {string}")
	public void check_title_checkbox(String string) {
	home.select_gender();  
	}

	@When("add password {string}")
	public void add_password(String string) {
	home.set_password(string);
	}

	@When("choose day {string} , month {string} , year {string}")
	public void choose_day_month_year(String string, String string2, String string3) {
	    home.set_birth_date(string, string2, string3);
	}

	@When("add a first name and a last name {string} {string}")
	public void add_a_first_name_and_a_last_name(String string, String string2) {
	   home.set_firstname_signup(string);
	   home.set_lastname_signup(string2);
	}

	@When("add an address {string}")
	public void add_an_address(String string) {
		home.set_address_signup(string);
	}

	@When("select country {string}")
	public void select_country(String string) {
		home.set_country_signup(string);
	}

	@When("add a state and a city  {string} {string}")
	public void add_a_state_and_a_city(String string, String string2) {
		home.set_state_signup(string);
		home.set_city_signup(string2);
	}

	@When("add a zipcode {string}")
	public void add_a_zipcode(String string) {
	   home.set_zipcode_signup(string);
	}

	@When("add a mobile number {string}")
	public void add_a_mobile_number(String string) {
		home.set_mobile_num_signup(string);
	}

	@When("click on create account btn")
	public void click_on_create_account_btn() {
	    home.click_create_acct_btn();
	}

	@Then("verify that account is created successfully {string}")
	public void verify_that_account_is_created_successfully(String string) {
	    Assert.assertEquals(string,home.textAffiche());
	}
	@Then("Add email address  {string}")
	public void add_email_address(String string) {
	   home.set_email_login(string);
	}

	@Then("Add a password {string}")
	public void add_a_password(String string) {
	   home.set_password_login(string);
	}

	@Then("click on login btn")
	public void click_on_login_btn() {
	   home.click_login_btn();
	}

	@Then("Verify that user logged in successfully")
	public void verify_that_user_logged_in_successfully(String string) {
		 Assert.assertEquals(string,home.text_compte_loggedin);
	}
	
}
