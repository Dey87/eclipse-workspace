package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectAddPage {
	
	public WebDriver driver;
	
	private By ProjectName=By.id("arcname");
	private By Description=By.id("arcdescription");
	private By Select_Department=By.xpath("//*[@id='AddARc_fromMenu']/div/button/span[1]");
	private By Search_Department=By.xpath("//*[@id='AddARc_fromMenu']/div/div/div/input");
	private By Choose_Department=By.xpath("//*[@id='AddARc_fromMenu']/div/div/ul/li[2]/a/span[1]");
	private By Cancel=By.xpath("//*[@id='projectbtn']/div/ul/li/input[1]");
	private By Save=By.xpath("//*[@id='Buttonarc']");
	
	
	public ProjectAddPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	
	public WebElement getProjectName()
	{
		return driver.findElement(ProjectName);
		
	}
	public WebElement getDescription()
	{
		return driver.findElement(Description);
		
	}
	public WebElement getSelect_Department()
	{
		return driver.findElement(Select_Department);
		
	}
	public WebElement getSearch_Department()
	{
		return driver.findElement(Search_Department);
		
	}
	public WebElement getChoose_Department()
	{
		return driver.findElement(Choose_Department);
		
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
