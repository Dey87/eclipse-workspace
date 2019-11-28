package edaTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ViewAddPage;
import pageObjects.ViewPage;
import pageObjects.WelcomePage;
import resource.Base;



public class ViewNegativeAddTest extends Base {
	
	public static Logger log =LogManager.getLogger(ViewNegativeAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 //driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void ViewNegativeAdd(String tstnam, String nam, String descrip) throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
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
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(3000);
		LP.getViews().click();
		ViewPage vp=new ViewPage(driver); 
		vp.getAdd().click();
		Thread.sleep(2000);
		ViewAddPage vAp=new ViewAddPage(driver);
		vAp.getName().sendKeys(nam);
		vAp.getDescription().sendKeys(descrip);
		List<WebElement> allElements=driver.findElements(vAp.Availableuser);
		List<WebElement> allSelectedElements=driver.findElements(vAp.Selecteduser);
		//Iterator<WebElement> i = allElements.iterator();
		
		int availSize=allElements.size();
		int selectedSize=allSelectedElements.size();
		if(availSize>0) {
		allElements.get(0).click();
		Thread.sleep(1000);
		vAp.getSingleSelect().click();
		}
		Thread.sleep(2000);
		vAp.getSave().click();
		Thread.sleep(4000);
		if(vp.getT1strow().isDisplayed()) {
			log.info("Testcase is failed");
			Assert.assertEquals("gppg", "google");
			
		}
		else {
			log.info("Testcase is passed");
		}
		
		   
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
	
		Object[][] data=new Object[8][3];
		
		data[0][0]="Using duplicate value";
		data[0][1]=prop.getProperty("DepartmentName");
		data[0][2]=prop.getProperty("DepartmentDescription");
		
		data[1][0]="provide null value";
		data[1][1]=prop.getProperty("nullValue");
		data[1][2]=prop.getProperty("nullValue");
		
		data[2][0]="using special characters which are not allowed by EDA6";
		data[2][1]=prop.getProperty("specialC");
		data[2][2]=prop.getProperty("specialC");
		
		data[3][0]="where department field is kept emtpy";
		data[3][1]=prop.getProperty("nullValue");
		data[3][2]=prop.getProperty("DepartmentDescription");
		
		data[4][0]="where descritption field is kept emtpy";
		data[4][1]=prop.getProperty("DepartmentName");
		data[4][2]=prop.getProperty("nullValue");
		
		data[5][0]="user does select an admin but tries to add a department";
		data[5][1]=prop.getProperty("DepartmentName");
		data[5][2]=prop.getProperty("DepartmentDescription");
		
		data[6][0]="user does not select depatment";
		data[6][1]=prop.getProperty("DepartmentName");
		data[6][2]=prop.getProperty("DepartmentDescription");
		
		data[7][0]="user does not select project";
		data[7][1]=prop.getProperty("DepartmentName");
		data[7][2]=prop.getProperty("DepartmentDescription");
	
		
		return data;
		
	}
	

}
