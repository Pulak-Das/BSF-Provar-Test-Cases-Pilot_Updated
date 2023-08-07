package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyTCPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyTCPageObject {

	WebDriver driver;
    public MyTCPageObject (WebDriver driver) {
        this.driver = driver;
    }    

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Create Fixed Site Account']")
	public WebElement Create_Fixed_Site_Account;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//input[@name='Account_Name']")
		public WebElement accountName;
		@TextType()
		@FindBy(xpath = "//input[@name='Internal_Name']")
		public WebElement internalName;
		@TextType()
		@FindBy(xpath = "//input[@name='National_Name']")
		public WebElement nationalName;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Business Phone Number']/following-sibling::div//input")
		public WebElement businessPhoneNumber;
		@TextType()
		@FindBy(xpath = "//input[@name='country']")
		public WebElement country;
		@TextType()
		@FindBy(xpath = "//textarea[@name='street']")
		public WebElement street;
		@TextType()
		@FindBy(xpath = "//input[@name='city']")
		public WebElement city;
		@TextType()
		@FindBy(xpath = "//input[@name='province']")
		public WebElement stateProvince;
		@TextType()
		@FindBy(xpath = "//input[@name='postalCode']")
		public WebElement zipPostalCode;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement next;
		@TextType()
		@FindBy(xpath = "//b[normalize-space(.)='Record Created Successfully']")
		public WebElement RecordCreationMessage;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Finish']")
		public WebElement finish;
	}
	@FindBy(xpath = "//iframe")
	public Frame frame;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a List View: Accounts']")
	public WebElement searchType;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='SelectedAll Fixed Sites']")
	public WebElement selectedAllFixedSites;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='SelectedAll Fixed Sites']")
	public WebElement selectedAllFixedSites1;
	@TextType()
	@FindBy(xpath = "//button[@aria-label='Search']")
	public WebElement searchBox;
	
	public void clickAccountName(String AccountName) {
        WebElement accountname = driver.findElement(By.xpath("//span[@title='" + AccountName + "']"));
        accountname.click();
    }

	@TextType()
	@FindBy(xpath = "//input[@name='Account-search-input']")
	public WebElement listSearch;
	@LinkType()
	@FindBy(xpath = "(//a[@data-refid='recordId'])[1]")
	public WebElement AccName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Active']")
	public WebElement Account_Status__c;
			
}
