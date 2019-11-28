package edaTest;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.DepartmentAddPage;
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



public class RoleAdmin_Test extends Base {
	
	public static Logger log =LogManager.getLogger(RoleAdmin_Test.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void ARemove_Role_Admin() throws IOException, InterruptedException
	
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
		rAp.getDep_Admin().click();
	
		}
		else
		{
			rAp.getSelectALL().click();
			Thread.sleep(2000);
			rAp.getDep_Admin().click();
		}
		
		Thread.sleep(3000);
		rAp.getSave().click();
		Thread.sleep(3000);
		log.info("role Edit done successfully");
		
		
	}
	
	@Test
	public void BVisibility_AdminAccess() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Test for role off admin permission ");
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
		
		String c_name=LP.getcustomer_name_from_dashboard().getText();
		log.info(c_name);
		
		log.info("enter dashboard page");
		
		LP.getDepartment().click();
		Thread.sleep(3000);
		log.info("enter department page");
		departmentPage dp=new departmentPage(driver);
		
		dp.getAdd().click();
		Thread.sleep(2000);
		log.info("enter department add page");
		DepartmentAddPage dAp=new DepartmentAddPage(driver);
		dAp.getSelectAdmin().click();
		Thread.sleep(2000);
		List<WebElement> adminName=driver.findElements(By.xpath("//*[@id='Adminlist']/li/p"));
		int countAdmin=adminName.size();
		log.info(countAdmin);
		for(int j=0;j<countAdmin;j++) {
			if(adminName.get(j).getText().equals(c_name)) {
				log.info("Testcase fail");
			}
			else {
				log.info(adminName.get(j).getText());
				log.info("Testcase passed");
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
