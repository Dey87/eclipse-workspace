package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FieldEditPage {
	
public WebDriver driver;
	
	private By Name=By.xpath("//*[@id='fieldname']");
	private By Description=By.xpath("//*[@id='fielddescription']");
	private By Cancel=By.xpath("//*[@id='FieldCancel']");
	private By Save=By.xpath("//*[@id='ButtonField']");
	
	
	public FieldEditPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public WebElement getName()
	{
		return driver.findElement(Name);
	}
	public WebElement getDescription()
	{
		return driver.findElement(Description);
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
