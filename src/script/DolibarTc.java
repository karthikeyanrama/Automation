package script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.Dolibarpage;
import page.LoginDolibar;

public class DolibarTc extends BaseTest {
	@Test(priority=1,groups= {"smoke"})
	public void testOrangeTc1() {
		String un=Utility.getXlData(INPUT_PATH, "sheet1", 1, 0);
		String pw=Utility.getXlData(INPUT_PATH, "sheet1", 1, 1);
		String dpURL=Utility.getXlData(INPUT_PATH, "sheet1", 1, 2);
		String lpURL=Utility.getXlData(INPUT_PATH, "sheet1", 1, 3);
		
		Reporter.log("testA",true);
		//ENTER VALID USERNAME& PASSWORD
		
		LoginDolibar l1 = new LoginDolibar(driver);
		l1.set_unTB(un);
		l1.set_unPw(pw);
		l1.clickLogin();
		//verify Dolibar page is displayed or not
		WebGeneric.verifyPageIsDisplayed(driver, lngETO, dpURL);
		Dolibarpage h1= new Dolibarpage(driver);
		//CLICK ON LOGOUT
		h1.logout();
		//verify loginpage is displayed or not
		WebGeneric.verifyPageIsDisplayed(driver, lngETO, lpURL);
		
	}

}
