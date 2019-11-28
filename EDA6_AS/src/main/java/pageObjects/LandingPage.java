package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;
	
	private By dashboard=By.xpath("//*[@id='dashboard']/a/span[2]");
	private By departments=By.xpath("//*[@id='projects']/a/span");
	private By projects=By.xpath("//*[@id='archives']/a/span");
	private By files=By.xpath("//*[@id='File_Uploads']/span");
	private By fields=By.xpath("//*[@id='Fields']/a/span");
	private By views=By.xpath("//*[@id='Views']/a/span[2]");
	private By filter=By.xpath("//*[@id='Filters']/a/span");
	private By user=By.xpath("//*[@id='Users']/a/span");
	private By roles=By.xpath("//*[@id='Roles']/a/span");
	private By currentDetails=By.xpath("//*[@id='CurrentInfo']/a/span");
	private By enterprise=By.cssSelector("input[value='Reset']");
	private By currentDetailsDashboard=By.xpath("//div[@class='dropdown1']/button");
	private By viewMaxandMin=By.xpath("//div[@class='header']/span");
	private By customer_name_from_dashboard=By.xpath("/html/body/div/div[1]/div[2]/div[1]/button");
	private By customer_signOut=By.xpath("//*[@id='myDropdown']/ul/li[3]/ul/li[2]/a");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getDashboard()
	{
		return driver.findElement(dashboard);
	}
	public WebElement getDepartment()
	{
		return driver.findElement(departments);
	}
	public WebElement getProjects()
	{
		return driver.findElement(projects);
	}
	public WebElement getFiles()
	{
		return driver.findElement(files);
	}
	public WebElement getFields()
	{
		return driver.findElement(fields);
	}
	public WebElement getViews()
	{
		return driver.findElement(views);
	}
	public WebElement getFilter()
	{
		return driver.findElement(filter);
	}
	public WebElement getUser()
	{
		return driver.findElement(user);
	}
	public WebElement getRoles()
	{
		return driver.findElement(roles);
	}
	public WebElement getCurrentDetails()
	{
		return driver.findElement(currentDetails);
	}
	public WebElement getEnterprise()
	{
		return driver.findElement(enterprise);
	}
	public WebElement getCurrentDetailsDashboard()
	{
		return driver.findElement(currentDetailsDashboard);
	}
	public WebElement getViewMaxandMin()
	{
		return driver.findElement(viewMaxandMin);
	}
	public WebElement getcustomer_name_from_dashboard()
	{
		return driver.findElement(customer_name_from_dashboard);
	}
	public WebElement getcustomer_signOut()
	{
		return driver.findElement(customer_signOut);
	}
}
