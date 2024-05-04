package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.ApparelandShoesPage;
import objectRepository.CheckoutPage;
import objectRepository.DesktopPage;
import objectRepository.Logout_Page;
import objectRepository.MyaccountPage;
import objectRepository.Registration_Page;
import objectRepository.SearchStore;
import objectRepository.ShoppingcartPage;
import objectRepository.WelcomePage;

public class TestNG_Task1 {
	@Test
	public void RegisteranAccnt() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.getRegisterLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getMaleGenderButton().click();
		createacc.getFirstNameTextField().sendKeys("Vignesh");
		createacc.getLastNameTextField().sendKeys("S");
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getCpwdTextField().sendKeys("Password@123");
		createacc.getRegisterButton().click();
		System.out.println("Test case 1 pass");
		driver.quit();

	}

	@Test(groups = "Smoke")
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// search on product
		SearchStore search = new SearchStore(driver);
		search.getSearchstore().sendKeys("computer");
		search.getSearchButton().click();
		// click on desktop
		search.getComputerimg().click();
		// select processor
		DesktopPage desktop = new DesktopPage(driver);
		Select selectprocessor = new Select(desktop.getProcessor());
		selectprocessor.selectByIndex(1);
		// select Ram
		Select selectram = new Select(desktop.getRam());
		selectram.selectByIndex(2);
		// select Hdd
		desktop.getHdd().click();
		// select Os
		desktop.getOs().click();
		// select Software
		desktop.getSoftware().click();
		// select Quantity
		desktop.getQuantity().clear();
		desktop.getQuantity().sendKeys("3");
		// click on Addtocart
		desktop.getAddTocart().click();
		// click on shopping cart
		desktop.getShoppingCart().click();
		// select country id
		ShoppingcartPage shoppingcart = new ShoppingcartPage(driver);
		Select selectshoppingcart = new Select(shoppingcart.getCountryId());
		selectshoppingcart.selectByVisibleText("India");
		// click on checkbox
		shoppingcart.getCheckbox().click();
		// click on checkout
		shoppingcart.getCheckOut().click();
		// confirm order
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.getBillingaddress().click();
		checkout.getShippingaddress().click();
		checkout.getShippingMethod().click();
		checkout.getPaymentMethod().click();
		checkout.getPaymentInfo().click();
		checkout.getConfirmOrder().click();
		checkout.getOrderDetails().click();
		// Click on Logout
		Logout_Page logout = new Logout_Page(driver);
		logout.getLogout().click();
		System.out.println("smoke1");
		driver.quit();

	}

	@Test(groups = "Smoke")
	public void removeaCart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// search on product
		SearchStore search = new SearchStore(driver);
		search.getSearchstore().sendKeys("computer");
		search.getSearchButton().click();
		// click on desktop
		search.getComputerimg().click();
		// select processor
		DesktopPage desktop = new DesktopPage(driver);
		Select selectprocessor = new Select(desktop.getProcessor());
		selectprocessor.selectByIndex(1);
		// select Ram
		Select selectram = new Select(desktop.getRam());
		selectram.selectByIndex(2);
		// select Hdd
		desktop.getHdd().click();
		// select Os
		desktop.getOs().click();
		// select Software
		desktop.getSoftware().click();
		// select Quantity
		desktop.getQuantity().clear();
		desktop.getQuantity().sendKeys("3");
		// click on Addtocart
		desktop.getAddTocart().click();
		// click on shopping cart
		desktop.getShoppingCart().click();

		ShoppingcartPage shoppingcart = new ShoppingcartPage(driver);
		shoppingcart.getRemoveCheckbox().click();
		shoppingcart.getUpdateShopping().click();
		driver.quit();

	}

	@Test(groups = "Smoke")
	public void editCustomerInfo() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// Click on My account
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getMyAccount().click();
		// edit customer info
		MyaccountPage myaccount = new MyaccountPage(driver);
		myaccount.getEditFirstname().clear();
		myaccount.getEditFirstname().sendKeys("vigneshwaran");
		myaccount.getSavecusinfo().click();
		driver.quit();

	}

	@Test(groups = "Smoke")
	public void editaddress() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// Click on My account
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getAddress().click();
		// edit address
		MyaccountPage myaccount = new MyaccountPage(driver);
		myaccount.getEdit().click();
		Select selectcountry = new Select(myaccount.getCountryaddress());
		selectcountry.selectByVisibleText("Australia");
		myaccount.getSaveaddress().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void emailaFriend() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// search on product
		SearchStore search = new SearchStore(driver);
		search.getSearchstore().sendKeys("computer");
		search.getSearchButton().click();
		// click on desktop
		search.getComputerimg().click();
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getEmailaFriend().click();
		desktop.getFriendsmail().sendKeys("rockyboy30@gmail.com");
		desktop.getSendEmail().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void addaWishlist() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// Click on apparel&shoes
		ApparelandShoesPage shoe = new ApparelandShoesPage(driver);
		shoe.getShoe().click();
		shoe.getBlueSneaker().click();
		shoe.getAddTowishlist().click();
		shoe.getWishlist().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void compareList() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// Click on apparel&shoes
		ApparelandShoesPage shoe = new ApparelandShoesPage(driver);
		shoe.getShoe().click();
		shoe.getBlueSneaker().click();
		shoe.getComparedList().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void youetubelink() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// click on youtube link
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getYouTubelink().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void Orders() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// click on youtube link
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getOrders().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void clickAddress() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// click on Orders link
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getAddress().click();
		driver.quit();

	}
	@Test(groups = "Smoke")
	public void recentProduct() {
		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		// click on login link
		welcomepage.getLoginLink().click();
		Registration_Page createacc = new Registration_Page(driver);
		createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		createacc.getPasswordTextField().sendKeys("Password@123");
		createacc.getLoginButton().click();
		// click on RecentlyviewProduct link
		DesktopPage desktop = new DesktopPage(driver);
		desktop.getViewedProducts().click();
		driver.quit();
	}

	@Test(groups = "Smoke")
	public void newproduct() {
		// Launch browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WelcomePage welcomepage = new WelcomePage(driver);
				// click on login link
				welcomepage.getLoginLink().click();
				Registration_Page createacc = new Registration_Page(driver);
				createacc.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
				createacc.getPasswordTextField().sendKeys("Password@123");
				createacc.getLoginButton().click();
				// click on NewProduct link
				DesktopPage desktop = new DesktopPage(driver);
				desktop.getNewProduct().click();
				driver.quit();
				
			
	}
	
	
	
	
	
}
