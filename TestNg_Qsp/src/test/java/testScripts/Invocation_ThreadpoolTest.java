package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation_ThreadpoolTest {
	@Test(groups = "Smoke")//(invocationCount = 3,threadPoolSize = 2)
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
	//	driver.get("bhbjkcc");
		Thread.sleep(2000);
		driver.quit();

	}
	//Invocationcount=0 is used to not run the block
	@Test(invocationCount = 0,dependsOnMethods = "register")
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		Thread.sleep(2000);
		driver.quit();

	}
	
	@Test(dependsOnMethods = "login")//(priority = 1)
	public void addTocart() {
		WebDriver driver = new ChromeDriver();
		System.out.println("addToCart");
		driver.quit();
	}
	//enabled = false it wont run that block
	@Test(enabled = false)//(priority = 2)
	public void payMent() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
		
	}

}

