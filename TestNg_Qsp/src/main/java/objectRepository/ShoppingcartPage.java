package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingcartPage {
	
	public ShoppingcartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "CountryId")
	private WebElement countryId;
	
	@FindBy(id = "termsofservice")
	private WebElement checkbox;
	
	@FindBy(id = "checkout")
	private WebElement checkOut;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement removeCheckbox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShopping;

	public WebElement getCountryId() {
		return countryId;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getRemoveCheckbox() {
		return removeCheckbox;
	}

	public WebElement getUpdateShopping() {
		return updateShopping;
	}
	
	
	
	
}	
