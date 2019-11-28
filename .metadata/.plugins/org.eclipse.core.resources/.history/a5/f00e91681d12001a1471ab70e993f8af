package edaTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.EnterprisePage;
import pageObjects.FilterAddPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class EnterpriseAddTest extends Base {
	public static Logger log =LogManager.getLogger(EnterpriseAddTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void EnterpriseAdd() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getEnterprise().click();
		EnterprisePage ep=new EnterprisePage(driver);
		ep.getName().sendKeys(prop.getProperty("EnerpriseName"));
		ep.getEmail().sendKeys(prop.getProperty("EnterpriseEmail"));
		ep.getPhone().sendKeys(prop.getProperty("EnterprisePhone"));
		ep.getAddress().click();
		ep.getLine1().sendKeys(prop.getProperty("EnterpriseLine1"));
		ep.getLine2().sendKeys(prop.getProperty("EnterpriseLine2"));
		ep.getCity().sendKeys(prop.getProperty("EnterpriseCity"));
		ep.getState().sendKeys(prop.getProperty("EnterpriseState"));
		ep.getPin().sendKeys(prop.getProperty("EnterprisePin"));
		ep.getCountry().sendKeys(prop.getProperty("EnterpriseCountry"));
		ep.getCancel().click();
		ep.getSave().click();
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
