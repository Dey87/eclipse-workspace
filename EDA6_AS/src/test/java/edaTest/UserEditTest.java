package edaTest;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProjectAddPage;
import pageObjects.ProjectPage;
import pageObjects.SearchTablePage;
import pageObjects.UserAddPage;
import pageObjects.UserPage;
import pageObjects.WelcomePage;
import resource.Base;



public class UserEditTest extends Base {
	
	public static Logger log =LogManager.getLogger(UserEditTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void UserEdit() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("add a project with valid data");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("login has done successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		//Thread.sleep(3000);
		LP.getUser().click();
		log.info("enter user page");
		UserPage up=new UserPage(driver);
		Thread.sleep(2000);
		up.getT1stRow().click();
		Thread.sleep(2000);
		up.getEdit().click();
		log.info("click on add button of project");
		UserAddPage uAp=new UserAddPage(driver);
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		uAp.getName().clear();
		uAp.getName().sendKeys(rand_int1+"Abc");
		//uAp.getSelectRole().click();
		//uAp.getChooseRole().click();
		//uAp.getEmail().clear();
		uAp.getEmail().sendKeys(rand_int1+"@csoftindia.net");
		uAp.getPhoneNo().clear();
		uAp.getPhoneNo().sendKeys(rand_int1+"12345");
		uAp.getSelectLang().click();
		uAp.getChooseLang().click();
		//uAp.getActiveCheckbox().click;
		Thread.sleep(6000);
		uAp.getSave().click();
		log.info("Testcase Cast");
		
		
		} 

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
