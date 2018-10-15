package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDolibarpage {
	private WebDriver driver;
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(id="password")
	private WebElement unPW;
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement loginBTN;
	public LoginDolibarpage(WebDriver driver) {	
		this.driver=driver;//initialization
		PageFactory.initElements(driver, this);
	}
	public void set_unTB( String un ) //utilization
	{
		unTB.sendKeys(un);
	
	}
	public void set_unPw(String pw) {
		unPW.sendKeys(pw);
		
	}
	public void clickLogin() {                 
		loginBTN.click();
					
	



}
}