package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority_Dependson_Test {
	@Test//(priority = -1)
	public void register() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
	//	driver.get("bhbjkcc");
		driver.quit();

	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.quit();

	}
	
	@Test(dependsOnMethods = "login")//(priority = 1)
	public void addTocart() {
		WebDriver driver = new ChromeDriver();
		System.out.println("addToCart");
		driver.quit();
	}
	@Test(dependsOnMethods = "addTocart")//(priority = 2)
	public void payMent() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.quit();

	}
	
	

}
