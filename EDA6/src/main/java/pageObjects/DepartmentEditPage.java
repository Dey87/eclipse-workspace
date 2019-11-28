package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentEditPage {

	public WebDriver driver;
	
	private By departmentName=By.xpath("//*[@id='ProjectNameError']");
	private By Description=By.xpath("//*[@id='ProjectDescriptionError']");
	private By SelectAdmin_button=By.xpath("//*[@id='admincheck']");
	private By SelentAdmin=By.xpath("//*[@id='AdminID1']");
	private By Cancel=By.xpath("//*[@id='AddProject']/div/div[2]/div[3]/ul/li[2]/input[1]");
	private By Save=By.xpath("//*[@id='btnSubmit']");

	
	
	public DepartmentEditPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	public WebElement getDepartmentName() 
	{
		return driver.findElement(departmentName);
	}
	
	public WebElement getDescription() 
	{
		return driver.findElement(Description);
	}
	
	public WebElement getSelectAdmin_button() 
	{
		return driver.findElement(SelectAdmin_button);
	}

	public WebElement getSelentAdmin() 
	{
		return driver.findElement(SelentAdmin);
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
	