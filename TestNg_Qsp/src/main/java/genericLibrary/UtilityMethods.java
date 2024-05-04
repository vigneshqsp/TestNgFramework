package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods{

	public static void getWebPageScreenshot(WebDriver driver) {
		// step 1
		TakesScreenshot ts = (TakesScreenshot) driver;

		// step 2

		File temp = ts.getScreenshotAs(OutputType.FILE);
		// step 3

		File permanent = new File("./ScreenShots/"+ getTime() + ".png");

		// step 4

		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getWebElementScreenShot(WebElement element) {

		// Step 1
		File temp = element.getScreenshotAs(OutputType.FILE);

		// step 2

		File permanent = new File("./ScreenShots/"+ getTime()+".png");

		// step 3	

		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String getTime() {
		
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}

}
