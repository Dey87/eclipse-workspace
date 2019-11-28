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



public class ProjectAddTest extends Base {
	
	public static Logger log =LogManager.getLogger(ProjectAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void ProjectAdd() throws IOException, InterruptedException
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
		Thread.sleep(3000);
		LP.getProjects().click();
		log.info("enter project page");
		ProjectPage pp=new ProjectPage(driver);
		Thread.sleep(3000);
		pp.getAdd().click();
		log.info("click on add button of project");
		Random randVal=new Random();
		int intrandVal=randVal.nextInt(1000);
		ProjectAddPage pAp=new ProjectAddPage(driver);
		pAp.getProjectName().sendKeys(prop.getProperty("ProjectName")+intrandVal);
		pAp.getDescription().sendKeys(prop.getProperty("ProjectDescription")+intrandVal);
		Thread.sleep(2000);
		pAp.getSelect_Department().click();
		Thread.sleep(2000);
		//departmentPage dp=new departmentPage(driver);
		String firstDep=pAp.getChoose_Department().getText();
		System.out.println(firstDep);
		pAp.getSearch_Department().sendKeys(firstDep);
		pAp.getSearch_Department().sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		pAp.getSave().click();
		log.info("create a new project");
		Thread.sleep(3000);
		SearchTablePage stp=new SearchTablePage(driver);
		stp.getNameSearch().sendKeys(prop.getProperty("ProjectName"));
		Thread.sleep(4000);
		if(pp.getProjectList().getText().equals(prop.getProperty("ProjectName")+intrandVal))
		{
			log.info("TestCase is passed- a new project has been created");
			System.out.println("Testcast pass");
		}
		else
		{
			log.info("Testcast fail- this name of project is not present in project list or some some error happens");
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
