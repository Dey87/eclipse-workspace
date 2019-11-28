package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewAddPage {
	
	WebDriver driver;
	
	private By Name=By.xpath("//*[@id='viewname']");
	private By Description=By.xpath("//*[@id='viewdescription']");
	
	private By CurrentDepartment=By.xpath("//*[@id='Depart_view']/div/div/button/span[1]");
	private By SearchDepartment=By.xpath("//*[@id='Depart_view']/div/div/div/div/input");
	
	private By CurrentProject=By.xpath("//*[@id='Project_view']/div/button/span[1]");
	private By SearchProject=By.xpath("//*[@id='Project_view']/div/div/div/input");
	
	private By MultiSelect=By.xpath("//button[@id='MultiSelect']");
	private By Multideselect=By.xpath("//button[@id='Multideselect']");
	private By SingleSelect=By.xpath("//button[@id='SingleSelect']");
	private By SingledeSelect=By.xpath("//button[@id='SingledeSelect']");
	public By Availableuser=By.xpath("//*[@id='AvailableFields']/select/option");  //*[@id='Availableuser']/select/option
	public By Selecteduser=By.xpath("//*[@id='Selecteduser']/select/option");
	
	private By Cancel=By.xpath("//*[@id='view_save_cancel_btn']/div/ul/li/input[1]");
	private By Save=By.xpath("//*[@id='viewSubmit']");
	private By DuplicateError=By.id("error");

	
	public ViewAddPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getName() {
			
		return driver.findElement(Name);	
	}
	public WebElement getDescription() {
		
		return driver.findElement(Description);	
	}
	public WebElement getCurrentDepartment() {
		
		return driver.findElement(CurrentDepartment);	
	}
	public WebElement getSearchDepartment() {
		
		return driver.findElement(SearchDepartment);	
	}
	public WebElement getCurrentProject() {
		
		return driver.findElement(CurrentProject);	
	}
	public WebElement getSearchProject() {
		
		return driver.findElement(SearchProject);	
	}
	public WebElement getMultiSelect() {
		
		return driver.findElement(MultiSelect);	
	}
	public WebElement getMultideselect() {
		
		return driver.findElement(Multideselect);	
	}
	public WebElement getSingleSelect() {
		
		return driver.findElement(SingleSelect);	
	}
	public WebElement getSingledeSelect() {
		
		return driver.findElement(SingledeSelect);	
	}
	public WebElement getAvailableuser() {
		
		return driver.findElement(Availableuser);	
	}
	public WebElement getSelecteduser() {
		
		return driver.findElement(Selecteduser);	
	}
	public WebElement getCancel() {
		
		return driver.findElement(Cancel);	
	}
	public WebElement getSave() {
		
		return driver.findElement(Save);	
	}
	public WebElement getDuplicateError() {
		
		return driver.findElement(DuplicateError);	
	}
}
