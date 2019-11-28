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

import pageObjects.CurrentDetailsPage;
import pageObjects.DepartmentAddPage;
import pageObjects.FilterAddPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class CurrentDetailsAddTest extends Base {
	public static Logger log =LogManager.getLogger(CurrentDetailsAddTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void CurrentDetailsAdd() throws IOException, InterruptedException
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
		Thread.sleep(2000);
		LP.getCurrentDetails().click();
		Thread.sleep(2000);
		CurrentDetailsPage cp=new CurrentDetailsPage(driver);
		cp.getCurrent_Department().click();
		cp.getSearch_Department().sendKeys("Development");
		cp.getSearch_Department().sendKeys(Keys.RETURN);
		cp.getCurrent_Project().click();
		cp.getSearch_Project().sendKeys("Project test");
		cp.getSearch_Project().sendKeys(Keys.RETURN);
		cp.getCurrent_View().click();
		Thread.sleep(5000);
		if(cp.getSelect_View().isDisplayed())
		{
		cp.getSelect_View().click();
		}
		cp.getCurrent_Filter().click();
		Thread.sleep(5000);
		if(cp.getSelect_Filter().isDisplayed())
		{
		cp.getSelect_Filter().click();
		}
		cp.getSave().click();
		
		
		
		
		
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
