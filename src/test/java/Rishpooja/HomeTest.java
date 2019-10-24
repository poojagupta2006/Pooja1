package Rishpooja;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;

public class HomeTest extends base{
	
	@BeforeTest()
	public void open() throws IOException
	{
		driver = initializeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
				LandingPage lp = new LandingPage(driver);
		lp.getlogin().click();
		LoginPage llp = new LoginPage(driver);
		llp.getEmail().sendKeys(Username);
		llp.getPassword().sendKeys(Password);
		llp.getSubmit().click();
		
	}
	@AfterTest()
	public void tear()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="norestricted@gmail.com";
		data[0][1]="pass12";
		data[1][0]="restricted@gmail.com";
		data[1][1]="pass34";
		return data;
		
	}

}
