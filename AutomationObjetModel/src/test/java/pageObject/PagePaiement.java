package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {

public WebDriver driver;
	
	//creation de constructeur liaison entre driver et class
	
	public PagePaiement(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//identification des elts (design pattern)
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	public WebElement bt_checkout;
	
	@FindBy(how=How.XPATH,using="//textarea[@class='form-control']")
	public WebElement comment_field;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	public WebElement bt_placeOrder;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='name-on-card']")
	public WebElement cardName_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='card-number']")
	public WebElement cardNumber_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='cvc']")
	public WebElement cvc_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='expiry-month']")
	public WebElement monthExp_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='expiry-year']")
	public WebElement yearExp_field;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='pay-button']")
	public WebElement bt_pay;
	
	//creation des methodes
	public void click_checkout_btn () {
		bt_checkout.click();	
	}	
	
	public void Set_comment (String comment) {
		comment_field.sendKeys(comment);	
	}
	
	public void click_placeOrder_btn () {
		bt_placeOrder.click();	
	}
	
	public void Set_cardName (String name) {
		cardName_field.sendKeys(name);	
	}
	
	public void Set_cardNumber (String num) {
		cardNumber_field.sendKeys(num);	
	}
	
	public void Set_cvc (String cvc) {
		cvc_field.sendKeys(cvc);	
	}

	public void Set_monthExp (String month) {
		monthExp_field.sendKeys(month);	
	}
	
	public void Set_yearExp (String year) {
		yearExp_field.sendKeys(year);	
	}
	
	public void click_pay_btn () {
		bt_pay.click();	
	}
}
