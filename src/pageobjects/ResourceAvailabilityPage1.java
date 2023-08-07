package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ResourceAvailabilityPage1"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ResourceAvailabilityPage1 {


	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//span[@class='slds-tabs_default__link']/span[normalize-space()='Resources']")
		public WebElement ClickonResourcesTab;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Manage Territories']")
		public WebElement manageTerritoriesClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Division']/following-sibling::div//input")
		public WebElement divisionDropdownClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Clear']")
		public WebElement clearAll;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::div/parent::div/parent::div/parent::div/parent::section/parent::bco-territories-manager/parent::div/parent::div/following-sibling::div//input")
		public WebElement filter;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDivision;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement done;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='ARC Region']/following-sibling::div//input")
		public WebElement aRCRegionDDClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllArcRegion;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='District']/following-sibling::div//input")
		public WebElement districtDDClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDistrict;
		@ButtonType()
		@FindBy(xpath = "//div[2]/button[2]")
		public WebElement doneTerritoriesManager;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/parent::div/parent::resource-availability-console/following-sibling::div//input")
		public WebElement quickSearchClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement doneClick;
		@ButtonType()
		@FindBy(xpath = "//div[@class='slds-form-element__control']/div[contains(@class,'slds-button-group')]/button[contains(@class,'slds-button')][2]")
		public WebElement clickStartWeek;
		@ButtonType()
		@FindBy(xpath = "//div[@class='slds-form-element__control']/div[contains(@class,'slds-button-group')]/button[contains(@class,'slds-button')][3]")
		public WebElement clickNextOnStartWeek;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/following-sibling::ng-include//input")
		public WebElement quickSearchClick1;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/following-sibling::ng-include//input")
		public WebElement quickSearchClick11;
		@PageWaitAfter.Field(timeoutSeconds = 10)
		@TextType()
		@FindBy(xpath = "//td//div[2]//td[1]")
		public WebElement hoverOnDate;
		@PageWait.Field(field = "hoverOnDate", timeoutSeconds = 5)
		@PageWaitAfter.Field(timeoutSeconds = 10)
		@ButtonType()
		@FindBy(xpath = "//td[1]//div[2]//div[1]//button")
		public WebElement clickPlusSign;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Create Unavailability']")
		public WebElement createUnavailabilityClick;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='eventType']")
		public WebElement unavailabilityType;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Notes']/following-sibling::div//textarea")
		public WebElement PTONotes;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement nextOnCreateUnavailabilty;
		@ButtonType()
		@FindBy(xpath = "//button[contains(@class ,'slds-button')]/span[text() = 'Next']")
		public WebElement nextOnTimeOffAllowance;
		@ButtonType()
		@FindBy(xpath = "//div[3]//div[3]/button[normalize-space(.)='Apply']")
		public WebElement applyButtonClick;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='action--0']")
		public WebElement actionValueSelect;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Save']")
		public WebElement saveTimeOffAllowance;
		@TextType()
		@FindBy(xpath = "//td[6]/div[1]/div[1]/div/div/div[1]/div")
		public WebElement PTOValidation;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Existing Unavailability']")
		public WebElement existingUnavailability;	
		}
	
	@FindBy(xpath = "//iframe")
	public Frame frame;
			
}
