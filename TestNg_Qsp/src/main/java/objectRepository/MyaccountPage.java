package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPage {
	
	public MyaccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "FirstName")
	private WebElement editFirstname;
	
	@FindBy(xpath = "//input[@name='save-info-button']")
	private WebElement savecusinfo;

	public WebElement getEditFirstname() {
		return editFirstname;
	}

	public WebElement getSavecusinfo() {
		return savecusinfo;
	}
	
	@FindBy(css = "[value='Edit']")
	private WebElement edit;
	
	@FindBy(id = "Address_CountryId")
	private WebElement countryaddress;
	
	@FindBy(css = "[value='Save']")
	private WebElement saveaddress;

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCountryaddress() {
		return countryaddress;
	}

	public WebElement getSaveaddress() {
		return saveaddress;
	}
	
	
	

}
