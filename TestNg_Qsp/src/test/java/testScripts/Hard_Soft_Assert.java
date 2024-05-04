package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class Hard_Soft_Assert {
	@Test
	public void books_001() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage = new WelcomePage(driver);
		BooksPage bookspage = new BooksPage(driver);
		//click on books link
		welcomepage.getBookslink().click();
		String actualResult = bookspage.getPageTitle().getText();
		//verify Books page is displayed
		//HardAssert(static)  is failed stopped the execution
		
//		Assert.assertEquals(actualResult, "Computer");
		
//		Instead of if and else we using Assertions that is soft and Hard Assert
	//	if(bookspage.getPageTitle().getText().equals("computer"))
//			System.out.println("Test case Pass");
//		else
//			System.out.println("Test case Fail");
		
		//softAssert(NonStatic)
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualResult, "Computer");
		driver.quit();
		//It will show the Exception
		soft.assertAll();
	}
}
