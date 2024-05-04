package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.org.apache.bcel.internal.classfile.Method;

import objectRepository.Logout_Page;
import objectRepository.Registration_Page;
import object_Repository.Welcome_page;

public class BaseClass extends UtilityMethods{

	public WebDriver driver;
	public static ExtentReports report;	
	public static ExtentTest test;

	@BeforeSuite
	public void bs() {
		 report = new ExtentReports("./Reports/report.html");
		
		System.out.println("Before Suite");

	}

	@BeforeTest
	public void bt() {
		System.out.println("Before Test");

	}

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Class");

	}

	@BeforeMethod
	public void login(Method method) {	
	String methodName=method.getName();
	test=report.startTest(methodName);
		Welcome_page welcome = new Welcome_page(driver);
		welcome.getLoginLink().click();
		Registration_Page register = new Registration_Page(driver);
		register.getEmailTextField().sendKeys("vigneshselvam106@gmail.com");
		register.getPasswordTextField().sendKeys("Password@123");
		register.getLoginButton().click();

		System.out.println("Before Method");

	}

	@AfterSuite
	public void as() {
		report.flush();
		System.out.println("After Suite");

	}

	@AfterTest
	public void at() {
		System.out.println("After Test");

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterMethod
	public void logout() {
		report.endTest(test);
		Logout_Page logout = new Logout_Page(driver);
		logout.getLogout().click();

	}

}
