package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
@Listeners(Result.class)
public  abstract class BaseTest implements IAutoConst{
	public  WebDriver driver;
	public String url=Utility.getPropertyValue(CONFIG_PATH, "URL");
	String strITO=Utility.getPropertyValue(CONFIG_PATH, "ITO");
	public long lngITO=Long.parseLong(strITO);
	public String strETO =Utility.getPropertyValue(CONFIG_PATH, "ETO");
	public long lngETO=Long.parseLong(strETO);
		static {
		System.setProperty(key, value);
	}
	@Parameters({"ip","browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApplication(@Optional("localhost")String ip,@Optional("chrome")String browser) {
		driver=Utility.openBrowser(driver, "localhost", "chrome");
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod(alwaysRun=true)
	public void closeApplication(ITestResult result) {
		String name = result.getName();
		int status = result.getStatus();
		if(status==2) {
			String path = Utility.getphoto(driver, PHOTO_PATH);
			Reporter.log("Test:"+name+"is failed @photo is"+path,true);
		}
		else
		{
			Reporter.log("Test:"+name+"is PASSED",true);
		}
		
		driver.close();
	}
	

}
