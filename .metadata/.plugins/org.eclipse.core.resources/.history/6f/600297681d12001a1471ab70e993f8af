package edaTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentManageUserPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProjectPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class ProjectManageUserTest extends Base {
	
	public static Logger log =LogManager.getLogger(ProjectManageUserTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void MultipleUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("test for multiple User select");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("Login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getProjects().click();
		log.info("enter project page");
		Thread.sleep(2000);
		ProjectPage dp=new ProjectPage(driver);
		dp.getProjectList().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter manage user page");
		Thread.sleep(2000);
		DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
		List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
		List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
		int Acount=AvailableUserLinks.size();
		System.out.println(Acount);
		int Scount=SelectedUserLinks.size();
		System.out.println(Scount);
		if(Acount>1) {
			System.out.println("444");
		Iterator<WebElement> itr = AvailableUserLinks.iterator();
		while(itr.hasNext()) {
		    //System.out.println(itr.next());
			itr.next().click();	
		}
		}
		else {
			dMUp.getCancel4project().click();
			log.info("testcase fail");
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		if(dMUp.getMultiSelect().isDisplayed()) {
			dMUp.getMultiSelect().click();
			dMUp.getSave4project().click();
			log.info("testcase pass");
			Thread.sleep(2000);
			
		}
		//Assert.assertEquals(AvailableUserLinks.size(), actual);
		
		
	
	}
	
	
	@Test
	public void SingleUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
				/*WelcomePage wp=new WelcomePage(driver);
				Thread.sleep(2000);
				wp.getsignIn().click();*/
				
		log.info("test for multiple User select");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("Login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getProjects().click();
		log.info("enter project page");
		Thread.sleep(2000);
		ProjectPage dp=new ProjectPage(driver);
		dp.getProjectList().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter manage user page");
				Thread.sleep(2000);
				DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
				List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
				List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
				if(AvailableUserLinks.get(0).isDisplayed()) {
					AvailableUserLinks.get(0).click();
					dMUp.getSingleSelect().click();
					dMUp.getSave4project().click();
				}
				else {
					log.info("no user present in available list");
					dMUp.getSave4project().click();
				}
				log.info("TestCase is past");
				//Assert.assertEquals(AvailableUserLinks.size(), actual);
				Thread.sleep(1000);
				}

	
	@Test
	public void SingledeUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
				/*WelcomePage wp=new WelcomePage(driver);
				Thread.sleep(2000);
				wp.getsignIn().click();*/
				
		log.info("test for multiple User select");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("Login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getProjects().click();
		log.info("enter project page");
		Thread.sleep(2000);
		ProjectPage dp=new ProjectPage(driver);
		dp.getProjectList().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter manage user page");
				Thread.sleep(2000);
				DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
				List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
				List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
				for(int i=0;i<SelectedUserLinks.size();i++) {
				SelectedUserLinks.get(i).click();
				Thread.sleep(2000);
				dMUp.getSingledeSelect().click();
				Thread.sleep(1000);
				SelectedUserLinks.get(i).click();
				Thread.sleep(2000);
				}
				//Assert.assertEquals(AvailableUserLinks.size(), actual);
				dMUp.getSave4project();
				log.info("testcase pass");
				}
	
	@Test
	public void MultideUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
				/*WelcomePage wp=new WelcomePage(driver);
				Thread.sleep(2000);
				wp.getsignIn().click();*/
				
		log.info("test for multiple User select");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("Login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getProjects().click();
		log.info("enter project page");
		Thread.sleep(2000);
		ProjectPage dp=new ProjectPage(driver);
		dp.getProjectList().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter manage user page");
				Thread.sleep(2000);
				DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
				List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
				List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
				int Acount=AvailableUserLinks.size();
				System.out.println(Acount);
				int Scount=SelectedUserLinks.size();
				System.out.println(Scount);
				//Scount+=Acount;
				Iterator<WebElement> itr = SelectedUserLinks.iterator();
				while(itr.hasNext()) {
				    //System.out.println(itr.next());
					itr.next().click();
					
				}
				dMUp.getMultideselect().click();
				dMUp.getSave4project().click();
				//Assert.assertEquals(AvailableUserLinks.size(), actual);
				log.info("testcase pass");
				Thread.sleep(2000);
				
		}


	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
