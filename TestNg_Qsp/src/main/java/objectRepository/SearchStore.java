package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchStore {
	public SearchStore(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchstore;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='product-item']//img[@title='Show details for Build your own computer']")
	private WebElement computerimg;
	

	public WebElement getSearchstore() {
		return searchstore;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getComputerimg() {
		return computerimg;
	}
	
	
}
