package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class BooksTest {
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
		
		if(bookspage.getPageTitle().getText().equals("computer"))
			System.out.println("Test case Pass");
		else
			System.out.println("Test case Fail");
			
		driver.quit();
	}

}
