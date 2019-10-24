package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("[text()='Featured Courses']");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}

}
