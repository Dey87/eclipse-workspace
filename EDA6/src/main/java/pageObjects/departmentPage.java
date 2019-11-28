package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class departmentPage {

public WebDriver driver;
	
	
	private By add=By.id("adddept");
	private By departmentList=By.xpath("//table[@id='myTable']/tbody/tr[2]/td[2]");
	private By view=By.id("viewdept");
	private By edit=By.id("editdept");
	private By activeInactive=By.id("Active_department");
	private By goToProject=By.id("Proj_arc");
	private By manageUser=By.id("ManageUserDept");
	private By viewUser=By.id("ViewUser_dept");
	private By fields=By.id("ManageFieldDept");
	private By viewRC=By.xpath("//a[@id='viewproj']/span");
	private By editRC=By.xpath("//a[@id='dept-edit']/span']");
	private By activeInactiveRC=By.xpath("//a[@id='A8']/span");
	private By goToProjectRC=By.cssSelector("//li[@id='dept-arc']/a/span");
	private By manageUserRC=By.xpath("//li[@id='ManageUser']/a/span");
	private By viewUserRC=By.xpath("//li[@id='ViewUserDept']/a/span");
	private By fieldRC=By.xpath("//li[@id='ManageField']/a/span");
	private By the1stDepartmentOnRow=By.xpath("//*[@id='myTable']/tbody/tr[2]/td[2]");
	
	
	
	
	public departmentPage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement getDepartmentList()
	{
		return driver.findElement(departmentList);
	}
	public WebElement getAdd()
	{
		return driver.findElement(add);
	}
	public WebElement getView()
	{
		return driver.findElement(view);
	}
	public WebElement getEdit()
	{
		return driver.findElement(edit);
	}
	public WebElement getActiveInactive()
	{
		return driver.findElement(activeInactive);
	}
	public WebElement getGoToProject()
	{
		return driver.findElement(goToProject);
	}
	public WebElement getManageUser()
	{
		return driver.findElement(manageUser);
	}
	public WebElement getViewUser()
	{
		return driver.findElement(viewUser);
	}
	public WebElement getField()
	{
		return driver.findElement(fields);
	}
	public WebElement getViewRC()
	{
		return driver.findElement(viewRC);
	}
	public WebElement getEditRC()
	{
		return driver.findElement(editRC);
	}
	public WebElement getActiveInactiveRC()
	{
		return driver.findElement(activeInactiveRC);
	}
	public WebElement getGoToProjectRC()
	{
		return driver.findElement(goToProjectRC);
	}
	public WebElement getManageUserRC()
	{
		return driver.findElement(manageUserRC);
	}
	public WebElement getViewUserRC()
	{
		return driver.findElement(viewUserRC);
	}
	public WebElement getFieldRC()
	{
		return driver.findElement(fieldRC);
	}
	public WebElement getthe1stDepartmentOnRow()
	{
		return driver.findElement(the1stDepartmentOnRow);
	}
	
}
