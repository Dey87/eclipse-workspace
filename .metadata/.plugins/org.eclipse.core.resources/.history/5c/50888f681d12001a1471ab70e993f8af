package edaTest;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.DepartmentEditPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SearchTablePage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class DepartmentEditTest extends Base {
	
	public static Logger log =LogManager.getLogger(DepartmentEditTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void DepartmentEdit() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
				/*WelcomePage wp=new WelcomePage(driver);
				Thread.sleep(2000);
				wp.getsignIn().click();*/
				log.info("Department Edit with valid data");
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
				
				Thread.sleep(3000);
				
				LandingPage LP=new LandingPage(driver);
				LP.getDepartment().click();
				log.info("Enter department page");
				Thread.sleep(1000);
				departmentPage dp=new departmentPage(driver);
				dp.getthe1stDepartmentOnRow().click();
				Thread.sleep(1000);
				dp.getEdit().click();
				log.info("Enter department Edit page");
				Thread.sleep(2000);
				Random ranval=new Random();
				int intranval=ranval.nextInt(1000);
				DepartmentAddPage dap=new DepartmentAddPage(driver);
				dap.getDepartmentName().clear();
				dap.getDepartmentName().sendKeys(prop.getProperty("DepartmentName")+intranval);
				dap.getDescription().clear();
				dap.getDescription().sendKeys(prop.getProperty("DepartmentDescription")+intranval);
				Thread.sleep(2000);
				dap.getSelectAdmin().click();
				Thread.sleep(2000);
				dap.getChooseAdmin().click();
				Thread.sleep(2000);
				dap.getSave().click();
				Thread.sleep(2000);
				SearchTablePage sTp=new SearchTablePage(driver);
				sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName"));
				log.info("Edit a department successfuly");
				Thread.sleep(2000);
				if(!dp.getthe1stDepartmentOnRow().getText().equals(prop.getProperty("DepartmentName")+intranval)) {
				log.info("Test case fail for not having the current submitted department");
				Assert.assertEquals(dp.getthe1stDepartmentOnRow().getText(),prop.getProperty("DepartmentName"));
				}
				else {
					log.debug("Testcase pass");
				}
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
