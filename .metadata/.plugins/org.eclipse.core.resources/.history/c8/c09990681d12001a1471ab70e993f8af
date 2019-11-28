package edaTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentManageUserPage;
import pageObjects.DepartmentViewUserPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.UserEditPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class DepartmentviewUserTest extends Base {
	
	public static Logger log =LogManager.getLogger(DepartmentAddNegativeTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void UserActiveInacive() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("User acive and inactive for department user");
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
		Thread.sleep(1000);
		LP.getDepartment().click();
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(5000);
		dp.getViewUser().click();
		log.info("Enter department user page");
		DepartmentViewUserPage dVp=new DepartmentViewUserPage(driver);
		List<WebElement> ActiveInLinks = driver.findElements(By.xpath("//*[@id='dtBasicExampleUser']/tbody/tr/td[8]"));
		int ActiveInSize=ActiveInLinks.size();
		System.out.println(ActiveInSize);
		for(int i=1;i<ActiveInSize;i++) {
			ActiveInLinks.get(i).click();
			Thread.sleep(4000);
			if(dVp.getActive_user().isDisplayed()) {
				
				if(ActiveInLinks.get(i).getText().equals("Active")) {
					log.info("Active to inactive ");
					dVp.getActive_user().click();
					break;
				}
				else {
					log.info("InActive to active ");
					dVp.getActive_user().click();
					break;
				}
				
				}
		}
		log.info("all are admin");	
		}

	@Test
	public void EditUerforDepartment() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();
		log.info("Edit user for department user");
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
		Thread.sleep(1000);
		LP.getDepartment().click();
		Thread.sleep(2000);
		departmentPage dp=new departmentPage(driver);
		dp.getthe1stDepartmentOnRow().click();
		Thread.sleep(5000);
		dp.getViewUser().click();
		log.info("enter department user page");
		DepartmentViewUserPage dVp=new DepartmentViewUserPage(driver);
		List<WebElement> ActiveInLinks = driver.findElements(By.xpath("//*[@id='dtBasicExampleUser']/tbody/tr/td[8]"));
		int ActiveInSize=ActiveInLinks.size();
		for(int i=1;i<ActiveInSize;i++) {
			int k=0;
			for(int j=0;j<ActiveInSize;j++) {
				if(ActiveInLinks.get(i).getText().equals("Active")){
					k++;
				}
			}
			ActiveInLinks.get(i+1).click();
			Thread.sleep(3000);
			if(dVp.getEdit_user().isDisplayed()) {
				dVp.getEdit_user().click();
				Thread.sleep(3000);
				Random randVal=new Random();
				int intrandVal=randVal.nextInt(1000);
				UserEditPage uEp=new UserEditPage(driver);
				uEp.getName().clear();
				uEp.getName().sendKeys("Abc"+intrandVal);
				Thread.sleep(1000);
				uEp.getMiddleName().sendKeys("saha"+intrandVal);
				Thread.sleep(1000);
				uEp.getLastName().sendKeys("basu"+intrandVal);
				Thread.sleep(1000);
				uEp.getSelectRole().click();
				Thread.sleep(1000);
				uEp.getChooseRole().click();
				Thread.sleep(1000);
				log.info("user info completed");
				uEp.getAddress().click();
				Thread.sleep(1000);
				uEp.getAddLine1().sendKeys("abc1");
				Thread.sleep(1000);
				uEp.getAddLine2().sendKeys("abc2");
				Thread.sleep(1000);
				uEp.getCity().sendKeys("abc3");
				Thread.sleep(1000);
				uEp.getPin().sendKeys("53646464");
				Thread.sleep(1000);
				uEp.getCountry().sendKeys("Bangaladesh");
				log.info("user address completed");
				Thread.sleep(1000);
				uEp.getAllDepartment().click();
				Thread.sleep(1000);
				DepartmentManageUserPage dMUp=new DepartmentManageUserPage(driver);
				List<WebElement> AvailableUserLinks = driver.findElements(By.xpath("//*[@id='Availableuser']/select/option"));
				List<WebElement> SelectedUserLinks = driver.findElements(By.xpath("//*[@id='Selecteduser']/select/option"));
				int Acount=AvailableUserLinks.size();
				int Scount=SelectedUserLinks.size();
				Iterator<WebElement> itr = AvailableUserLinks.iterator();
				while(itr.hasNext()) {
				    //System.out.println(itr.next());
					itr.next().click();
					
				}
				if(dMUp.getMultiSelect().isEnabled()) {
					dMUp.getMultiSelect().click();
				}
				log.info("department access completed");
				//Assert.assertEquals(AvailableUserLinks.size(), actual);
				Thread.sleep(2000);
				
				System.out.println(k+"val");
				Thread.sleep(2000);
				if(k<7) {
					log.info("submitted");
					uEp.getSave().click();
					log.info("submitted+++");

				}
				else {
					log.info("not submitted for overflow");
					uEp.getCancel().click();
					}
				
				}
				break;
				}
			
			
		}
				
		


	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
