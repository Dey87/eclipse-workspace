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



public class UserAddTest extends Base {
	
	public static Logger log =LogManager.getLogger(UserAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void UserAdd() throws IOException, InterruptedException
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
		
		Thread.sleep(4000);
		
		LandingPage LP=new LandingPage(driver);
		//Thread.sleep(3000);
		LP.getUser().click();
		log.info("enter project page");
		UserPage up=new UserPage(driver);
		Thread.sleep(3000);
		up.getAdd().click();
		log.info("click on add button of project");
		UserAddPage uAp=new UserAddPage(driver);
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000); 
       // int rand_int2 = rand.nextInt(1000);
        
		uAp.getName().sendKeys(rand_int1+"Abc");
		uAp.getSelectRole().click();
		uAp.getChooseRole().click();
		uAp.getEmail().sendKeys(rand_int1+"@csoftindia.net");
		uAp.getPhoneNo().sendKeys(rand_int1+"Abc");
		uAp.getSelectLang().click();
		uAp.getChooseLang().click();
		//uAp.getActiveCheckbox().click();
		uAp.getSave().click();
		log.info("Testcase passed");
		
		
		} 

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
