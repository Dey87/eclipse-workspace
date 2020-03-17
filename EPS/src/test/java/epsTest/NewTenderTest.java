package epsTest;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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
		//System.out.println("Number of elements:" +Atabs.size());
		int count=Atabs.size();
		Thread.sleep(3000);
		if(count>1) {
			for(int i=1; i<=count; i++) {
				//WebDriverWait wait4tabs = new WebDriverWait(driver, 120);
				Atabs.get(i).click();
				
				Thread.sleep(2000);
				
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
					//System.out.println("Number of elements:" +p2_date.size());
					for(int j=0; j<p2_date.size(); j++) {
						p2_date.get(j).sendKeys("01-20-2020 01:43");
					//Thread.sleep(1000);
					}
					
				}
				
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/button[1]")).isDisplayed()) {

					System.out.println(i);
					
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
					  
					try {
					if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/textarea[1]")).isDisplayed()) {

					List<WebElement> p3_textArea=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/textarea[1]"));
					for(int j=0; j<p3_textArea.size(); j++) {
					p3_textArea.get(j).sendKeys("text_test");
					//Thread.sleep(1000);
					}
					}else {
						System.out.println("2.1");
						}
					}
					 catch (NoSuchElementException e) {
					    //handle else
						System.out.println("2.1");
					}
					
					try {
					if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/select[1]")).isDisplayed()) {

					List<WebElement> p3_select=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td/span[1]/tender-custom-input[1]/div[1]/div[1]/select[1]"));
					for(int j=0; j<p3_select.size(); j++) {
					Select dropdown=new Select(p3_select.get(j));
					dropdown.selectByIndex(1);
					//Thread.sleep(1000);
					}
					}else {
						System.out.println("2.1");
						}
					}
					 catch (NoSuchElementException e) {
					    //handle else
						System.out.println("2.1");
					}
					
				}
				
				
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/a[5]/button[1]")).isDisplayed()) {

						System.out.println(i);
						//Thread.sleep(3000);
				
						for(int j=0; j<3; j++) {
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/a[5]/button[1]")).click();
	
						}
						try {
						if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).isDisplayed()) {

							List<WebElement> p4_input=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]"));
							for(int j=0; j<p4_input.size(); j++) {
							p4_input.get(j).sendKeys("6464646");
							//Thread.sleep(1000);
							}
						}else {
							System.out.println("2.1");
							}
						}
						 catch (NoSuchElementException e) {
						    //handle else
							System.out.println("2.1");
						}
						
						try {
						if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/span[1]/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).isDisplayed()) {

							List<WebElement> p4_quantity=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[5]/span[1]/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]"));
							for(int j=0; j<p4_quantity.size(); j++) {
							p4_quantity.get(j).sendKeys("11111");
							//Thread.sleep(1000);
							}
						}else {
							System.out.println("2.1");
							}
						}
						 catch (NoSuchElementException e) {
						    //handle else
							System.out.println("2.1");
						}
						
						try {
						if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/select[1]")).isDisplayed()) {
	
							List<WebElement> p4_select=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[8]/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/select[1]"));
							for(int j=0; j<p4_select.size(); j++) {
							Select dropdown=new Select(p4_select.get(j));
							dropdown.selectByIndex(1);
							//Thread.sleep(1000);
							}
						}else {
							System.out.println("2.1");
							}
						}
						 catch (NoSuchElementException e) {
						    //handle else
							System.out.println("2.1");
						}


					}
				
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/div[1]/a[1]/button[1]")).isDisplayed()) {  
					System.out.println("3");
					//List<WebElement> p5_button=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[i]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/a[5]/button[1]"));
					//System.out.println("Number of elements:" +p3_button.size());
					for(int j=0; j<1; j++) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/div[1]/a[1]/button[1]")).click();
					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).sendKeys("");
					//add autoiD for file upload

					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).click();

					}

					}

				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).isDisplayed()) {
						
						List<WebElement> p2_date=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/form[1]/div[2]/div/div[1]/tender-custom-input[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
						//System.out.println("Number of elements:" +p2_date.size());
						for(int j=0; j<p2_date.size(); j++) {
							p2_date.get(j).sendKeys("01-20-2020 01:43");
						//Thread.sleep(1000);
						}
						
					}
				
				else if(driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/button[1]")).isDisplayed()) {

					System.out.println("3");
					//List<WebElement> p5_button=driver.findElements(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[i]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/a[5]/button[1]"));
					//System.out.println("Number of elements:" +p3_button.size());
					for(int j=0; j<1; j++) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/button[1]")).click();
					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/tender-custom-input[1]/div[1]/div[1]/input[1]")).sendKeys("hhh");

					driver.findElement(By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div['"+i+"']/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
					}

					}


				else {
					System.out.println("not present");
					}
					}
			
			}
		
		else {
			System.out.println(count);
			
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
