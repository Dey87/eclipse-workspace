package edaTest;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DepartmentAddPage;
import pageObjects.FilterAddPage;
import pageObjects.FilterPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import pageObjects.departmentPage;
import resource.Base;



public class FilterAddTest extends Base {
	public static Logger log =LogManager.getLogger(FilterAddTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void FilterAdd() throws IOException, InterruptedException
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
		
		Thread.sleep(6000);
		
		LandingPage LP=new LandingPage(driver);
		Thread.sleep(1000);
		LP.getFilter().click();
		FilterPage fp=new FilterPage(driver);
		fp.getAdd().click();
		Thread.sleep(2000);
		FilterAddPage fAp=new FilterAddPage(driver);
		fAp.getName().sendKeys("testfilter1");
		fAp.getDescription().sendKeys("testfilter1");
		fAp.getCurrent_Department().click();
		fAp.getSearch_Department().sendKeys("Selenium");
		fAp.getSearch_Department().sendKeys(Keys.RETURN);
		fAp.getCurrent_Project().click();
		fAp.getSearch_Project().sendKeys("Automation Testing");
		fAp.getSearch_Project().sendKeys(Keys.RETURN);
		
		
		
		List<WebElement> AvailableUserLinks = driver.findElements(fAp.Select_Field);
		
		
		
		for(int i=2;i<7;i++)
		{
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[1]/div/div/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[1]/div/div/div/div/input")).sendKeys("");
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[1]/div/div/div/div/input")).sendKeys(Keys.RETURN);
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[2]/div/div/button/span[1]")).click();
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[2]/div/div/div/div/input")).sendKeys("");
			driver.findElement(By.xpath("//*[@id='filter_view']/div/div[1]/div['"+i+"']/div[2]/div/div/div/div/input")).sendKeys(Keys.RETURN);
			if(i==2)
			{
				fAp.getSet_Value().sendKeys("");
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='showvalue'+i-1]/input"));
			}
		}
		
		
		
		
		}

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
