package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;	
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\Data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\geckodriver.exe");
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}

public void login() throws InterruptedException {

	LoginPage lp=new LoginPage(driver);
	lp.getLogin().click();
	Thread.sleep(1000);
	lp.getUsername().sendKeys(prop.getProperty("username"));
	lp.getPassword().sendKeys(prop.getProperty("password"));
	lp.getOk().click();
	
}


}