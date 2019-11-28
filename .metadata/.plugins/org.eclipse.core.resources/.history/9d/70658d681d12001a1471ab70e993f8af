package edaTest;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ChangePasswordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.Base;



public class ChangePasswordTest extends Base {
	public static Logger log =LogManager.getLogger(ChangePasswordTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void changePassword() throws IOException, InterruptedException
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
		
		Thread.sleep(3000);
		
		ChangePasswordPage cPp=new ChangePasswordPage(driver);
		cPp.getUser().click();
		cPp.getProfile().click();
		cPp.getChangePasswordButton().click();
		cPp.getOldPassword().sendKeys(prop.getProperty("OldPassword"));
		cPp.getNewPassword().sendKeys(prop.getProperty("NewPassword"));
		cPp.getConfirmPassword().sendKeys(prop.getProperty("NewPassword"));
		cPp.getSave().click();
		log.info("password has been changed");
		cPp.getUser().click();
		//password changed, and log out
		cPp.getSignOut().click();
		//login again
		
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("NewPassword"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		Thread.sleep(2000);
		LandingPage LP=new LandingPage(driver);
		if(LP.getDepartment().isEnabled()) {
			log.info("testcase is passed");
		}
		else {
			log.info("Testcase fail");
			Assert.assertEquals("goooogle", "google");
		}
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
