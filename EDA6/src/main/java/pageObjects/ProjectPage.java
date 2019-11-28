package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage {

public WebDriver driver;
	
	
	private By Add=By.id("add_archive");
	private By ProjectList=By.xpath("//*[@id='myTable']/tbody/tr[2]/td[2]");
	private By ProjectDepertment=By.xpath("//*[@id='myTable']/tbody/tr[2]/td[5]");
	private By ProjectListNext=By.xpath("//*[@id='myTable']/tbody/tr[3]/td[2]");
	private By View=By.id("viewArc");
	private By Edit=By.id("edit_archive");
	private By ActiveInactive=By.id("Active_project");
	private By ManageUser=By.id("archive_manageuser");
	private By ViewUser=By.id("ViewUser_Arc");
	private By Fields=By.id("archive_managefield");
	private By View_files=By.id("view_file");
	private By Reload_Cache=By.id("reload_cache");
	private By ViewRC=By.xpath("//*[@id='A2']");
	private By EditRC=By.xpath("//*[@id='A3']");
	private By ActiveInactiveRC=By.xpath("//*[@id='A8']");
	private By ManageUserRC=By.xpath("//*[@id='archivemanageuser']/a/span");
	private By ViewUserRC=By.xpath("//*[@id='ViewUserArc']/a/span");
	private By FieldRC=By.xpath("//*[@id='archivemanagefield']/a/span");
	private By View_filesRC=By.xpath("//*[@id='viewfiles']/a");
	private By Reload_CacheRC=By.xpath("//*[@id='reloadcache']/a/span");
	
	
	
	public ProjectPage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement getProjectList()
	{
		return driver.findElement(ProjectList);
	}
	public WebElement getProjectListNext()
	{
		return driver.findElement(ProjectListNext);
	}
	public WebElement getAdd()
	{
		return driver.findElement(Add);
	}
	public WebElement getView()
	{
		return driver.findElement(View);
	}
	public WebElement getEdit()
	{
		return driver.findElement(Edit);
	}
	public WebElement getActiveInactive()
	{
		return driver.findElement(ActiveInactive);
	}
	public WebElement getManageUser()
	{
		return driver.findElement(ManageUser);
	}
	public WebElement getViewUser()
	{
		return driver.findElement(ViewUser);
	}
	public WebElement getField()
	{
		return driver.findElement(Fields);
	}
	public WebElement getView_files()
	{
		return driver.findElement(View_files);
	}
	public WebElement getReload_Cache()
	{
		return driver.findElement(Reload_Cache);
	}
	public WebElement getViewRC()
	{
		return driver.findElement(ViewRC);
	}
	public WebElement getEditRC()
	{
		return driver.findElement(EditRC);
	}
	public WebElement getActiveInactiveRC()
	{
		return driver.findElement(ActiveInactiveRC);
	}
	public WebElement getManageUserRC()
	{
		return driver.findElement(ManageUserRC);
	}
	public WebElement getViewUserRC()
	{
		return driver.findElement(ViewUserRC);
	}
	public WebElement getFieldRC()
	{
		return driver.findElement(FieldRC);
	}
	public WebElement getView_filesRC()
	{
		return driver.findElement(View_filesRC);
	}
	public WebElement getReload_CacheRC()
	{
		return driver.findElement(Reload_CacheRC);
	}
	public WebElement getProjectDepertment()
	{
		return driver.findElement(ProjectDepertment);
	}
	
}
