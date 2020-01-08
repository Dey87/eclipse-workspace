package epsTest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.dashboardPage;
import resource.Base;

public class NewTenderTest extends Base {
	
	@BeforeMethod
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void NewTender() throws IOException, InterruptedException
	{

		login();
		
		Actions action = new Actions(driver);
		dashboardPage dp=new dashboardPage(driver);
		WebElement tender = dp.getTender();
		action.moveToElement(tender).build().perform();
		tender.click();
		dp.getTender_Creation().click();
		dp.getCreate_New_RFQ().click();
		
		Thread.sleep(8000);
		
		
		
		
		
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	

}
