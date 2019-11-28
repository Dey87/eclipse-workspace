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
import pageObjects.UserPage;
import pageObjects.ViewPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class RoleUpdate_ButtonTest extends Base {
	
	public static Logger log =LogManager.getLogger(RoleUpdate_ButtonTest.class.getName());
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
		rp.getsearch_name().sendKeys("AllAccess");
		rp.getRole_1st_role().click();
		Thread.sleep(2000);
		rp.getEdit().click();
		log.info("Enter role add page");
		Thread.sleep(2000);
		Role_Addpage rAp=new Role_Addpage(driver);
		Thread.sleep(2000);
		if(rAp.getSelectALL().isSelected()) {
		rAp.getDep_Update().click();
		rAp.getPro_Update().click();
		rAp.getFld_Update().click();
		rAp.getFil_Update().click();
		rAp.getView_Update().click();
		rAp.getRol_Update().click();
		rAp.getUsr_UpdateAllUser().click();
		}
		else
		{
			rAp.getSelectALL().click();
			Thread.sleep(2000);
			rAp.getDep_Update().click();
			rAp.getPro_Update().click();
			rAp.getFld_Update().click();
			rAp.getFil_Update().click();
			rAp.getView_Update().click();
			rAp.getRol_Update().click();
			rAp.getUsr_UpdateAllUser().click();
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
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(2000);
		if(dp.getEdit().isDisplayed()){
			log.info("Department Edit button is displaying");
			Assert.assertEquals("google", "gooooogle");
		}
		else {
			log.info("Testcase passed- Department Edit button is not visible");
			
		}
		}
		else if(i==2) {
			LP.getProjects().click();
			Thread.sleep(3000);
			ProjectPage pp=new ProjectPage(driver);
			Thread.sleep(3000);
			pp.getProjectList().click();
			Thread.sleep(3000);
			if(pp.getEdit().isDisplayed()){
				log.info("Project Edit button is displaying");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Testcase passed- Project add button is not visible");
				
			}
		}
		else if(i==3) {
			LP.getFields().click();
			Thread.sleep(3000);
			FieldPage fp=new FieldPage(driver);
			fp.getLocator1strow().click();
			Thread.sleep(3000);
			if(fp.getEdit().isDisplayed()){
				
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
			FilterPage filp=new FilterPage(driver);
			filp.gettable1stRow().click();
			Thread.sleep(3000);
			if(filp.getEdit().isDisplayed()){
				
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
			vp.getT1strow().click();
			Thread.sleep(3000);
			if(vp.getEdit().isDisplayed()){
				
				log.info("Testcase failed- view add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("View add button is not displaying");
				
			}
		}
		else if(i==6) {
			LP.getRoles().click();
			log.info("Enter login page");
			Thread.sleep(3000);
			RolePage rp=new RolePage(driver);
			rp.getRole_1st_role().click();
			Thread.sleep(3000);
			if(rp.getEdit().isDisplayed()) {
				
				log.info("Testcase failed- Role add button is visible");
				Assert.assertEquals("google", "gooooogle");
			}
			else {
				log.info("Role add button is not displaying");
				
			}
		}
		else {
			LP.getUser().click();
			log.info("Enter login page");
			Thread.sleep(3000);
			UserPage up=new UserPage(driver);
			up.getT1stRow().click();
			Thread.sleep(3000);
			if(up.getEdit().isDisplayed()) {
				
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
