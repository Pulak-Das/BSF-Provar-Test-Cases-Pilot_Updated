package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="EditAccountPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class EditAccountPage {

	WebDriver driver;
	public EditAccountPage(WebDriver driver){
		this.driver = driver;
	}
	public void refreshPage(){
		driver.navigate().refresh();
	}

	@ButtonType()
	@FindBy(xpath = "//button[@title='Edit Accepts Automation']")
	public WebElement EditAcceptAutomation;
	@TextType()
	@FindByLabel(label = "Accepts Automation")
	public WebElement Accepts_Automation2__c;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='SaveEdit']")
	public WebElement SaveEdit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Yes']")
	public WebElement Accepts_Automation2__c1;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Prospect']")
	public WebElement Account_Status_First;
	@ButtonType()
	@FindBy(xpath = "//button[@title='Edit Account Status']")
	public WebElement click_Account_Status;
	@TextType()
	@FindByLabel(label = "Account Status")
	public WebElement accountStatusValue_Set;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Active']")
	public WebElement Account_Status_Active;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Inactive']")
	public WebElement Account_Status_Inactive;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Active']")
	public WebElement Account_Status_Active1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Blood Drives']")
	public WebElement bloodDrives;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Details']")
	public WebElement detailsClick;
			
}
