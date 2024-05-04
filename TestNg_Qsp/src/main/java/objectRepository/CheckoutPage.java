package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[onclick='Billing.save()']")
	private WebElement Billingaddress;
	
	@FindBy(css = "[onclick='Shipping.save()']")
	private WebElement Shippingaddress;
	
	@FindBy(css = "[onclick='ShippingMethod.save()']")
	private WebElement ShippingMethod;
	
	@FindBy(css = "[onclick='PaymentMethod.save()']")
	private WebElement paymentMethod;
	
	@FindBy(css = "[onclick='PaymentInfo.save()']")
	private WebElement paymentInfo;
	
	@FindBy(css = "[onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;
	
	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetails;

	public WebElement getBillingaddress() {
		return Billingaddress;
	}

	public WebElement getShippingaddress() {
		return Shippingaddress;
	}

	public WebElement getShippingMethod() {
		return ShippingMethod;
	}

	public WebElement getPaymentMethod() {
		return paymentMethod;
	}

	public WebElement getPaymentInfo() {
		return paymentInfo;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getOrderDetails() {
		return orderDetails;
	}
	

}
