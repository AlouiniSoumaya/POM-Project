package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome;
import pageObject.PageProduit;

public class AddProductStepDefinition {
	
	//linker les driver
		WebDriver driver = SetUp.driver;
		PageHome home = new PageHome (driver);
		PageProduit Product = new PageProduit (driver);
		
		
	@Given("Click on product button")
	public void click_on_product_button() {
	    Product.click_product_btn();
	}
	
	@When("Hover on First porduct")
	public void hover_on_first_porduct() {
	   Product.locate_First_PCard();
	}

	@When("Click on Add to cart button first product")
	public void click_on_add_to_cart_button_first_product() {
	    Product.clickAddFirstProd_btn();
	}

	@When("Click on Continue Shopping button")
	public void click_on_continue_shopping_button() {
	    Product.clickContinueShop_btn();
	}
	
	@When("Hover on Second Product")
	public void hover_on_second_product() {
	   Product.locate_Sec_PCard();
	}

	@When("click on Add to cart button second product")
	public void click_on_add_to_cart_button_second_product() {
	    Product.clickAddSecProd_btn();
	}

	@Then("Click View Cart button")
	public void click_view_cart_button() {
	    Product.clickCart_btn();
	}


}
