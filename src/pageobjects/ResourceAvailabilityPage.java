package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ResourceAvailabilityPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ResourceAvailabilityPage {

	WebDriver driver;
	public ResourceAvailabilityPage (WebDriver driver) {
	this.driver = driver;
    }
    
    Actions action = new Actions(driver);
    
    
    
    public void clickonDatevalue() throws InterruptedException{
    	driver.switchTo().frame(0);
    	WebElement ele = driver.findElement(By.xpath("//div[2]//td[2]"));
    	action.moveToElement(ele).build().perform();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[contains(@class,'hco-rac-add-event-button')]/svg[@class='slds-button__icon']")).click();
    	//driver.findElement(By.xpath("//div[2]//td[2]"));
		//List<WebElement> allDates  = driver.findElements(By.xpath("//div[1]//td/div"));
		/*int colNum=3;
		
		for (int i=0; i<allDates.size();i++){
			if(allDates.get(i).getText()== date){
				colNum=colNum+i;
					}	
					break;
					
			}
		int newColNum = colNum-2;
		System.out.println(colNum);
		//String xpathUse="//div[2]//td['" + colNum + "'])";
		driver.findElement(By.xpath("//div[2]//td[" + newColNum + "])")).click(); */
		}
    

	@PageFrame()
	public static class Frame {
	
		//WebDriver driver;
		//	public Frame (WebDriver driver) {
		//		this.driver = driver;
	//		} 

		@TextType()
		@FindBy(xpath = "//span[@class='slds-tabs_default__link']/span[text()='Resources']")
		public WebElement ClickonResourcesTab;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Manage Territories']")
		public WebElement manageTerritories;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Division']/following-sibling::div//input")
		public WebElement divisionDropdownClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement selectAll;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement ClickOnDoneDivisionDropdown;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='ARC Region']/following-sibling::div//input")
		public WebElement clickOnaRCRegionDropdown;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement clickonArcRegionSelectAll;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement ClickOnDoneARCRegionDropdown;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='District']/following-sibling::div//input")
		public WebElement districtDropdownClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Clear']")
		public WebElement clearDitrictDropdown;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Select All']")
		public WebElement districtSelectAllClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement ClickOnDoneDistrictDropdown;
		@ButtonType()
		@FindBy(xpath = "//div[2]/button[2]")
		public WebElement territoriesManagerTickClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/parent::div/parent::resource-availability-console/following-sibling::div//input")
		public WebElement quickSearchClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Collection Operation']/parent::div/parent::bco-select/parent::div/parent::div/parent::div/parent::ng-include/parent::div/parent::resource-availability-console/following-sibling::div//input")
		public WebElement quickSearchValue;
		@ButtonType()
		@FindBy(xpath = "//div[contains(@class,'slds-button-group')]/button[contains(@class,'slds-p-horizontal_x-small')]")
		public WebElement startWeekSelection;
		@ButtonType()
		@FindBy(xpath = "//button[3]")
		public WebElement startWeekNextClick;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Filter']")
		public WebElement nameFilterClick;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Resource Type']/following-sibling::div//input")
		public WebElement resourceTypeValue;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Done']")
		public WebElement ClickOnDoneResourceTypeDropdown;
		@TextType()
		@FindBy(xpath = "//ng-include/div/div/div/div/input")
		public WebElement quickSearch;
		@ButtonType()
		@FindBy(xpath = "//td[9]/div[2]/div[1]/button")
		public WebElement dateToBeClick;
		@TextType()
		@FindBy(xpath = "//div[2]//td[9]")
		public WebElement dateboxClick;
		@TextType()
		@FindBy(xpath = "//span[@class='slds-tabs_default__link']/span[normalize-space()='Resources']")
		public WebElement ClickonResourcesTab1;
		
		
	}

	@FindBy(xpath = "//iframe")
	public Frame frame;
			
}
