package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.Loginpage;

public class TestDemo2 extends BaseTest {
	@Test
	public void testA() {
		Reporter.log("testA",true);
		Loginpage l1= new Loginpage(driver);
		l1.set_unTB("admin");
		l1.set_unPw("manager");
		l1.clickLogin();
	}

}
