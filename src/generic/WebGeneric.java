package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebGeneric {
	public static void verifyPageIsDisplayed(WebDriver driver,long time,String partialURL) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		try {
			wait.until(ExpectedConditions.urlContains(partialURL));
			Reporter.log("Req page is diplayed",true);
		}
		catch(Exception e) {
			Reporter.log("Reg page is not displayed",true);
			Assert.fail();
		}
	}

}
