package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  {
	private WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement unTB;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement unPW;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	public Loginpage(WebDriver driver) {	
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