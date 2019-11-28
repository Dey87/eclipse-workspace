package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RolePage {
	
	WebDriver driver;
	
	private By Add=By.xpath("//*[@id='add_role']");
	private By View=By.xpath("//*[@id='viewrole']");
	private By Edit=By.xpath("//*[@id='Edit_role']");
	private By Rview=By.xpath("//*[@id='A12']/span");
	private By Redit=By.xpath("//*[@id='role-edit']/a/span");
	private By search_name=By.xpath("//*[@id='dtBasicExampleRole']/tbody/tr[1]/td[1]/input");
	private By Role_1st_role=By.xpath("//*[@id='dtBasicExampleRole']/tbody/tr[2]/td[1]");
	
	
	
	

	public RolePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getAdd() {
			
		return driver.findElement(Add);	
	}
	public WebElement getView() {
		
		return driver.findElement(View);	
	}
	public WebElement getEdit() {
		
		return driver.findElement(Edit);	
	}
	public WebElement getRview() {
		
		return driver.findElement(Rview);	
	}
	public WebElement getRedit() {
		
		return driver.findElement(Redit);	
	}
	public WebElement getsearch_name() {
		
		return driver.findElement(search_name);	
	}
	public WebElement getRole_1st_role() {
		
		return driver.findElement(Role_1st_role);	
	}

}
