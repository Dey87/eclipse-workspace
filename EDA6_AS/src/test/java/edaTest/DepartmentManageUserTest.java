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
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class DepartmentManageUserTest extends Base {
	
	public static Logger log =LogManager.getLogger(DepartmentManageUserTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void AMultipleUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		log.info("Multiple user select for manage user");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("log in successfully ");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getDepartment().click();
		log.info("enter into department page");
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter into manage user page");
		Thread.sleep(2000);
		DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
		List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));																																																								
		List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
		int Acount=AvailableUserLinks.size();
		System.out.println(Acount);
		int Scount=SelectedUserLinks.size();
		System.out.println(Scount);
		//Scount+=Acount;
		Iterator<WebElement> itr = AvailableUserLinks.iterator();
		if(Acount>1)
		{
			while(itr.hasNext()) {
		    //System.out.println(itr.next());
			itr.next().click();
			}
		}
			else {
				log.info("Availble users are not present in list");
				Assert.assertEquals("google", "goooogle");
				}
		
		dMUp.getMultiSelect().click();
		log.info("TestCase Passed");
		//Assert.assertEquals(AvailableUserLinks.size(), actual);
		Thread.sleep(1000);
			
	}
		
	
	@Test
	public void BSingleUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		log.info("Multiple user select for manage user");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("log in successfully ");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getDepartment().click();
		log.info("enter into department page");
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		log.info("enter into manage user page");
		Thread.sleep(2000);
		DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
		List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
		List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
		int Acount=AvailableUserLinks.size();
		if(Acount>0) 
		{
		AvailableUserLinks.get(0).click();
		dMUp.getSingleSelect().click();
		//Assert.assertEquals(AvailableUserLinks.size(), actual);
		Thread.sleep(1000);
		log.info("TestCase Passed");
		}
		else {
			log.info("no available user is present");
			Assert.assertEquals("google", "goooogle");
		}
		}

	
	@Test
	public void CSingledeUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		log.info("Multiple user select for manage user");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("log in successfully ");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getDepartment().click();
		log.info("enter into department page");
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(2000);
		dp.getManageUser().click();
		Thread.sleep(2000);
		DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
		List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='AvailableUsers']/select/option"));
		List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='SelectedUsers']/select/option"));
		int Acount=AvailableUserLinks.size();
		int Scount=SelectedUserLinks.size();
		System.out.println(Scount);
		if(Scount>0) {
		SelectedUserLinks.get(1).click();
		Thread.sleep(1000);
		dMUp.getSingledeSelect().click();
		Thread.sleep(1000);
		 if(Acount==driver.findElements(By.xpath("//*[@id='Availableuser']/select/option")).size()) {
			 log.info("you select an admin or user is not sifted");
			 Assert.assertEquals("google", "goooogle");
		 }
		 log.info("TestCase Passed");
	}
		else {
			log.info("no available user is present for deselecting");
			Assert.assertEquals("google", "goooogle");
		}
		
		//Assert.assertEquals(AvailableUserLinks.size(), actual);
		
	}
	
	@Test
	public void DMultideUserSelect() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		log.info("Multiple user select for manage user");	
				LoginPage lip=new LoginPage(driver);
				lip.getUsername().clear();
				lip.getUsername().sendKeys(prop.getProperty("username"));
				lip.getPassword().clear();
				lip.getPassword().sendKeys(prop.getProperty("password"));
				Thread.sleep(2000);
				lip.getSubmit().click();
				log.info("log in successfully ");
				Thread.sleep(2000);
				if (lip.getSessionOut().isDisplayed()) {
					lip.getSessionOut().click();
			     }
				
				Thread.sleep(6000);
				
				LandingPage LP=new LandingPage(driver);
				Thread.sleep(1000);
				LP.getDepartment().click();
				log.info("enter into department page");
				Thread.sleep(2000);
				departmentPage dp=new departmentPage(driver);
				dp.getthe1stDepartmentOnRow().click();
				Thread.sleep(2000);
				dp.getManageUser().click();
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
				if(Scount>1) {
				while(itr.hasNext()) {
				    //System.out.println(itr.next());
					itr.next().click();
					}
				dMUp.getMultideselect().click();
				Thread.sleep(1000);
				 if(Acount==driver.findElements(By.xpath("//*[@id='Availableuser']/select/option")).size()) {
					 log.info("you select an admin");
					 Assert.assertEquals("google", "goooogle");
				 }
				 log.info("TestCase Passed");
				}
			
				else {
					
					log.info("no available user is present for multiple deselecting");
					Assert.assertEquals("google", "goooogle");
				}
				
				//Assert.assertEquals(AvailableUserLinks.size(), actual);
				Thread.sleep(1000);
				
		}


	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
