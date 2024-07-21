package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome;
import pageObject.PagePaiement;
import pageObject.PageProduit;

public class PaiementStepDefinition {
	//linker les driver
	WebDriver driver = SetUp.driver;
	PageHome home = new PageHome (driver);
	PageProduit Product = new PageProduit (driver);
	PagePaiement payment = new PagePaiement (driver);
	
	
	@Given("Click on proceed to checkout btn")
	public void click_on_proceed_to_checkout_btn() {
	    payment.click_checkout_btn();
	}

	@Given("Add a comment {string}")
	public void add_a_comment(String string) {
	   payment.Set_comment(string);
	}

	@When("Click on palce order btn")
	public void click_on_palce_order_btn() {
	  payment.click_placeOrder_btn();
	}

	@When("Add a name {string} on the card")
	public void add_a_name_user1_on_the_card(String string) {
	  payment.Set_cardName(string);
	}

	@When("Add acard number {string}")
	public void add_acard_number(String string) {
	  payment.Set_cardNumber(string);
	}

	@When("Add a cvc {string} an expiration day {string} and an expiration year {string}")
	public void add_a_cvc_an_expiration_day_and_an_expiration_year(String string1, String string2, String string3) {
	 
	payment.Set_cvc(string1);
	payment.Set_monthExp(string2);
	payment.Set_yearExp(string3);
	}

	@Then("Clicko on pay an confirm order btn")
	public void clicko_on_pay_an_confirm_order_btn() {
	   payment.click_pay_btn(); 
	}

	
}
