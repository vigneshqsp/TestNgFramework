package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelandShoesPage {

	public ApparelandShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "APPAREL & SHOES")
	private WebElement shoe;

	@FindBy(xpath = "//div[@class='product-item']//a[@title='Show details for Blue and green Sneaker']")
	private WebElement blueSneaker;

	@FindBy(id = "add-to-wishlist-button-28")
	private WebElement addTowishlist;

	@FindBy(xpath = "//span[.='Wishlist']")
	private WebElement wishlist;

	@FindBy(css = "[value='Add to compare list']")
	private WebElement comparedList;
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement apparelTitle;
	
	
	public WebElement getComparedList() {
		return comparedList;
	}

	public WebElement getShoe() {
		return shoe;
	}

	public WebElement getBlueSneaker() {
		return blueSneaker;
	}

	public WebElement getAddTowishlist() {
		return addTowishlist;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getApparelTitle() {
		return apparelTitle;
	}
	
	
	
	

}
