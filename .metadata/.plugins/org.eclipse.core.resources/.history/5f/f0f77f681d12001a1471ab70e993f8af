package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableFilter {

public WebDriver driver;
	
 
	private By name=By.xpath("//input[@ng-model='search.Name']");
	private By description=By.xpath("//input[@ng-model='search.Description']");
	private By mode=By.xpath("//input[@ng-model='search.Mode']");
	private By HOD=By.xpath("//input[@ng-model='search.HOD']");
	private By createdBy=By.xpath("//input[@ng-model='search.CreatedBy']");
	private By createdOn=By.xpath("//input[@ng-model='search.CreatedOn']");
	private By modifiedBy=By.xpath("//input[@ng-model='search.ModifiedBy']");
	
	
	
	public TableFilter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getDescription()
	{
		return driver.findElement(description);
	}
	public WebElement getMode()
	{
		return driver.findElement(mode);
	}
	public WebElement getHOD()
	{
		return driver.findElement(HOD);
	}
	public WebElement getCreatedBy()
	{
		return driver.findElement(createdBy);
	}
	public WebElement getCreatedOn()
	{
		return driver.findElement(createdOn);
	}
	public WebElement getModifiedBy()
	{
		return driver.findElement(modifiedBy);
	}
	
}
