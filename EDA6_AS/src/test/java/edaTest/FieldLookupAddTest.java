package edaTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FieldAddPage;
import pageObjects.FieldPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import resource.Base;


public class FieldLookupAddTest extends Base {
	public static Logger log =LogManager.getLogger(FieldLookupAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void FieldLookupAdd() throws InterruptedException  
	{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("field Lookup test");
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
		LP.getFields().click();
		
		FieldPage fp=new FieldPage(driver);
		fp.getAdd().click();
		Random randVal=new Random();
		int intrandVal=randVal.nextInt(1000);
		FieldAddPage fAp=new FieldAddPage(driver);
		Thread.sleep(3000);
		fAp.getDept_Level().click();
		//fAp.getProj_Level().click();
		fAp.getField_Name().sendKeys(prop.getProperty("Field_Name")+intrandVal);
		fAp.getField_Drescription().sendKeys(prop.getProperty("Field_Drescription")+intrandVal);
		/*fAp.getSelect_Department().click();
		fAp.getSearch_Department().sendKeys("IT department");
		fAp.getSearch_Department().sendKeys(Keys.RETURN);*/	
		Thread.sleep(2000);
		fAp.getField_type().click();
		fAp.getSearch_Field_type().sendKeys("Lookup");
		fAp.getSearch_Field_type().sendKeys(Keys.RETURN);
		
		
		for(int i=0;i<10;i++) {
		fAp.getField_Value_4Lookup().sendKeys(prop.getProperty("LookUp_Val")+i);
		fAp.getShift_Lookup_Value().click();
			}
		String locator="//*[@id='lookup_list']/option";
		int count=driver.findElements(By.xpath(locator)).size();
		System.out.println(count);
		List<WebElement> allElements=driver.findElements(By.xpath(locator));
		Iterator<WebElement> i = allElements.iterator();
		while(i.hasNext()) {
			WebElement row = i.next();
		    System.out.println(row.getText());
		    row.click();
		    fAp.getEdit_Lookup_Value().click();
		    
		    System.out.println("getEdit_Lookup_Value clicked");
		    
		    int Recount=driver.findElements(By.xpath(locator)).size();
		    System.out.println(Recount);
		    
		    Assert.assertEquals(count, Recount+1);
		    System.out.println("done");
		    int j=11;
		    fAp.getField_Value_4Lookup().sendKeys(prop.getProperty("LookUp_Val")+j);
		    fAp.getShift_Lookup_Value().click();
		    int Acount=driver.findElements(By.xpath(locator)).size();
		    Assert.assertEquals(count, Acount);
		    Assert.assertEquals(prop.getProperty("LookUp_Val")+j, row.getText());
		    
		    
			
		}
			
			
	       
	    //}
		
		
		/*fAp.getUp_Lookup_Value().click();
		fAp.getDown_Lookup_Value().click();
		fAp.getRemove_Lookup_Value().click();
		fAp.getDefault_Lookup_Value().click();*/
		//}
		
		//fAp.getCheckbox_4_MandatoryField().click();
		//fAp.getCancel().click();
		fAp.getSave().click();
		
		
		} 

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	
	
}
