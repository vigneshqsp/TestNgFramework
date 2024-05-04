package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {
	public DesktopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "product_attribute_16_5_4")
	private WebElement processor;
	
	@FindBy(id = "product_attribute_16_6_5")
	private WebElement ram;
	
	@FindBy(id = "product_attribute_16_3_6_19")
	private WebElement hdd;
	
	@FindBy(id = "product_attribute_16_4_7_21")
	private WebElement os;
	
	@FindBy(id = "product_attribute_16_8_8_22")
	private WebElement software;
	
	@FindBy(id = "addtocart_16_EnteredQuantity")
	private WebElement quantity;
	
	@FindBy(css = "[value='Email a friend']")
	private WebElement emailaFriend;
	
	@FindBy(css = "[value='Add to compare list']")
	private WebElement addComparelist;
	
	@FindBy(id = "add-to-cart-button-16")
	private WebElement addTocart;
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shoppingCart;
	
	@FindBy(linkText = "YouTube")
	private WebElement youTubelink;
	
	@FindBy(linkText = "My account")
	private WebElement myAccount;
	
	@FindBy(linkText = "Orders")
	private WebElement orders;
	
	@FindBy(linkText = "Addresses")
	private WebElement address;
	
	
	@FindBy(linkText = "Recently viewed products")
	private WebElement viewedProducts;
	
	@FindBy(linkText = "New products")
	private WebElement newProduct;
	
	@FindBy(id = "FriendEmail")
	private WebElement friendsmail;
	
	@FindBy(css = "[value='Send email']")
	private WebElement sendEmail;
	

	public WebElement getSendEmail() {
		return sendEmail;
	}

	public WebElement getFriendsmail() {
		return friendsmail;
	}

	public WebElement getProcessor() {
		return processor;
	}

	public WebElement getRam() {
		return ram;
	}

	public WebElement getHdd() {
		return hdd;
	}

	public WebElement getOs() {
		return os;
	}

	public WebElement getSoftware() {
		return software;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getEmailaFriend() {
		return emailaFriend;
	}

	public WebElement getAddComparelist() {
		return addComparelist;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getYouTubelink() {
		return youTubelink;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getOrders() {
		return orders;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getViewedProducts() {
		return viewedProducts;
	}

	public WebElement getNewProduct() {
		return newProduct;
	}
	
	
	
	
	
	
	
	
}
