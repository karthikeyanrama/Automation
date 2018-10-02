package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class Homepage extends BaseTest {

	private WebDriver driver;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	public Homepage(WebDriver driver) {
		this.driver=driver;//initialization
	PageFactory.initElements(driver, this);
	}
	public void logout() {
		logout.click();
		
		
	}
	
	
	


}
