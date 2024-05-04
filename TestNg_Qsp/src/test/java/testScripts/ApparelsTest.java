package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepository.ApparelandShoesPage;
import objectRepository.WelcomePage;

public class ApparelsTest extends BaseClass{
	@Test
	public void apparel_001() {
		
		WelcomePage welcome = new WelcomePage(driver);
		
		ApparelandShoesPage apparel = new ApparelandShoesPage(driver);
		
		//click on apparel link
		welcome.getApparellink().click();
		test.log(LogStatus.INFO, "Clicked on Apparels link");
		
		//Verify Apparel Page is displayed
		
		Assert.assertEquals(apparel.getApparelTitle().getText(), "Apparel & Shoes");
		
		test.log(LogStatus.PASS, "Apparels page is displayed");
		
		
		
//		Reporter.log("reportgenerated",true);


	}

}
