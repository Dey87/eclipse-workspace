package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FieldAddPage {
	
	public WebDriver driver;
	
	private By Dept_Level=By.id("CheckboxProjectField");
	private By Proj_Level=By.id("CheckboxArchiveField");
	private By Field_Name=By.xpath("//*[@id='fieldname']");
	private By Field_Drescription=By.xpath("//*[@id='fielddescription']");
	
	private By Select_Department=By.xpath("//*[@id='project_field']/div/div/button/span[1]");
	private By Search_Department=By.xpath("//*[@id='project_field']/div/div/div/div/input");
	
	private By Select_Project=By.xpath("//*[@id='Archive_Field']/div/button/span[1]");
	private By Search_Project=By.xpath("//*[@id='Archive_Field']/div/div/div/input");
	
	private By Field_type=By.xpath("//*[@id='Fieldtype']/div/button/span[1]");
	private By Search_Field_type=By.xpath("//*[@id='Fieldtype']/div/div/div/input");
	private By Choose_Field_type=By.xpath("//*[@id='Fieldtype']/div/div/ul/li[2]");
	
	private By Field_Value_4IntNdec=By.xpath("//*[@id='Integerfield']");
	private By Field_Value_4String=By.xpath("//*[@id='Stringfield']");
	private By Field_Value_4Date=By.xpath("//*[@id='date']");
	private By Field_Value_4DateNtime=By.xpath("//*[@id='datetimepicker']");
	
	
	private By Field_Value_4Lookup=By.xpath("//*[@id='lookuptext']");
	private By Shift_Lookup_Value=By.xpath("//*[@id='getlookup']");
	public By Lookup_Value_inlist=By.xpath("//*[@id='lookup_list']/option[1]");
	private By Edit_Lookup_Value=By.xpath("//*[@id='edit']/span");
	private By Up_Lookup_Value=By.xpath("//*[@id='up']/span");
	private By Down_Lookup_Value=By.xpath("//*[@id='down']/span");
	private By Remove_Lookup_Value=By.xpath("//*[@id='remove']/sp");
	private By Default_Lookup_Value=By.xpath("//*[@id='SetDefault']/span");
	private By Checkbox_4_MandatoryField=By.xpath("//*[@id='IsMandatory']");
	private By Cancel=By.xpath("//*[@id='FieldCancel']");
	private By Save=By.xpath("//*[@id='ButtonField']");
	
	public FieldAddPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
		
	
	
	public WebElement getDept_Level()
	{
		return driver.findElement(Dept_Level);
		
	}
	public WebElement getProj_Level()
	{
		return driver.findElement(Proj_Level);
		
	}
	public WebElement getField_Name()
	{
		return driver.findElement(Field_Name);
		
	}
	public WebElement getField_Drescription()
	{
		return driver.findElement(Field_Drescription);
		
	}
	public WebElement getSelect_Department()
	{
		return driver.findElement(Select_Department);
		
	}
	public WebElement getSearch_Department()
	{
		return driver.findElement(Search_Department);
		
	}
	public WebElement getSelect_Project()
	{
		return driver.findElement(Select_Project);
		
	}
	public WebElement getSearch_Project()
	{
		return driver.findElement(Search_Project);
		
	}
	public WebElement getField_type()
	{
		return driver.findElement(Field_type);
		
	}
	public WebElement getSearch_Field_type()
	{
		return driver.findElement(Search_Field_type);
		
	}
	public WebElement getChoose_Field_type()
	{
		return driver.findElement(Choose_Field_type);
		
	}
	public WebElement getField_Value_4IntNdec()
	{
		return driver.findElement(Field_Value_4IntNdec);
		
	}
	public WebElement getField_Value_4String()
	{
		return driver.findElement(Field_Value_4String);
		
	}
	public WebElement getField_Value_4Date()
	{
		return driver.findElement(Field_Value_4Date);
		
	}
	public WebElement getField_Value_4DateNtime()
	{
		return driver.findElement(Field_Value_4DateNtime);
		
	}
	public WebElement getField_Value_4Lookup()
	{
		return driver.findElement(Field_Value_4Lookup);
		
	}
	public WebElement getShift_Lookup_Value()
	{
		return driver.findElement(Shift_Lookup_Value);
		
	}
	public WebElement getLookup_Value_inlist()
	{
		return driver.findElement(Lookup_Value_inlist);
		
	}
	public WebElement getEdit_Lookup_Value()
	{
		return driver.findElement(Edit_Lookup_Value);
		
	}
	public WebElement getUp_Lookup_Value()
	{
		return driver.findElement(Up_Lookup_Value);
		
	}
	public WebElement getDown_Lookup_Value()
	{
		return driver.findElement(Down_Lookup_Value);
		
	}
	public WebElement getRemove_Lookup_Value()
	{
		return driver.findElement(Remove_Lookup_Value);
		
	}
	public WebElement getDefault_Lookup_Value()
	{
		return driver.findElement(Default_Lookup_Value);
		
	}
	public WebElement getCheckbox_4_MandatoryField()
	{
		return driver.findElement(Checkbox_4_MandatoryField);
		
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
