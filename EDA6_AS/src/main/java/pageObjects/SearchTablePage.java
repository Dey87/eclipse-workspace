package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchTablePage {

	public WebDriver driver;
	public SearchTablePage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	private By NameSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[2]/input");
	private By DescriptionSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[3]/input");
	private By ModeSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[4]/input");
	private By DepartmentSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[5]/input");
	private By HodSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[6]/input");
	private By CreatedBySearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[7]/input");
	private By CreatedOnSearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[8]/input");
	private By ModifiedBySearch=By.xpath("//*[@id='myTable']/tbody/tr[1]/td[9]/input");
	
	public WebElement getNameSearch()
	{
		return driver.findElement(NameSearch);
	}
	public WebElement getDescriptionSearch()
	{
		return driver.findElement(DescriptionSearch);
	}
	public WebElement getModeSearch()
	{
		return driver.findElement(ModeSearch);
	}
	public WebElement getDepartmentSearch()
	{
		return driver.findElement(DepartmentSearch);
	}
	public WebElement getHodSearch()
	{
		return driver.findElement(HodSearch);
	}
	public WebElement getCreatedBySearch()
	{
		return driver.findElement(CreatedBySearch);
	}
	public WebElement getCreatedOnSearch()
	{
		return driver.findElement(CreatedOnSearch);
	}
	public WebElement getModifiedBySearch()
	{
		return driver.findElement(ModifiedBySearch);
	}
}
