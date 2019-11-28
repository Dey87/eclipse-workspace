package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Role_Addpage {
	
	WebDriver driver;
	
	private By Name=By.xpath("//*[@id='RoleName']");
	private By Description=By.xpath("//*[@id='RoleDecription']");
	
	private By SelectALL=By.xpath("//*[@id='selectallaccess']");
	private By RestALL=By.xpath("//*[@id='removeallaccess']");
	
	private By SelectDepartment=By.xpath("//*[@id='Department']");
		private By Dep_View=By.xpath("//*[@id='access_1000']");
		private By Dep_Add=By.xpath("//*[@id='access_1001']");
		private By Dep_Update=By.xpath("//*[@id='access_1002']");
		private By Dep_Delete=By.xpath("//*[@id='access_1003']");
		private By Dep_Admin=By.xpath("//*[@id='access_1004']");
		private By Dep_DepartmentUser=By.xpath("//*[@id='access_1005']");
			
	private By SelectProject=By.xpath("//*[@id='Project']");
		private By Pro_View=By.xpath("//*[@id='access_1006']");
		private By Pro_Add=By.xpath("//*[@id='access_1007']");
		private By Pro_Update=By.xpath("//*[@id='access_1008']");
		private By Pro_Delete=By.xpath("//*[@id='access_1009']");
	
	private By SelectDocument=By.xpath("//*[@id='Document']");
		private By Doc_View=By.xpath("//*[@id='access_1026']");
		private By Doc_Upload=By.xpath("//*[@id='access_1027']");
		private By Doc_Download=By.xpath("//*[@id='access_1028']");
		private By Doc_Annotate=By.xpath("//*[@id='access_1029']");
	
	private By SelectField=By.xpath("//*[@id='Field']");
		private By Fld_View=By.xpath("//*[@id='access_1014']");
		private By Fld_Add=By.xpath("//*[@id='access_1015']");
		private By Fld_Update=By.xpath("//*[@id='access_1016']");
		private By Fld_Delete=By.xpath("//*[@id='access_1017	']");
	
	private By SelectView=By.xpath("//*[@id='View']");
		private By View_View=By.xpath("//*[@id='access_1022']");
		private By View_Add=By.xpath("//*[@id='access_1023']");
		private By View_Update=By.xpath("//*[@id='access_1024']");
		private By View_Delete=By.xpath("//*[@id='access_1025']");

	private By SelectFilter=By.xpath("//*[@id='Filter']");
		private By Fil_View=By.xpath("//*[@id='access_1018']");
		private By Fil_Add=By.xpath("//*[@id='access_1019']");
		private By Fil_Update=By.xpath("//*[@id='access_1020']");
		private By Fil_Delete=By.xpath("//*[@id='access_1021']");
	
	private By SelectRole=By.xpath("//*[@id='Role']");
		private By Rol_View=By.xpath("//*[@id='access_1030']");
		private By Rol_Add=By.xpath("//*[@id='access_1031']");
		private By Rol_Update=By.xpath("//*[@id='access_1032']");
		private By Rol_Delete=By.xpath("//*[@id='access_1033']");
	
	private By SelectUser=By.xpath("//*[@id='User']");
		private By Usr_Add=By.xpath("//*[@id='access_1010']");
		private By Usr_ViewAllUser=By.xpath("//*[@id='access_1011']");
		private By Usr_ManageUser=By.xpath("//*[@id='access_1012']");
		private By Usr_UpdateAllUser=By.xpath("//*[@id='access_1013']");
	

	private By Cancel=By.xpath("//*[@id='Role_Div']/div/div/div[3]/div/ul/li/input[1]");
	private By Save=By.id("btnSaveRole");
	

	
	public Role_Addpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getName() {
			
		return driver.findElement(Name);	
	}
	public WebElement getDescription() {
		
		return driver.findElement(Description);	
	}
	public WebElement getSelectALL() {
		
		return driver.findElement(SelectALL);	
	}
	public WebElement getRestALL() {
		
		return driver.findElement(RestALL);	
	}
	public WebElement getSelectDepartment() {
		
		return driver.findElement(SelectDepartment);	
	}
	public WebElement getDep_View() {
		
		return driver.findElement(Dep_View);	
	}
	public WebElement getDep_Add() {
		
		return driver.findElement(Dep_Add);	
	}
	public WebElement getDep_Update() {
		
		return driver.findElement(Dep_Update);	
	}
	public WebElement getDep_Delete() {
		
		return driver.findElement(Dep_Delete);	
	}
	public WebElement getDep_Admin() {
		
		return driver.findElement(Dep_Admin);	
	}
	public WebElement getDep_DepartmentUser() {
		
		return driver.findElement(Dep_DepartmentUser);	
	}
	public WebElement getSelectProject() {
		
		return driver.findElement(SelectProject);	
	}
	public WebElement getPro_View() {
		
		return driver.findElement(Pro_View);	
	}
	public WebElement getPro_Add() {
		
		return driver.findElement(Pro_Add);	
	}
	public WebElement getPro_Update() {
		
		return driver.findElement(Pro_Update);	
	}
	public WebElement getPro_Delete() {
		
		return driver.findElement(Pro_Delete);	
	}
	public WebElement getSelectDocument() {
		
		return driver.findElement(SelectDocument);	
	}
	public WebElement getDoc_View() {
		
		return driver.findElement(Doc_View);	
	}
	public WebElement getDoc_Upload() {
		
		return driver.findElement(Doc_Upload);	
	}
	public WebElement getDoc_Download() {
		
		return driver.findElement(Doc_Download);	
	}
	public WebElement getDoc_Annotate() {
		
		return driver.findElement(Doc_Annotate);	
	}
	public WebElement getSelectField() {
		
		return driver.findElement(SelectField);	
	}
	public WebElement getFld_View() {
		
		return driver.findElement(Fld_View);	
	}
	public WebElement getFld_Add() {
		
		return driver.findElement(Fld_Add);	
	}
	public WebElement getFld_Update() {
		
		return driver.findElement(Fld_Update);	
	}
	public WebElement getFld_Delete() {
		
		return driver.findElement(Fld_Delete);	
	}
	public WebElement getSelectView() {
		
		return driver.findElement(SelectView);	
	}
	public WebElement getView_View() {
		
		return driver.findElement(View_View);	
	}
	public WebElement getView_Add() {
		
		return driver.findElement(View_Add);	
	}
	public WebElement getView_Update() {
		
		return driver.findElement(View_Update);	
	}
	public WebElement getView_Delete() {
		
		return driver.findElement(View_Delete);	
	}
	public WebElement getSelectFilter() {
		
		return driver.findElement(SelectFilter);	
	}
	public WebElement getFil_View() {
		
		return driver.findElement(Fil_View);	
	}
	public WebElement getFil_Add() {
		
		return driver.findElement(Fil_Add);	
	}
	public WebElement getFil_Update() {
		
		return driver.findElement(Fil_Update);	
	}
	public WebElement getFil_Delete() {
		
		return driver.findElement(Fil_Delete);	
	}
	public WebElement getSelectRole() {
		
		return driver.findElement(SelectRole);	
	}
	public WebElement getRol_View() {
		
		return driver.findElement(Rol_View);	
	}
	public WebElement getRol_Add() {
		
		return driver.findElement(Rol_Add);	
	}
	public WebElement getRol_Update() {
		
		return driver.findElement(Rol_Update);	
	}
	public WebElement getRol_Delete() {
		
		return driver.findElement(Rol_Delete);	
	}
	public WebElement getSelectUser() {
		
		return driver.findElement(SelectUser);	
	}
	public WebElement getUsr_Add() {
		
		return driver.findElement(Usr_Add);	
	}
	public WebElement getUsr_ViewAllUser() {
		
		return driver.findElement(Usr_ViewAllUser);	
	}
	public WebElement getUsr_ManageUser() {
		
		return driver.findElement(Usr_ManageUser);	
	}
	public WebElement getUsr_UpdateAllUser() {
		
		return driver.findElement(Usr_UpdateAllUser);	
	}
	public WebElement getCancel() {
		
		return driver.findElement(Cancel);	
	}
	public WebElement getSave() {
		
		return driver.findElement(Save);	
	}
}
