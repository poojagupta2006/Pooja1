package Rishpooja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\pooja\\Rishpoojava\\src\\main\\java\\Rishpooja\\data.properties");
	prop.load(fis);
	//String browsername = System.getProperty("browser"); - if we need to pass the browser via jenkings
	//mvn test -Dbrowser=chrome
	String browserName =prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		if(browserName.contains("headless"))
		{
				options.addArguments("headless");
		}
		driver = new ChromeDriver(options);
		
	}
	else if(browserName.equals("firefox"))
	{
		
	}else if(browserName=="IE") 
	{
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}

}
