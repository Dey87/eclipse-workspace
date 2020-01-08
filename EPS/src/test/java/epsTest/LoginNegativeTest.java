package epsTest;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resource.Base;


public class LoginNegativeTest extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 //driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void DepartmentPositveAdd(String uname, String pwd) throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getLogin().click();
		Thread.sleep(1000);
		lp.getUsername().sendKeys(uname);
		lp.getPassword().sendKeys(pwd);
		lp.getOk().click();
		
		Thread.sleep(4000);
		
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
	
		Object[][] data=new Object[4][2];
		
		data[0][0]=" ";
		data[0][1]=" ";
		
		data[1][0]="rdcis_super_admin1";
		data[1][1]=prop.getProperty("password");
		
		data[2][0]=prop.getProperty("username");
		data[2][1]="Paas@123";
		
		data[3][0]=prop.getProperty("username");
		data[3][1]="password' OR 1=1";
		
		
		return data;
		
	}

}
