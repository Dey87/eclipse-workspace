package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterAddPage {

	
WebDriver driver;
	
	private By Name=By.xpath("//*[@id='filterName']");
	private By Description=By.xpath("//*[@id='filteDes']");
	private By Current_Department=By.xpath("//*[@id='Dept_Filter']/div/button/span[1]");
	private By Search_Department=By.xpath("//*[@id='Dept_Filter']/div/div/div/input");
	private By Current_Project=By.xpath("//*[@id='Arc_Filter']/div/button/span[1]");
	private By Search_Project=By.xpath("//*[@id='Arc_Filter']/div/div/div/input");
	private By Add_Row=By.xpath("//*[@id='AddRowBtn']");
	public By Select_Field=By.xpath("//*[@id='filter_view']/div/div[1]/div/div[1]/div/div/button/span[1]");
	private By Select_Condition=By.xpath("//*[@id='filter_view']/div/div[1]/div[2]/div[2]/div/div/button/span[1]");
	private By Set_Value=By.xpath("//*[@id='showvalue']/input");
	private By Cancel=By.xpath("//*[@id='btnCancelFilter']");
	private By Save=By.xpath("//*[@id='btnSaveFilter']");
	

	
	public FilterAddPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getName() {
			
		return driver.findElement(Name);	
	}
	public WebElement getDescription() {
		
		return driver.findElement(Description);	
	}
	public WebElement getCurrent_Department() {
		
		return driver.findElement(Current_Department);	
	}
	public WebElement getSearch_Department() {
		
		return driver.findElement(Search_Department);	
	}
	public WebElement getCurrent_Project() {
		
		return driver.findElement(Current_Project);	
	}
	public WebElement getSearch_Project() {
		
		return driver.findElement(Search_Project);	
	}
	public WebElement getAdd_Row() {
		
		return driver.findElement(Add_Row);	
	}
	public WebElement getSelect_Field() {
		
		return driver.findElement(Select_Field);	
	}
	public WebElement getSelect_Condition() {
		
		return driver.findElement(Select_Condition);	
	}
	public WebElement getSet_Value() {
		
		return driver.findElement(Set_Value);	
	}
    public WebElement getCancel() {
		
		return driver.findElement(Cancel);	
	}
	public WebElement getSave() {
		
		return driver.findElement(Save);	
	}
	
}
