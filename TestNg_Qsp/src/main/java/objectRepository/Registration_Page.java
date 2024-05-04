package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	
	public Registration_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGenderButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
		
	@FindBy(id="LastName")
	private WebElement  lastNameTextField;

	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id ="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cpwdTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginButton;
	
	
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMaleGenderButton() {
		return maleGenderButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getCpwdTextField() {
		return cpwdTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}


}
