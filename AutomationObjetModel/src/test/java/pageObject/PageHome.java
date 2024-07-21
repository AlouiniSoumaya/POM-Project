package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageHome {

	public WebDriver driver;
	
	//creation de constructeur liaison entre driver et class
	
	public PageHome(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//identification des elts (design pattern)
	
	@FindBy(how=How.XPATH,using="//a[@href='/login']")
	public WebElement bt_signupLogin;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-name']")
	public WebElement signup_name_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-email']")
	public WebElement signup_email_field;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='signup-button']")
	public WebElement cliquer_sur_signup_btn;
	
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement select_gender_checkbox;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='password']")
	public WebElement set_password;
	
	@FindBy(how=How.XPATH,using="//select[@data-qa='months']")
	public WebElement day_birth;
	
	@FindBy(how=How.XPATH,using="//select[@data-qa='months']")
	public WebElement month_birth;
	
	@FindBy(how=How.XPATH,using="//select[@data-qa='years']")
	public WebElement year_birth;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='first_name']")
	public WebElement first_name_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='last_name']")
	public WebElement last_name_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='address']")
	public WebElement address_field;
	
	@FindBy(how=How.XPATH,using="//select[@data-qa='country']")
	public WebElement country_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='state']")
	public WebElement state_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='city']")
	public WebElement city_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='zipcode']")
	public WebElement zipcode_field;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='mobile_number']")
	public WebElement mobile_number_field;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='create-account']")
	public WebElement create_acct_btn;
	
	@FindBy(how=How.XPATH,using="//b[contains(text(),'Account Created!')]")
	public WebElement text_compte_creer;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-email']")
	public WebElement email_address_Login;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-password']")
	public WebElement password_Login;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='login-button']")
	public WebElement Login_btn;
	
	@FindBy(how=How.XPATH,using="//p[text()='Your email or password is incorrect!']")
	public WebElement text_compte_loggedin;
	
	//creation des methodes
	public void GetUrl(String url) {
		driver.get(url);
		}	
	public void cliquer_sur_bt_signlogin () {
		bt_signupLogin.click();	
		}
	public void set_name_signup (String name) {
		signup_name_field.sendKeys(name);
	}
	public void set_email_signup (String mail) {
		signup_email_field.sendKeys(mail);
	}
	public void signup_btn () {
		cliquer_sur_signup_btn.click();	
	}
	public void select_gender () {
		Actions action = new Actions(driver);		
		action.click(select_gender_checkbox).perform();
	}
	public void set_password (String password) {
		 set_password.sendKeys(password);
	}
	public void set_birth_date(String day, String month, String year) {
		Select set_day_birth = new Select(day_birth);
		set_day_birth.selectByValue(day);	
		Select set_month = new Select(month_birth);
		set_month.selectByValue(month);		
		Select set_year = new Select(year_birth);
		set_year.selectByValue(year);	
	}
	public void set_firstname_signup (String firstName) {
		first_name_field.sendKeys(firstName);
	}
	public void set_lastname_signup (String lastName) {
		last_name_field.sendKeys(lastName);
	}
	public void set_address_signup (String address) {
		address_field.sendKeys(address);
	}
	public void set_country_signup (String country) {
		country_field.sendKeys(country);
	}
	public void set_state_signup (String state) {
		state_field.sendKeys(state);
	}
	public void set_city_signup (String city) {
		city_field.sendKeys(city);
	}
	public void set_zipcode_signup (String zipcode) {
		zipcode_field.sendKeys(zipcode);
	}
	public void set_mobile_num_signup (String mobNum) {
		mobile_number_field.sendKeys(mobNum);
	}
	public void click_create_acct_btn () {
		create_acct_btn.click();	
	}
	public String textAffiche() {
		String txt_obtenu = text_compte_creer.getText();
		return txt_obtenu;
	}
	public void set_email_login (String email) {
		email_address_Login.sendKeys(email);
		}
	public void set_password_login (String password) {
		password_Login.sendKeys(password);
		}	
	public void click_login_btn () {
		Login_btn.click();
		}	
	public String textLoggInAffiche() {
		String txt_obtenu = text_compte_loggedin.getText();
		return txt_obtenu;
		}
}

