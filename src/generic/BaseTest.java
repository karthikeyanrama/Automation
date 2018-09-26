package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  abstract class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
	}
	@AfterMethod
	public void closeApplication() {
		driver.close();
	}
	

}
