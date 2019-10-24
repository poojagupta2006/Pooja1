package Rishpooja;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.LandingPage;
import junit.framework.Assert;

public class ValidateTest extends base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.gettitle().getText(), "Featured Courses");

}

}