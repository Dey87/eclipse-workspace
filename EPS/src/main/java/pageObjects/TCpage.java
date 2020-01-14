package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCpage {
	

public WebDriver driver;
	
	private By TemplateGroup=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]");
	private By BidParts=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/select[1]");
	private By RadioBids=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/input[1]");
	private By Tender_Reference_No=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]");
	private By Procurement_Category=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/select[1]");
	private By Tender_Currency=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/select[1]");
	private By PAC=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/input[1]");
	private By Bidding_Currency=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[2]/div[1]/select[1]/option[43]]");
	private By Tender_Type=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/select[1]");
	private By Minimum_Number_Of_Bids=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/input[1]");
	private By Ranking_Sequence=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/select[1]");
	private By Detailed_Description=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div/div[1]/div[1]/textarea[1]");
	private By Submit=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/h3[1]/div[1]/a[1]");
	private By Tabs=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li/a[1]");
	public By ExcelBidding=By.xpath("/html[1]/body[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
	
	
	public TCpage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement getTemplateGroup()
	{
		return driver.findElement(TemplateGroup);
	}
	public WebElement getBidParts()
	{
		return driver.findElement(BidParts);
	}
	public WebElement getRadioBids()
	{
		return driver.findElement(RadioBids);
	}
	public WebElement getTender_Reference_No()
	{
		return driver.findElement(Tender_Reference_No);
	}
	public WebElement getProcurement_Category()
	{
		return driver.findElement(Procurement_Category);
	}
	public WebElement getTender_Currency()
	{
		return driver.findElement(Tender_Currency);
	}
	public WebElement getPAC()
	{
		return driver.findElement(PAC);
	}
	public WebElement getBidding_Currency()
	{
		return driver.findElement(Bidding_Currency);
	}
	public WebElement getTender_Type()
	{
		return driver.findElement(Tender_Type);
	}
	public WebElement getMinimum_Number_Of_Bids()
	{
		return driver.findElement(Minimum_Number_Of_Bids);
	}
	public WebElement getRanking_Sequence()
	{
		return driver.findElement(Ranking_Sequence);
	}
	public WebElement getDetailed_Description()
	{
		return driver.findElement(Detailed_Description);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
	public List<WebElement> getTabs()
	{
		return driver.findElements(Tabs);
	}

}
