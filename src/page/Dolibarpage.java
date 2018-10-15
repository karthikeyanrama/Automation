package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dolibarpage {
	private WebDriver driver;
	@FindBy(linkText="Logout")
	private WebElement logout;
	public Dolibarpage(WebDriver driver) {	
		this.driver=driver;//initialization
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		logout.click();
	}
	

}
