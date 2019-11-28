package edaTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.FilterAddPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.RolePage;
import pageObjects.Role_Addpage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class RoleAddTest extends Base {
	
	public static Logger log =LogManager.getLogger(RoleAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 //driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void Roleadd(String s, int i) throws IOException, InterruptedException
	
		{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("Testcae for "+s);
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
		LP.getRoles().click();
		log.info("Enter login page");
		Thread.sleep(2000);
		RolePage rp=new RolePage(driver);
		rp.getAdd().click();
		log.info("Enter role add page");
		Role_Addpage rAp=new Role_Addpage(driver);
		rAp.getName().sendKeys("Roletest1");
		rAp.getDescription().sendKeys("Role description");
		Thread.sleep(2000);
		if(i==1) {
		rAp.getSelectALL().click();
		log.info("Select all roles");
		}
		else
		{
		rAp.getDep_Add().click();
		rAp.getDep_DepartmentUser().click();
		rAp.getPro_Update().click();
		rAp.getDoc_Download().click();
		rAp.getFld_View().click();
		rAp.getView_Update().click();
		rAp.getFil_Add().click();
		rAp.getRol_Update().click();
		rAp.getUsr_ViewAllUser().click();
		log.info("select few roles");
		}
		Thread.sleep(1000);
		rAp.getSave().click();
		log.info("role added successfully");
		
		
			
	}

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	@DataProvider(name = "getData")
	public Object[][] getData()
	{
	
		Object[][] data=new Object[2][2];
		
		data[0][0]="select all role";
		data[0][1]=1;
		
		data[1][0]="Select few roles";
		data[1][1]=2;
		
		return data;
	}

}
