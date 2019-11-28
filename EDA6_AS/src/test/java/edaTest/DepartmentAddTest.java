package edaTest;

import java.io.IOException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SearchTablePage;
import pageObjects.departmentPage;
import resource.Base;



public class DepartmentAddTest extends Base {
	public static Logger log =LogManager.getLogger(DepartmentAddTest.class.getName());
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
		log.info("Department Add with valid data");
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
		
		departmentPage dp=new departmentPage(driver);
		Thread.sleep(1000);
		dp.getAdd().click();
		log.info("Enter department add page");
		Random rand=new Random();
		int randInt=rand.nextInt(1000);
		DepartmentAddPage dap=new DepartmentAddPage(driver);
		dap.getDepartmentName().sendKeys(prop.getProperty("DepartmentName")+randInt);
		dap.getDescription().sendKeys(prop.getProperty("DepartmentDescription")+randInt);
		Thread.sleep(2000);
		dap.getSelectAdmin().click();
		Thread.sleep(2000);
		dap.getChooseAdmin().click();
		Thread.sleep(6000);
		dap.getSave().click();
		Thread.sleep(2000);
		SearchTablePage sTp=new SearchTablePage(driver);
		sTp.getNameSearch().sendKeys(prop.getProperty("DepartmentName")+randInt);
		log.info("Add a department successfully");
		Thread.sleep(2000);
		if(!dp.getthe1stDepartmentOnRow().getText().equals(prop.getProperty("DepartmentName")+randInt)) {
		log.info("Test case fail for not having the current submitted department");
		Assert.assertEquals(dp.getthe1stDepartmentOnRow().getText(),prop.getProperty("DepartmentName")+randInt);
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
