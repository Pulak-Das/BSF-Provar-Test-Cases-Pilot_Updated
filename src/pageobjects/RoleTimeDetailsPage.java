package pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="RoleTimeDetailsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class RoleTimeDetailsPage {

	WebDriver driver;
	public RoleTimeDetailsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void resourceRoleGroupSelectionClick(){
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Move selection to Chosen']/parent::button)[2]"));
		ele.click();
	}
	public void daysOfWeekSelection(){
		WebElement mond = driver.findElement(By.xpath("//span[@title = 'Monday']"));
		WebElement tuesd = driver.findElement(By.xpath("//span[@title = 'Tuesday']"));
		WebElement wedd = driver.findElement(By.xpath("//span[@title = 'Wednesday']"));
		WebElement thursd = driver.findElement(By.xpath("//span[@title = 'Thursday']"));
		WebElement frid = driver.findElement(By.xpath("//span[@title = 'Friday']"));
		WebElement satd = driver.findElement(By.xpath("//span[@title = 'Saturday']"));
		WebElement sund = driver.findElement(By.xpath("//span[@title = 'Sunday']"));
		WebElement selectDaysBtn = driver.findElement(By.xpath("(//span[text()='Move selection to Chosen']/parent::button)[1]"));
		mond.click();
		selectDaysBtn.click();
		tuesd.click();
		selectDaysBtn.click();
		wedd.click();
		selectDaysBtn.click();
		thursd.click();
		selectDaysBtn.click();
		frid.click();
		selectDaysBtn.click();
		satd.click();
		selectDaysBtn.click();
		sund.click();
		selectDaysBtn.click();
	}
	public void driveTypeFieldNameAssertion(String driveTypeFieldName){
		String text = driver.findElement(By.xpath("//label[text()='Drive Type']")).getText();
		WebElement driveType = driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']/div/button)[2]"));
		if(text == driveTypeFieldName){
			driveType.click();
		}
	}
	public void clickDriveType(){
				WebElement driveType = driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']/div/button)[2]"));
				driveType.click();
	}
	public void DeleteRTD(){
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Delete'])[2]"));
		ele.click();
	}
	

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement NewBtnClick;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Type']/following-sibling::div//button")
	public WebElement sked_Type__c;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Lead_Time__c']")
	public WebElement Lead_Time;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Setup_Time__c']")
	public WebElement Setup_Time;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Breakdown_Time__c']")
	public WebElement Breakdown_Time;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Wrap_up_Time__c']")
	public WebElement Wrap_up_Time;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Effective_Start_Date__c']")
	public WebElement Effective_Start_Date;
	@TextType()
	@FindBy(xpath = "//input[@name='sked_Effective_End_Date__c']")
	public WebElement Effective_End_Date;
	@ChoiceListType(multipleSelectionString = true, values = { @ChoiceListValue(value = "Driving roles"), @ChoiceListValue(value = "Supervisory roles"), @ChoiceListValue(value = "Staff roles") })
	@FindBy(xpath = "//span[@title='Driving roles']")
	public WebElement sked_Resource_Role_Driver;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='*Resource Role GroupItem Driving roles moved to the list AvailablePress Ctrl (Cmd on Mac) + Left Arrow or Ctrl (Cmd on Mac) + Right Arrow to move items between lists.AvailableSupervisory rolesStaff rolesMove selection to ChosenMove selection to AvailableChosenDriving roles']//button[normalize-space(.)='Move selection to Chosen']")
	public WebElement resourceRoleGroupSelectBtn;
	@TextType()
	@FindBy(xpath = "//label[text()='Drive Type']")
	public WebElement DriveTypeFieldNameValidation;
	@TextType()
	@FindBy(xpath = "//label[@class='slds-form-element__label' and text()='Drive Type']")
	public WebElement DriveTypeFieldNameValidation1;
	@TextType()
	@FindBy(xpath = "//label[@class='slds-form-element__label' and text()='Drive Type']/parent::lightning-combobox//descendant::button")
	public WebElement Drive_Type_FixedSiteValidation;
	@TextType()
	@FindBy(xpath = "//label[@class='slds-form-element__label' and text()='Drive Type']/parent::lightning-combobox//descendant::button")
	public WebElement Drive_Type_FS_validation;
	@TextType()
	@FindBy(xpath = "//label[@class='slds-form-element__label' and text()='Drive Type']/parent::lightning-combobox//descendant::button")
	public WebElement Drive_Type_MobileSiteValueSet;
	@TextType()
	@FindBy(xpath = "//label[@class='slds-form-element__label' and text()='Drive Type']/parent::lightning-combobox//descendant::button")
	public WebElement Drive_Type_MS_Validation;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Mobile Type']/following-sibling::div//button")
	public WebElement Mobile_Type;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveBtnClick;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@name='Delete']")
	public WebElement DeleteClick;
	@TextType()
	@FindBy(xpath = "//slot[@name='outputField']/lightning-formatted-text[contains(text(),'RTD')]")
	public WebElement RTDName;
			
}
