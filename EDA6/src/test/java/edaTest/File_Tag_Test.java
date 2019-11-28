package edaTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CurrentDetailsPage;
import pageObjects.DepartmentAddPage;
import pageObjects.FilePage;
import pageObjects.FilterAddPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class File_Tag_Test extends Base {
	public static Logger log =LogManager.getLogger(File_Tag_Test.class.getName());	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void  File_Tag() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
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
		
		Thread.sleep(2000);
		
		LandingPage LP=new LandingPage(driver);
		LP.getFiles().click();
		Thread.sleep(2000);
		FilePage fp=new FilePage(driver);
		Thread.sleep(2000);
		fp.getView_files().click();
		Thread.sleep(2000);
		log.info("done1");
		fp.getfileList().click();
		log.info("done2");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		//WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
		action.moveToElement(fp.getTagSign()).build().perform();
		Thread.sleep(1000);
		for(int i=0;i<10;i++) {
		fp.getTagInput().sendKeys("abcd"+i);
		fp.getTagInput().sendKeys(Keys.RETURN);
		}
		
		}

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
