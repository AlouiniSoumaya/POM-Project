package pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduit {

	public WebDriver driver;
	
	//creation de constructeur liaison entre driver et class
	
	public PageProduit(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//identification des elts (design pattern)

	@FindBy(how=How.XPATH,using="//a[@href='/products']")
	public WebElement bt_product_section;
	
	@FindBy(how=How.XPATH,using="//div[@class='productinfo text-center']")
	public List <WebElement> Product_Cards;
	
	@FindBy(how=How.XPATH,using="//a[@data-product-id='1']")
	public WebElement Add_first_product_btn;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continue_shopping;
	
	@FindBy(how=How.XPATH,using="//a[@data-product-id='2']")
	public WebElement Add_sec_product_btn;
	
	@FindBy(how=How.XPATH,using="//a[@href='/view_cart']")
	public List <WebElement> cart_btn;
	
	
	//creation des methodes
	public void click_product_btn () {
		bt_product_section.click();	
	}	
	
	public void locate_First_PCard () {
		Actions action = new Actions(driver);
		WebElement First_Prod_Card = Product_Cards.get(1);
		action.moveToElement(First_Prod_Card).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickAddFirstProd_btn () {
		Add_first_product_btn.click();	
	}
	
	public void clickContinueShop_btn () {
		continue_shopping.click();	
	}
	
	public void locate_Sec_PCard () {
		Actions action = new Actions(driver);
		WebElement Sec_Prod_Card = Product_Cards.get(2);
		action.moveToElement(Sec_Prod_Card).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickAddSecProd_btn () {
		Add_sec_product_btn.click();	
	}
	
	public void clickCart_btn () {
		WebElement cart = cart_btn.get(1);
		cart.click();	
	}
}
