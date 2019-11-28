package edaTest;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.DepartmentManageUserPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SearchTablePage;
import pageObjects.UserEditPage;
import pageObjects.UserPage;
import pageObjects.departmentPage;
import resource.Base;



public class Assign_Dept_Proj4User_Test extends Base {
	public static Logger log =LogManager.getLogger(Assign_Dept_Proj4User_Test.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void DepartmentPositveAdd() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
				/*WelcomePage wp=new WelcomePage(driver);
				Thread.sleep(2000);
				wp.getsignIn().click();*/
		log.info("login with a full access user and create a department");
				LoginPage lip=new LoginPage(driver);
				/*lip.getUsername().clear();
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
				
				Thread.sleep(3000);*/
				
				LandingPage LP=new LandingPage(driver);
				/*LP.getDepartment().click();
				log.info("Enter department page");*/
				
				departmentPage dp=new departmentPage(driver);
				/*Thread.sleep(1000);
				dp.getAdd().click();
				log.info("Enter department add page");*/
				Random rand=new Random();
				int randInt=rand.nextInt(1000);
				DepartmentAddPage dap=new DepartmentAddPage(driver);
				/*dap.getDepartmentName().sendKeys(prop.getProperty("DepartmentName")+randInt);
				dap.getDescription().sendKeys(prop.getProperty("DepartmentDescription")+randInt);
				Thread.sleep(2000);
				dap.getSelectAdmin().click();
				Thread.sleep(2000);
				dap.getChooseAdmin().click();
				Thread.sleep(2000);
				dap.getSave().click();
				Thread.sleep(2000);*/
				SearchTablePage sTp=new SearchTablePage(driver);
				/*sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName")+randInt);
				
				Thread.sleep(2000);
				if(!dp.getthe1stDepartmentOnRow().getText().equals(prop.getProperty("DepartmentName")+randInt)) {
				log.info("Test case fail for not having the current submitted department");
				Assert.assertEquals(dp.getthe1stDepartmentOnRow().getText(),prop.getProperty("DepartmentName")+randInt);
				}
				else {
					log.debug("A new Department has been added for checking visibility in an another account");
				}
				
				log.info("Time to log out current session and login another account");
		LP.getcustomer_name_from_dashboard().click();
		LP.getcustomer_signOut().click();*/
		// Sign out from Admin
		
		
		//Sign in with different credentials 
		
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username1"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		log.info("Login successfully");
		
		Thread.sleep(3000);
		
		LP.getDepartment().click();
		log.info("Enter department page");
		Thread.sleep(2000);
		
		//sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName"));
		/*log.info("Add a department successfully");
		Thread.sleep(2000);
		if(!dp.getthe1stDepartmentOnRow().getText().equals(prop.getProperty("DepartmentName"))) {
		log.info("Test case fail for not having the current submitted department");
		
		//Assert.assertEquals(dp.getthe1stDepartmentOnRow().getText(),prop.getProperty("DepartmentName"));
		}
		else {
			log.debug("Testcase pass");
		}*/
		Thread.sleep(1000);
		LP.getcustomer_name_from_dashboard().click();
		Thread.sleep(1000);
		LP.getcustomer_signOut().click();
		
		// log in admin again
		
		/*lip.getUsername().clear();
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
		
		Thread.sleep(3000);
		
		LP.getUser().click();
		
		Thread.sleep(2000);
		
		sTp.getNameSearch().sendKeys(prop.getProperty("username1"));
		
		UserPage up=new UserPage(driver);
		up.getT1stRow().click();
		Thread.sleep(2000);
		up.getEdit().click();
		
		UserEditPage uEp=new UserEditPage(driver);
		uEp.getAllDepartment().click();
		
		List<WebElement> ActiveUsers = driver.findElements(By.xpath(prop.getProperty("AvailableList")));
		int ActiveUserSize=ActiveUsers.size();
		System.out.println(ActiveUserSize);
		for(int i=1;i<ActiveUserSize;i++) {
			
		if(ActiveUsers.get(i).getText().equals(prop.getProperty("DepartmentName")+randInt)) {
			ActiveUsers.get(i).click();
			uEp.getSingleSelect().click();
			uEp.getSave().click();
			Thread.sleep(2000);
			break;
		
			}
		
		}
		
		LP.getDepartment().click();
		sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName")+randInt);
		dp.getthe1stDepartmentOnRow().click();
		dp.getManageUser().click();
		Thread.sleep(2000);
		//same locator, so i use user page object to department page
		List<WebElement> ActiveDept = driver.findElements(By.xpath(prop.getProperty("AvailableList")));
		
		int ActiveDeptSize=ActiveDept.size();
		System.out.println(ActiveDeptSize);
		for(int i=1;i<ActiveDeptSize;i++) {
			
		if(ActiveDept.get(i).getText().equals(prop.getProperty("DepartmentName")+randInt)) {
			ActiveDept.get(i).click();
			DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
			dMUp.getSingleSelect().click();
			dMUp.getSave().click();
			Thread.sleep(2000);
			break;
		
			}
		
		}
		
		//logout process
		LP.getcustomer_name_from_dashboard().click();
		LP.getcustomer_signOut().click();
		
		//login user table again...
		
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username1"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		log.info("Login successfully");
		
		Thread.sleep(3000);
		
		LP.getDepartment().click();
		log.info("Enter department page");
		Thread.sleep(2000);
		
		sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName"));
		log.info("Add a department successfully");
		Thread.sleep(2000);
		if(!dp.getthe1stDepartmentOnRow().getText().equals(prop.getProperty("DepartmentName"))) {
		log.info("Test case fail for not having the current submitted department");
		Assert.assertEquals(dp.getthe1stDepartmentOnRow().getText(),prop.getProperty("DepartmentName"));
		}
		else {
			log.debug("Testcase pass");
		}
		*/
	}
	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
