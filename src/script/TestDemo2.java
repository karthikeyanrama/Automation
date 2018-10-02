package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.Homepage;
import page.Loginpage;

public class TestDemo2 extends BaseTest {
	@Test(priority=1,groups= {"login","smoke"})
	public void testA() {
		Reporter.log("testA",true);
		String sheet ="TestDemo2";
		String un=Utility.getXlData(INPUT_PATH, sheet, 1, 0);
		System.out.println(un);
		String pw = Utility.getXlData(INPUT_PATH, sheet, 1, 1);
		System.out.println(pw);
		
		Loginpage l1= new Loginpage(driver);
		l1.set_unTB(un);
		l1.set_unPw(pw);
		l1.clickLogin();
		Homepage h1= new Homepage(driver);
		h1.logout();
		
	}

}
