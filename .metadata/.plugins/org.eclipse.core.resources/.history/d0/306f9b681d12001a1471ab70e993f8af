package edaTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.DepartmentManageUserPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SearchTablePage;
import pageObjects.ViewAddPage;
import pageObjects.ViewPage;
import pageObjects.WelcomePage;
import resource.Base;



public class ViewAddTest extends Base {
	public static Logger log =LogManager.getLogger(ViewAddTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 //driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void ViewAdd4SingleSelect() throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Add a view with a single");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(3000);
		LP.getViews().click();
		log.info("Enter view page");
		ViewPage vp=new ViewPage(driver); 
		vp.getAdd().click();
		log.info("Enter view add page");
		Thread.sleep(2000);
		ViewAddPage vAp=new ViewAddPage(driver);
		vAp.getName().sendKeys("testview305st");
		vAp.getDescription().sendKeys("test description");
		List<WebElement> allElements=driver.findElements(vAp.Availableuser);
		//Iterator<WebElement> i = allElements.iterator();
		int size=allElements.size();
		if(size>1) {
		Thread.sleep(1000);
			allElements.get(1).click();
		}
				else
				{
					log.info("Testcae fail for no field is available for selection");
					Assert.assertEquals("google","goooogle");
				}
		log.info("field has been selected");
		Thread.sleep(3000);
		DepartmentManageUserPage dMp=new DepartmentManageUserPage(driver);
		dMp.getSingleSelect().click();
		log.info("single select button has been clicked");
		Thread.sleep(2000);
		vAp.getSave().click();
		log.info("view has been submitted");
		Thread.sleep(6000);
		if(vAp.getDuplicateError().isDisplayed()) {
		log.info("error shows-Same View name exists... Please set another View name!!");
		Assert.assertEquals("google","goooogle");
				}
				else {
					vp.getSearchName().sendKeys("testview305st");
						if(vp.getT1strow().getText().equals("testview305st")){
							log.info("TestCase passed\n");
						}
						else
						{
							log.info("TestCase failed");
							Assert.assertEquals("google","goooogle");
						}
				}	
		   
}
	
	
	@Test
	public void ViewAdd4MultiSelect() throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Add a view with a single");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("login successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(3000);
		LP.getViews().click();
		log.info("Enter view page");
		ViewPage vp=new ViewPage(driver); 
		vp.getAdd().click();
		log.info("Enter view add page");
		Thread.sleep(2000);
		ViewAddPage vAp=new ViewAddPage(driver);
		vAp.getName().sendKeys("testview306st");
		vAp.getDescription().sendKeys("test description");
		List<WebElement> allElements=driver.findElements(vAp.Availableuser);
		//Iterator<WebElement> i = allElements.iterator();
		int size=allElements.size();
		if(size>0) {
		Thread.sleep(1000);
		for(int i=0;i<size;i++) {
			allElements.get(i).click();
			Thread.sleep(1000);
		}
		}
		else
		{
			log.info("Testcae fail for no field is available for selection");
			Assert.assertEquals("google","goooogle");
		}
		log.info("field has been selected");
		Thread.sleep(3000);
		DepartmentManageUserPage dMp=new DepartmentManageUserPage(driver);
		dMp.getMultiSelect().click();
		log.info("single select button has been clicked");
		Thread.sleep(2000);
		vAp.getSave().click();
		log.info("view has been submitted");
		Thread.sleep(6000);
		if(vAp.getDuplicateError().isDisplayed()) {
			log.info("error shows-Same View name exists... Please set another View name!!");
			Assert.assertEquals("google","goooogle");
		}
		else {
		vp.getSearchName().sendKeys("testview306st");
		if(vp.getT1strow().getText().equals("testview306st")){
			log.info("TestCase passed\n");
		}
		else
		{
			log.info("TestCase failed");
			Assert.assertEquals("google","goooogle");
		}
	}	
		   
}
	
	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
