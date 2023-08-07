package pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BllodDriveOppotyunityPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDprofile"
     )             
public class BllodDriveOppotyunityPage {

	WebDriver driver;
	public BllodDriveOppotyunityPage(WebDriver driver) {
		this.driver = driver;
	}
	public void refreshPage(){
		driver.navigate().refresh();
	}
	
	public void clickYesOnLowProductivityOnDriveGenerate() throws InterruptedException {
		
		//driver.switchTo().
        WebElement lowProdDrive = driver.findElement(By.xpath("//li[contains(text(),'Low Productivity Drive')]"));
        WebElement YesbtnOnlowProdDrive = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        WebElement closebtnOnlowProdDrive = driver.findElement(By.xpath("//button[text()='Close' and @type='button']"));

        /*if (lowProdDrive.isDisplayed()) {
            YesbtnOnlowProdDrive.click();
            Thread.sleep(5000);

            closebtnOnlowProdDrive.click();
        } else {

            closebtnOnlowProdDrive.click();
        }*/
        YesbtnOnlowProdDrive.click();
	}
	
	public void validateLeadTimeDriver(int leadTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[1]//td[4]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(leadTime == actualValue){
				System.out.println("Lead Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public void validateSetUpTimeDriver(int setUpTime) throws Exception{
		//WebElement driverRow = driver.findElement(By.xpath("(//tbody//tr[1]//lightning-primitive-cell-factory[@data-label='Resource Role'])[1]/descendant::lightning-base-formatted-text"));
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[1]//td[6]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
			if(setUpTime == actualValue){
				System.out.println("Set up Time is not matching");
				}
			else{
				throw new IOException();
			} 			
	}
	public void validateBreakdownTimeDriver(int BreakdownTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[1]//td[7]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(BreakdownTime == actualValue){
				System.out.println("BreakDown Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public void validateWrapupTimeDriver(int WrapupTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[1]//td[8]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(WrapupTime == actualValue){
				System.out.println("Wrap Up Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public void validateLeadTimeDriverSupport(int leadTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[2]//td[4]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(leadTime == actualValue){
				System.out.println("Lead Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public void validateSetUpTimeDriverSupport(int setUpTime) throws Exception{
		//WebElement driverRow = driver.findElement(By.xpath("(//tbody//tr[1]//lightning-primitive-cell-factory[@data-label='Resource Role'])[1]/descendant::lightning-base-formatted-text"));
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[2]//td[6]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
			if(setUpTime == actualValue){
				System.out.println("Set Up Time is not matching");
				}
			else{
				throw new IOException();
			} 			
	}
	public void validateBreakdownTimeDriverSupport(int BreakdownTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[2]//td[7]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(BreakdownTime == actualValue){
				System.out.println("Breakdown Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public void validateWrapupTimeDriverSupport(int WrapupTime) throws IOException{
		WebElement ele = driver.findElement(By.xpath("//tbody//tr[2]//td[8]//descendant::lightning-formatted-number"));
		String text = ele.getText();
		int actualValue = Integer.parseInt(text);
		if(WrapupTime == actualValue){
				System.out.println("Wrapup Time is not matching");
			}
		else{
				throw new IOException();
			} 
			
	}
	public String actualTimeAfterApproval_DraftStatus(){
		WebElement ele = 
		   driver.findElement(By.xpath("//span[text()='Start Time']/parent::div/following-sibling::div/descendant::lightning-formatted-time"));
		String approvedTime = ele.getText();
		return approvedTime;
	}
	
	public String actualTimeAfterRjection_TentativeStatus(){
		WebElement ele = 
		   driver.findElement(By.xpath("//span[text()='Start Time']/parent::div/following-sibling::div/descendant::lightning-formatted-time"));
		String approvedTime = ele.getText();
		return approvedTime;
	}
	
	public void lowProductivepopup(){
		//WebElement ele = driver.findElement(By.xpath("//li[contains(text(),'Low Productivity Drive')]"));
		try{
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Yes']")).click();
			try{
				driver.findElement(By.xpath("//textarea[@name='notes']")).sendKeys("QA");
				driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Yes']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//footer[@class='slds-modal__footer']/lightning-button/button[@class='slds-button slds-button_neutral' and text() = 'Close']")).click();
			}
			catch (Exception e){
				driver.findElement(By.xpath("//footer[@class='slds-modal__footer']/lightning-button/button[@class='slds-button slds-button_neutral' and text() = 'Close']")).click();	
			}
		}
		catch(Exception e){
			driver.findElement(By.xpath("//footer[@class='slds-modal__footer']/lightning-button/button[@class='slds-button slds-button_neutral' and text() = 'Close']")).click();
		}
	}
	
	public String updatedAnticipatedRegisteredDonors(){
		WebElement ele = driver.findElement(By.xpath("//records-record-layout-item[@field-label='Anticipated Registered Donors']/descendant::lightning-formatted-number"));
		String valueAfterRejection = ele.getText();
		return valueAfterRejection;
	}
	
	public String updatedAnticipatedRegisteredDonorsApproval(){
		WebElement ele = driver.findElement(By.xpath("//records-record-layout-item[@field-label='Anticipated Registered Donors']/descendant::lightning-formatted-number"));
		String valueAfterApproval = ele.getText();
		return valueAfterApproval;
	}
		
	@ButtonType()
	@FindBy(xpath = "//li[contains(text(),'Low Productivity Drive')]")
	public WebElement lowProductiveYesBtnClick;
	
	@ButtonType()
	@FindBy(xpath = "//footer[@class='slds-modal__footer']/lightning-button/button[@class='slds-button slds-button_neutral' and text() = 'Close']")
	public WebElement closeDriveGeneratorPopUp1;
	

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Opportunity.sked_Generate_Drive']")
	public WebElement generateDriveButtonClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Drive was generated successfully.']")
	public WebElement DriverGenerateSuccessfullMessage;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']")
	public WebElement closeButtonClick;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='main']//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabsClick;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Drive Scheduling']")
	public WebElement driveScheduling;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Draft']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_draft;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Discovery']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Dicovery;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark Stage as Complete']")
	public WebElement PathAssistantStep_MarkStageNameAsComplete;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Solicitation']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Solicitation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Committed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Committed;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//select")
	public WebElement stagePopup;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement saveClickOnStagePopup;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Tentative']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Closed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Closed;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Change Closed Stage']")
	public WebElement PathAssistantStep_ChangeClosedStageName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Tentative']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_Tentative;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Confirmed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_Confirmed;
	@LinkType()
	@FindBy(xpath = "//span[text()='View All']")
	public WebElement GoToList;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Yes']")
	public WebElement yesClickonPopup;
	@TextType()
	@FindBy(xpath = "//th[@aria-label='Lead Time']/following::tr[1]/td[4]")
	public WebElement leadTimeValue;
	@TextType()
	@FindBy(xpath = "//th[@aria-label='Lead Time']/following::tr[1]/td[4]/lightning-primitive-cell-factory/span/div/lightning-formatted-number")
	public WebElement leadStartTimeDriver1;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']/lightning-icon/span/lightning-primitive-icon")
	public WebElement clickMoreOption;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Role Time Details']")
	public WebElement roleTimeDetailsClick;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Edit Drive Date']")
	public WebElement Drive_Date_Edit;
	@TextType()
	@FindBy(xpath = "//input[@name='Start_Time__c']")
	public WebElement Start_Time_SetValue;
	@TextType()
	@FindBy(xpath = "//input[@name='End_Time__c']")
	public WebElement End_Time_SetValue;
	@TextType()
	@FindBy(xpath = "//input[@name='Anticipated_Registered_Donors__c']")
	public WebElement Anticipated_Registered_Donors_SetValue;
	@TextType()
	@FindBy(xpath = "//input[@name='AnticipatedRegisterDonorChangeReason__c']")
	public WebElement AnticipatedRegisterDonorChangeReason_setValue;
	@ButtonType()
	@FindBy(xpath = "//button[@name='SaveEdit' and @class='slds-button slds-button_brand']")
	public WebElement SaveEditBtn;
	@LinkType()
	@FindBy(xpath = "//a[text()='Drive Change Request']")
	public WebElement driveChangeRequestClick;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Capture Drive Impacts']")
	public WebElement captureDriveImpactsBtnclick;
	@TextType()
	@FindBy(xpath = "//div[@class='slds-m-left--small']/descendant::span")
	public WebElement DriveGeneratorMessageValidation;
	@ButtonType()
	@FindBy(xpath = "//footer[@class='slds-modal__footer']/button[@class='slds-button slds-button_neutral' and text() = 'Close']")
	public WebElement closeDriveGeneratorPopUp;
	
	@LinkType()
	@FindBy(xpath = "//li[@class='slds-tabs_default__item' and @ title='Details']")
	public WebElement detailsTabClick;

	@LinkType()
	@FindBy(xpath = "//a[text()='Drive Contacts']")
	public WebElement driveContactsClick;

	@LinkType()
	@FindBy(xpath = "//div[text()='Add Drive Service Roles']")
	public WebElement addDriveServiceRoleClick;

	@BooleanType()
	@FindBy(xpath = "//td[@role='gridcell' and @class = 'slds-cell-edit cellContainer']/descendant::label[@class='slds-checkbox__label']/span[@class='slds-assistive-text']")
	public WebElement selectRowCheckbox;

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Select item 1']/div")
	public WebElement selectRowcheckbox1;

	@ButtonType()
	@FindBy(xpath = "//span[@class=' label bBody' and text()='Next']")
	public WebElement nextBtn;

	@ButtonType()
	@FindBy(xpath = "//span[@class=' label bBody' and text()='Save']")
	public WebElement clickOnSaveBtn;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Target Ask Date']")
	public WebElement TargetedAskDateUpdateClick;

	@TextType()
	@FindBy(xpath = "//input[@name='Targeted_Ask_Date__c']")
	public WebElement TargetedAskDateClick;

	@ButtonType()
	@FindBy(xpath = "//button[@title='Edit Close Date']")
	public WebElement editTargetCloseDate;

	@TextType()
	@FindBy(xpath = "//input[@name='CloseDate']")
	public WebElement CloseDateValue;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Approve DCR']")
	public WebElement approveDCR;
	
	@LinkType()
	@FindBy(xpath = "//a[@data-tab-value='detailTab' and text()='Details']")
	public WebElement detailsTabClick1;

	@TextType()
	@FindBy(xpath = "//div[@class='slds-p-around--small']/div/div[@class='Waiting for APS Approval']")
	public WebElement waitingForAPSapprovalTextValidation;

	@LinkType()
	@FindBy(xpath = "//span[text()='Drive Change Request']")
	public WebElement driveChangeRequestClick1;
			
}
