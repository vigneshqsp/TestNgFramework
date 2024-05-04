package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.JewellryPage;
import objectRepository.WelcomePage;

public class Jewellry_Test extends BaseClass{

	@Test
	public void jewellry_001() {
		WelcomePage welcome = new WelcomePage(driver);
		JewellryPage jewelry = new JewellryPage();
		welcome.getJewelLink().click();
		
		//get the jewellery page Screenshot
		
	//	getWebPageScreenshot(driver);
		
		//Get the screenshot of add to cart button
		
		getWebElementScreenShot(jewelry.getDiamondHeartAddToCartButton());

	}
	
	

	
}
