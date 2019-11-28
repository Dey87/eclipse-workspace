package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentManageUserPage {

public WebDriver driver;
	
	private By MultiSelect=By.xpath("//button[@id='MultiSelect']");
	private By Multideselect=By.xpath("//button[@id='Multideselect']");
	private By SingleSelect=By.xpath("//button[@id='SingleSelect']");
	private By SingledeSelect=By.xpath("//button[@id='SingledeSelect']");
	private By Availableuser=By.xpath("//*[@id='Availableuser']/select/option[1]");
	private By Selecteduser=By.xpath("//*[@id='Selecteduser']/select/option[1]");
	private By Cancel=By.xpath("//*[@id='departmentManageUser']/div[2]/div/ul/li/input[1]");
	private By Save=By.xpath("//*[@id='departmentManageUser']/div[2]/div/ul/li/input[2]");
	private By Save4project=By.xpath("//*[@id='ProjectManageUser']/div[2]/div/ul/li/input[2]");
	private By Cancel4project=By.xpath("//*[@id='ProjectManageUser']/div[2]/div/ul/li/input[1]");
	
	
	public DepartmentManageUserPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public WebElement getMultiSelect()
	{
		return driver.findElement(MultiSelect);
	}
	public WebElement getMultideselect()
	{
		return driver.findElement(Multideselect);
	}
	public WebElement getSingleSelect()
	{
		return driver.findElement(SingleSelect);
	}
	public WebElement getSingledeSelect()
	{
		return driver.findElement(SingledeSelect);
	}
	public WebElement getAvailableuser()
	{
		return driver.findElement(Availableuser);
	}
	public WebElement getSelecteduser()
	{
		return driver.findElement(Selecteduser);
	}
	public WebElement getCancel()
	{
		return driver.findElement(Cancel);
	}
	public WebElement getSave()
	{
		return driver.findElement(Save);
	}
	public WebElement getSave4project()
	{
		return driver.findElement(Save4project);
	}
	public WebElement getCancel4project()
	{
		return driver.findElement(Cancel4project);
	}
	
}
