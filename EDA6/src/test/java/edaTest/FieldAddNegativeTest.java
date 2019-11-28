package edaTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.FieldAddPage;
import pageObjects.FieldPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import resource.Base;


public class FieldAddNegativeTest extends Base {
	
	public static Logger log =LogManager.getLogger(DepartmentAddNegativeTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void FieldAddNegative(String f_type, int j, String val) throws InterruptedException  
	{

		driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		log.info("field Add with "+f_type+" value");
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		log.info("login done successfully");
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(3000);
		LP.getFields().click();
		log.info("enter field page");
		FieldPage fp=new FieldPage(driver);
		fp.getAdd().click();
		log.info("enter field add page");
		FieldAddPage fAp=new FieldAddPage(driver);
		Thread.sleep(3000);
		fAp.getDept_Level().click();
		//fAp.getProj_Level().click();
		fAp.getField_Name().sendKeys(prop.getProperty("Field_Name")+f_type+" "+j);
		fAp.getField_Drescription().sendKeys(prop.getProperty("Field_Drescription")+f_type+" "+j);
		fAp.getSelect_Department().click();
		fAp.getSearch_Department().sendKeys("IT department");
		fAp.getSearch_Department().sendKeys(Keys.RETURN);	
		Thread.sleep(3000);
		fAp.getField_type().click();
		fAp.getSearch_Field_type().sendKeys(f_type);
		fAp.getSearch_Field_type().sendKeys(Keys.RETURN);
		log.info("field type selected as"+f_type);
		if(f_type.equals("Integer"))
		fAp.getField_Value_4IntNdec().sendKeys(val);
		
		else if(f_type.equals("Decimal"))
		fAp.getField_Value_4IntNdec().sendKeys(val);
		
		else if(f_type.equals("String"))
		fAp.getField_Value_4String().sendKeys(val);
		
		else if(f_type.equals("Date"))
		fAp.getField_Value_4Date().sendKeys(val);
		
		else if(f_type.equals("DateTime")) 
		fAp.getField_Value_4DateNtime().sendKeys(val);
		
		else {
			for(int i=0;i<10;i++) {
		fAp.getField_Value_4Lookup().sendKeys(val);
		fAp.getShift_Lookup_Value().click();
			}
		
		}
		
		if(fAp.getSave().isEnabled()) {
		fAp.getSave().click();
		log.info("Testcase failed\n");
		}
		else {
			fAp.getCancel().click();
			log.info("Testcase passed\n");
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
	
		Object[][] data=new Object[6][3];
		
		data[0][0]="Integer";
		data[0][1]=1;
		data[0][2]="abc";
		
		data[1][0]="Decimal";
		data[1][1]=2;
		data[1][2]="abc123";
		
		data[2][0]="String";
		data[2][1]=3;
		data[2][2]="   ";
		
		data[3][0]="Date";
		data[3][1]=4;
		data[3][2]="hfkshfksh";
		
		data[4][0]="DateTime";
		data[4][1]=5;
		data[4][2]="fslsjljljslgj";
		
		data[5][0]="Lookup";
		data[5][1]=6;
		data[5][2]="abcd";
		
		
		return data;
		
	}
	
	
}
