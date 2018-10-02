package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement s = driver.findElement(By.id("draggable"));
		WebElement t = driver.findElement(By.id("droppable"));
	Actions	action = new Actions(driver);
	action.dragAndDrop(s, t).perform();
		


	}

}
