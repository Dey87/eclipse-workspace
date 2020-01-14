package epsTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.TCpage;
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
		
		Thread.sleep(2000);
		
		TCpage tp=new TCpage(driver);
		
		Select tg=new Select(tp.getTemplateGroup());
		tg.selectByVisibleText(prop.getProperty("templateG"));
		
		Select bp=new Select(tp.getBidParts());
		bp.selectByVisibleText(prop.getProperty("bidParts"));
		
		tp.getRadioBids().click();
		
		tp.getTender_Reference_No().sendKeys("hfgjg");
		
		Select pc=new Select(tp.getProcurement_Category());
		pc.selectByVisibleText(prop.getProperty("Procurement_Category"));
		
		//tp.getTender_Currency().sendKeys();
		tp.getPAC().sendKeys("7576778");
		//tp.getBidding_Currency().sendKeys();
		
		Select tt=new Select(tp.getTender_Type());
		tt.selectByVisibleText(prop.getProperty("Tender_Type"));
		
		//tp.getMinimum_Number_Of_Bids().sendKeys("1");
		
		//Select rs=new Select(tp.getRanking_Sequence());
		//rs.selectByVisibleText(prop.getProperty("Ranking_Sequence"));
		
		tp.getDetailed_Description().sendKeys("dhgfjfhtfhfhgfhgfhg");
		
		tp.getSubmit().click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tp.ExcelBidding));
		List<WebElement> Atabs = tp.getTabs();
		System.out.println("Number of elements:" +Atabs.size());
		
		Thread.sleep(10000);
		
		
		
		
		}

	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	

}
