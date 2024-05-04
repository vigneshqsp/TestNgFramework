package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchField;
	
	@FindBy(css = "[value='Search']")
	private WebElement searchButton;
	
	@FindBy(linkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(linkText = "JEWELRY")
	private WebElement jewelLink;
	
	@FindBy(linkText = "APPAREL & SHOES")
	private WebElement apparellink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getJewelLink() {
		return jewelLink;
	}

	public WebElement getApparellink() {
		return apparellink;
	}
	
	
}
