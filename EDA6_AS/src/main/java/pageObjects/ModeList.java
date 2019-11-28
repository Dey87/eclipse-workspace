package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModeList {

public WebDriver driver;
	
	
	
	private By modebutton=By.xpath("//span[@class='filter-option pull-left']");
	private By searchMode=By.xpath("//div[@class='bs-searchbox']/input");
	private By activeMode=By.xpath("//li[@data-original-index='0']/a");
	private By inActiveMode=By.xpath("//li[@data-original-index='1']/a");
	private By allMode=By.xpath("//li[@data-original-index='2']/a");
	
	
	
	public ModeList(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	

	public WebElement getModeButton()
	{
		return driver.findElement(modebutton);
	}
	public WebElement getSearchMode()
	{
		return driver.findElement(searchMode);
	}

	public WebElement getActiveMode()
	{
		return driver.findElement(activeMode);
	}
	public WebElement inActiveMode()
	{
		return driver.findElement(inActiveMode);
	}
	public WebElement getAllMode()
	{
		return driver.findElement(allMode);
	}
	
	
}
