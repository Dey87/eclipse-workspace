package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage {

public WebDriver driver;
	
	private By Tender=By.xpath("/html[1]/body[1]/section[1]/aside[1]/div[2]/ul[1]/div[1]/div[1]/li[4]/a[1]/i[1]");
	private By Tender_Creation=By.xpath("/html[1]/body[1]/section[1]/aside[1]/div[2]/ul[1]/div[1]/div[1]/li[4]/ul[1]/li[1]/a[1]/span[1]");
	private By Create_New_RFQ=By.xpath("/html[1]/body[1]/section[1]/aside[1]/div[2]/ul[1]/div[1]/div[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	private By Tender_List=By.xpath("/html[1]/body[1]/aside[1]/div[2]/ul[1]/div[1]/div[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

	
	
	public dashboardPage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement getTender()
	{
		return driver.findElement(Tender);
	}
	
	public WebElement getTender_Creation()
	{
		return driver.findElement(Tender_Creation);
	}
	
	public WebElement getCreate_New_RFQ()
	{
		return driver.findElement(Create_New_RFQ);
	}
	
	public WebElement getTender_List()
	{
		return driver.findElement(Tender_List);
	}
	
}
