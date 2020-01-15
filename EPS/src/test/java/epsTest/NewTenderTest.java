package epsTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
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
		int count=Atabs.size();
		Thread.sleep(3000);
		if(count>1) {
			for(int i=1; i<=count; i++) {
				Atabs.get(i).click();
				
				if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
					
					List<WebElement> p1_input=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/input[1]"));
					System.out.println("Number of elements:" +p1_input.size());
					for(int j=0; j<p1_input.size(); j++) {
						p1_input.get(j).sendKeys("arka");
					//Thread.sleep(1000);
					}
					if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
						
						List<WebElement> p1_date=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
						for(int j=0; j<p1_date.size(); j++) {
							p1_date.get(j).sendKeys("02-31-2020 00:55");
						//Thread.sleep(1000);
						}
					}
				}
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
					
					List<WebElement> p2_date=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
					System.out.println("Number of elements:" +p2_date.size());
					for(int j=0; j<p2_date.size(); j++) {
						p2_date.get(j).sendKeys("01-17-2020 01:43");
					//Thread.sleep(1000);
					}
					
					System.out.println("1");
					
					
				}
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/button[1]")).isEnabled()) {
					
					System.out.println("2");
					//List<WebElement> p3_button=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/button[1]"));
					//System.out.println("Number of elements:" +p3_button.size());
					for(int j=0; j<3; j++) {
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/button[1]")).click();
				
					}
					if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
						
						List<WebElement> p3_input=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]"));
						for(int j=0; j<p3_input.size(); j++) {
							p3_input.get(j).sendKeys("text_test");
						//Thread.sleep(1000);
						}
					}
					
					
				}
				/*else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[i]/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
					
					List<WebElement> p2_date=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
					System.out.println("Number of elements:" +p2_date.size());
					for(int j=0; j<p2_date.size(); j++) {
						p2_date.get(j).sendKeys("02-31-2020 00:55");
					//Thread.sleep(1000);
					}
					
				}*/
				else {
					System.out.println("not present");
				}
				}
				Thread.sleep(1000);	
			}
			
		}
			
		//Thread.sleep(1000);
		


	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	

}
