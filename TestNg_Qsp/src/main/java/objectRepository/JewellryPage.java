package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewellryPage {
	
	@FindBy(xpath = "//a[.='Black & White Diamond Heart']/../../..//input[@type='button']")
	private WebElement DiamondHeartAddToCartButton;

	public WebElement getDiamondHeartAddToCartButton() {
		return DiamondHeartAddToCartButton;
	}
	
	

}
