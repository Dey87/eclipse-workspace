package edaTest;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;


public class DepartmentAddNegativeTest extends Base {
	public static Logger log =LogManager.getLogger(DepartmentAddNegativeTest.class.getName());	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void DepartmentNtest(String tc, String un, String ud, int count) throws IOException, InterruptedException
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
		Thread.sleep(3000);
		log.info("Test case for-"+tc);
		log.info("Login details is given");
		lip.getSubmit().click();
		log.info("User login");
		Thread.sleep(3000);
			
		if (lip.getSessionOut().isDisplayed()) {
			
			lip.getSessionOut().click();
			log.info("one user is already in session");
		}
		
		LandingPage LP=new LandingPage(driver);
	
		WebDriverWait wait = new WebDriverWait(driver,2000);
        wait.until(ExpectedConditions.elementToBeClickable(LP.getDepartment()));
		Thread.sleep(3000);
		LP.getDepartment().click();
		log.info("Department is clicked");
		departmentPage dp=new departmentPage(driver);
		Thread.sleep(3000);
		dp.getAdd().click();
		log.info("Add button is clicked");
		DepartmentAddPage dap=new DepartmentAddPage(driver);
		Thread.sleep(3000);
		dap.getDepartmentName().sendKeys(un);
		dap.getDescription().sendKeys(ud);
		log.info("department details are given");
		if(count==3) {
			System.out.println("skip the admin part");
			log.info("User skip admin part");
		}
		else {
			Thread.sleep(2000);
			dap.getSelectAdmin().click();
			Thread.sleep(2000);
			dap.getChooseAdmin().click();
			log.info("User choose admin part");
		}
		Thread.sleep(3000);
		dap.getSave().click();
		log.info("click on save button of department");
		Thread.sleep(3000);
		
		if(count==1) 
		{	
			String DuplicateValue=driver.findElement(By.xpath(prop.getProperty("Locator4ErorMsg4DV"))).getText();
			if(!DuplicateValue.equals(prop.getProperty("Text4ErorMsg4DV"))) {
			log.error("errormsg is not matching, and user can submit a department with duplicate values");	
			log.debug("\n");
			log.debug("\n");
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("Locator4ErorMsg4DV"))).getText(), prop.getProperty("Text4ErorMsg4DV"));
			}
			else {
				
				log.debug("Testcase has passed");
				log.debug("\n");
				log.debug("\n");
			
			}
				
			}
		
		else if(count==2||count==3)
		{
			String InVaildInput=driver.findElement(By.xpath(prop.getProperty("Locator4ErorMsg4DV"))).getText();
			if(!InVaildInput.equals(prop.getProperty("Text4ErorMsg4unexVal"))) {
			log.error("errormsg is not matching, and user can submit a department with an invalid input");	
			log.debug("\n");
			log.debug("\n");
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("Locator4ErorMsg4unexVal"))).getText(), prop.getProperty("Text4ErorMsg4unexVal"));
				
			}
			else
			{
				log.debug("Testcase has passed");
				log.debug("\n");
				log.debug("\n");
				
			}
			
			}
		else
		{
			System.out.println("cancel the add page");		
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
	
		Object[][] data=new Object[6][4];
		
		data[0][0]="Using duplicate value";
		data[0][1]=prop.getProperty("DepartmentName");
		data[0][2]=prop.getProperty("DepartmentDescription");
		data[0][3]=1;
		
		data[1][0]="provide null value";
		data[1][1]=prop.getProperty("nullValue");
		data[1][2]=prop.getProperty("nullValue");
		data[1][3]=2;
		
		data[2][0]="using special characters which are not allowed by EDA6";
		data[2][1]=prop.getProperty("specialC");
		data[2][2]=prop.getProperty("specialC");
		data[2][3]=2;
		
		data[3][0]="where department field is kept emtpy";
		data[3][1]=prop.getProperty("nullValue");
		data[3][2]=prop.getProperty("DepartmentDescription");
		data[3][3]=2;
		
		data[4][0]="where descritption field is kept emtpy";
		data[4][1]=prop.getProperty("DepartmentName");
		data[4][2]=prop.getProperty("nullValue");
		data[4][3]=2;
		
		data[5][0]="user does select an admin but tries to add a department";
		data[5][1]=prop.getProperty("DepartmentName");
		data[5][2]=prop.getProperty("DepartmentDescription");
		data[5][3]=3;
		
		
		return data;
		
	}
	

}
