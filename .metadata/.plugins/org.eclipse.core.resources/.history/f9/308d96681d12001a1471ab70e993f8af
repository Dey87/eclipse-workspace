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
import pageObjects.WelcomePage;
import resource.Base;



public class ProjectEditTest extends Base {
	
	public static Logger log =LogManager.getLogger(ProjectEditTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void ProjectEdit() throws IOException, InterruptedException
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
		Thread.sleep(3000);
		LP.getProjects().click();
		
		ProjectPage pp=new ProjectPage(driver);
		Thread.sleep(3000);
		pp.getProjectList().click();
		Thread.sleep(3000);
		pp.getEdit().click();
		Random randVal=new Random();
		int intrandVal=randVal.nextInt(1000);
		ProjectAddPage pAp=new ProjectAddPage(driver);
		pAp.getProjectName().clear();
		pAp.getProjectName().sendKeys(prop.getProperty("ProjectName")+intrandVal);
		pAp.getDescription().clear();
		pAp.getDescription().sendKeys(prop.getProperty("ProjectDescription")+intrandVal);
		Thread.sleep(3000);
		pAp.getSave().click();
		Thread.sleep(3000);
		SearchTablePage stp=new SearchTablePage(driver);
		stp.getNameSearch().sendKeys(prop.getProperty("ProjectName"));
		Thread.sleep(4000);
		if(pp.getProjectList().getText().equals(prop.getProperty("ProjectName")+intrandVal))
		{
			log.info("TestCase is passed- a new project has been Edited");
			System.out.println("Testcast pass");
		}
		else
		{
			log.info("Testcast fail- this name of project is not present in project list or some error happens");
			System.out.println("Testcast fail");
			Assert.assertEquals("Gooooogle", "google");
		}
		
	}
		

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
