package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentAddPage {
	
	public WebDriver driver;
	
	private By departmentName=By.id("ProjectNameError");
	private By description=By.id("ProjectDescriptionError");
	private By selectAdmin=By.id("admincheck");
	private By cancel=By.xpath("//li[@class='right']/input[1]");
	private By save=By.id("btnSubmit");
	private By chooseAdmin=By.id("AdminID8");
	public By Admins=By.xpath("//*[@id='Adminlist']/li/p");
	
	public DepartmentAddPage(WebDriver driver)
	{
		
		this.driver=driver;	
	}
	
	
	
	public WebElement getDepartmentName()
	{
		return driver.findElement(departmentName);
		
	}
	public WebElement getDescription()
	{
		return driver.findElement(description);
		
	}
	public WebElement getSelectAdmin()
	{
		return driver.findElement(selectAdmin);
		
	}
	public WebElement getCancel()
	{
		return driver.findElement(cancel);
		
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
		
	}
	public WebElement getChooseAdmin()
	{
		return driver.findElement(chooseAdmin);
		
	}

}
