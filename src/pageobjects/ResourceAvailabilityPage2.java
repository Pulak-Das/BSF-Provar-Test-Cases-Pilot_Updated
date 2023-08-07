package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ResourceAvailabilityPage2"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ResourceAvailabilityPage2 {

	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']//span/lightning-primitive-icon")
	public WebElement clickOnMore;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Resource Availability Console']")
	public WebElement resourceAvailabilityConsoleClick;
	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Manage Territories']")
		public WebElement manageTerritoriesClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Division']/following-sibling::div//input")
		public WebElement divisionclick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Clear']")
		public WebElement clear;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDivision;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement done;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='ARC Region']/following-sibling::div//input")
		public WebElement aRCRegionClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDivisionARC;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='District']/following-sibling::div//input")
		public WebElement districtClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Clear']")
		public WebElement clearDistrict;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDistrict;
		@ButtonType()
		@FindBy(xpath = "//div[2]/button[2]")
		public WebElement TerritoriesPopupDoneClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/parent::div/parent::resource-availability-console/following-sibling::div//input")
		public WebElement quickSearch;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/parent::div/parent::resource-availability-console/following-sibling::div//input")
		public WebElement quickSearchCollectionOperationSet;
		@ButtonType()
		@FindBy(xpath = "//div[@class='slds-form-element__control']/div[contains(@class,'slds-button-group')]/button[contains(@class,'slds-button')][2]")
		public WebElement clickonCalender;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/following-sibling::ng-include//input")
		public WebElement quickSearchClick;
		@TextType()
		@FindBy(xpath = "//div[. = '26' and @class='slds-text-heading_medium ng-binding']/following::tr[1]//td[position() = count(//td[. = '26']/preceding-sibling::td)+1]")
		public WebElement dateHover;
		@ButtonType()
		@FindBy(xpath = "//td[5]/div[2]/div[1]/button")
		public WebElement dateClick;
		@ButtonType()
		@FindBy(xpath = "//td[4]/div[2]/div[1]/button")
		public WebElement dateClick1;
		@TextType()
		@FindBy(xpath = "//td/div[2]//td[5]")
		public WebElement dateHover13;
		@TextType()
		@FindBy(xpath = "//td[5]//strong[normalize-space(.)='All day']")
		public WebElement hoverAllday;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Create Unavailability']")
		public WebElement createUnavailabilityClick;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Create Unavailability']")
		public WebElement createUnavailabilityClick1;
		@LinkType()
		@FindBy(xpath = "//span[text()=' Create Unavailability ']/parent::a")
		public WebElement createUnavailabilityClick3;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Toledo OH']")
		public WebElement collectionNameClick;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Create Unavailability']")
		public WebElement createUnavailabilityClick4;
		@TextType()
		@FindBy(xpath = "//span[@class='slds-text-title_caps' and text()='Time Off Management']")
		public WebElement clickTimeOffManagement;
		@ButtonType()
		@FindBy(xpath = "//button[@class='slds-button slds-button_icon slds-button_icon-more slds-button_icon-brand']")
		public WebElement manageUnavailabilityRequestClick;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Create Individual']")
		public WebElement createIndividualClick;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='21']")
		public WebElement _date_21;
		@TextType()
		@FindBy(xpath = "//div[contains(@class,'slds-form-element')]/div[@class='slds-form-element__control']/div[@class='slds-select_container']/input[@name='territoryBiomedCollectionOps']")
		public WebElement quickSearchCollectionOperationSetValue;
		@TextType()
		@FindBy(xpath = "//span[normalize-space(.)='Toledo OH']")
		public WebElement collectionNameClickSet;
		@ButtonType()
		@FindBy(xpath = "//div[@ng-hide='$ctrl.isSingleSelection']/div/button[@ng-click='$ctrl.toggleSelectAll(false)']")
		public WebElement doneClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement doneClick1;
		@TextType()
		@FindBy(xpath = "//input[@class='slds-input slds-lookup__input slds-input_bare ng-pristine ng-valid ng-empty ng-touched']")
		public WebElement quickSearchCollectionOperationSet1;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAllDistrict1;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='requestType']")
		public WebElement requestType;
		@TextType()
		@FindBy(xpath = "//input[@name='availableSlots']")
		public WebElement availableSlotNumber;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Save']")
		public WebElement saveCreateStaffingBudget;
	}
	@FindBy(xpath = "//iframe")
	public Frame frame;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
			
}
