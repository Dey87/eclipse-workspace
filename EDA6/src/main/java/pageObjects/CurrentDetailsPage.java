package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentDetailsPage {
	
	public WebDriver driver;
	
	private By Current_Department=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[2]/div/button/span[1]");
	private By Search_Department=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[2]/div/div/div/input");
	private By Current_Project=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[3]/div/div/button/span[1]");
	private By Search_Project=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[3]/div/div/div/div/input");
	private By Current_View=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[4]/div/button/span[1]");
	private By Select_View=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[4]/div/div/ul/li[2]/a/span[1]");
	private By Current_Filter=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[5]/div/button");
	private By Select_Filter=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[1]/ul/li[5]/div/div/ul/li[2]/a/span[1]");
	private By Cancel=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div[2]/div/ul/li/input[1]");
	private By Save=By.id("btnSaveCurrentInfo");
	
	
	public CurrentDetailsPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	
	public WebElement getCurrent_Department()
	{
		return driver.findElement(Current_Department);
		
	}
	public WebElement getSearch_Department()
	{
		return driver.findElement(Search_Department);
		
	}
	public WebElement getCurrent_Project()
	{
		return driver.findElement(Current_Project);
		
	}
	public WebElement getSearch_Project()
	{
		return driver.findElement(Search_Project);
		
	}
	public WebElement getCurrent_View()
	{
		return driver.findElement(Current_View);
		
	}
	public WebElement getSelect_View()
	{
		return driver.findElement(Select_View);
		
	}
	public WebElement getCurrent_Filter()
	{
		return driver.findElement(Current_Filter);
		
	}
	public WebElement getSelect_Filter()
	{
		return driver.findElement(Select_Filter);
		
	}
	public WebElement getCancel()
	{
		return driver.findElement(Cancel);
		
	}
	public WebElement getSave()
	{
		return driver.findElement(Save);
		
	}

}
