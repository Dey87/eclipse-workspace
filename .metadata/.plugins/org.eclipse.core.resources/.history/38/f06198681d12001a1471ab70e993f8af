package edaTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.FieldPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProjectPage;
import pageObjects.RolePage;
import pageObjects.Role_Addpage;
import pageObjects.ViewPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class RoleAdd_ButtonTest extends Base {
	
	public static Logger log =LogManager.getLogger(RoleAdd_ButtonTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void ARemove_Role_Add() throws IOException, InterruptedException
	
		{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Testcae for withdrawing add roles");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("successfully login");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(2000);
		/*String c_name=LP.getcustomer_name_from_dashboard().getText();
		log.info(c_name);*/
		LP.getRoles().click();
		log.info("Enter role page");
		Thread.sleep(2000);
		RolePage rp=new RolePage(driver);
		rp.getsearch_name().sendKeys("Fullaccessrole");
		rp.getRole_1st_role().click();
		Thread.sleep(2000);
		rp.getEdit().click();
		log.info("Enter role add page");
		Thread.sleep(2000);
		Role_Addpage rAp=new Role_Addpage(driver);
		Thread.sleep(2000);
		if(rAp.getSelectALL().isSelected()) {
		rAp.getDep_Add().click();
		rAp.getPro_Add().click();
		rAp.getFil_Add().click();
		rAp.getFld_Add().click();
		rAp.getRol_Add().click();
		rAp.getUsr_Add().click();
		rAp.getView_Add().click();
		}
		else
		{
			rAp.getSelectALL().click();
			Thread.sleep(2000);
			rAp.getDep_Add().click();
			rAp.getPro_Add().click();
			rAp.getFil_Add().click();
			rAp.getFld_Add().click();
			rAp.getRol_Add().click();
			rAp.getUsr_Add().click();
			rAp.getView_Add().click();
		}
		
		Thread.sleep(3000);
		rAp.getSave().click();
		Thread.sleep(3000);
		log.info("role Edit done successfully");
		
		
	}
	
	@Test(dataProvider="getData")
	public void BVisibility_AddButton(String tst, int i) throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Test for - "+tst);
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
		log.info("Login successfully");
		
		Thread.sleep(5000);
		
		LandingPage LP=new LandingPage(driver);
		
		log.info("enter dashboard page");
		if(i==1) {
		LP.getDepartment().click();
		Thread.sleep(3000);
		departmentPage dp=new departmentPage(driver);
		if(dp.getAdd().isDisplayed()){
			log.info("Department add button is not displaying");
			Assert.assertEquals("google", "gooooogle");
		}
		else {
			log.info("Testcase failed- Department add button is visible");
			
		}
		}
		else if(i==2) {
			LP.getProjects().click();
			Thread.sleep(3000);
			ProjectPage pp=new ProjectPage(driver);
			if(pp.getAdd().isDisplayed()){
				log.info("Project add button is not displaying");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Testcase failed- Project add button is visible");
				
			}
		}
		else if(i==3) {
			LP.getFields().click();
			Thread.sleep(3000);
			FieldPage fp=new FieldPage(driver);
			if(fp.getAdd().isDisplayed()){
				
				log.info("Testcase failed- Field add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Field add button is not displaying");
				
			}
		}
		else if(i==4) {
			LP.getFilter().click();
			Thread.sleep(3000);
			FilterPage fp=new FilterPage(driver);
			if(fp.getAdd().isDisplayed()){
				
				log.info("Testcase failed- Filter add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Filter add button is not displaying");
				
			}
		}
		else if(i==5) {
			LP.getViews().click();
			Thread.sleep(3000);
			log.info("Enter view page");
			ViewPage vp=new ViewPage(driver);
			if(vp.getAdd().isDisplayed()){
				
				log.info("Testcase failed- view add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("View add button is not displaying");
				
			}
		}
		else {
			LP.getRoles().click();
			log.info("Enter login page");
			Thread.sleep(3000);
			RolePage rp=new RolePage(driver);
			if(rp.getAdd().isDisplayed()) {
				
				log.info("Testcase failed- Role add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Role add button is not displaying");
				
			}
		}
	}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	@DataProvider(name = "getData")
	public Object[][] getData()
	{
	
		Object[][] data=new Object[6][2];
		
		data[0][0]="visibility of Department add button after withdrawing permission Add access";
		data[0][1]=1;
		
		data[1][0]="visibility of Project add button after withdrawing permission Add access";
		data[1][1]=2;
		
		data[2][0]="visibility of Field add button after withdrawing permission Add access";
		data[2][1]=3;
		
		data[3][0]="visibility of filter add button after withdrawing permission Add access";
		data[3][1]=4;
		
		data[4][0]="visibility of View add button after withdrawing permission Add access";
		data[4][1]=5;
		
		data[5][0]="visibility of Role add button after withdrawing permission Add access";
		data[5][1]=6;
		
		return data;
	}

}
