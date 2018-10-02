package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sasi/Desktop/page1.html");
		//using index 
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("a");
		// using string
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		//using webelement
		 WebElement e = driver.findElement(By.id("t2"));
		 driver.switchTo().frame(e);
		 driver.findElement(By.id("t2")).sendKeys("c");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("t1")).sendKeys("c");
		

	}

}
