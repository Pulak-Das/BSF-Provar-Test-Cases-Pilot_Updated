package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.*;

@Page(title = "PlanADrivePageOnAccount", summary = "", relativeUrl = "", connection = "DRDProfile")
public class PlanADrivePageOnAccount {
	WebDriver driver;
     

	public PlanADrivePageOnAccount(WebDriver driver) {

		this.driver = driver;
	}


	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Account.Plan_a_Mobile_Drive']")
	public WebElement Account_Plan_a_Mobile_Drive;

	@FindBy(xpath = "//input[@name='Select_AccountSite']/ancestor::div[1]/descendant::label")
	@TextType()
	public WebElement selectSite;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Matching_Templates']")
	public WebElement MatchingTemplates;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next1;

	@TextType()
	@FindBy(xpath = "//input[@name='Drive_Date']")
	public WebElement driveDate;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowStartTimePicklist']")
	public WebElement StartTime;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowEndTimePicklist']")
	public WebElement EndTime;

	@TextType()
	@FindBy(xpath = "//input[@name='Whole_Blood_Procedures1']")
	public WebElement wholeBloodProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Double_Red_Procedures']")
	public WebElement doubleRedProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Anticipated_Registered_Donors']")
	public WebElement anticipatedRegisteredDonors;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Open_To_Public_Updated']")
	public WebElement OpenToPublic;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='OnlineSchedulingEnabled2']")
	public WebElement OnlineSchedulingEnabled;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p[normalize-space(.)='Inside']")
	public WebElement DriveType;

	@TextType()
	@FindBy(xpath = "//input[@name='Drive_Keyword']")
	public WebElement driveKeyword;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next2;

	@TextType()
	@FindBy(xpath = "//input[@name='Targeted_Ask_Date_Only']")
	public WebElement targetAskDate;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next3;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next4;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p/span[normalize-space(.)='The Opportunity record was successfully created.']")
	public WebElement CheckPlanDriveCreated_;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Finish']")
	public WebElement finish;



	public void selectTemplate(){
	
	Select matchTemplate = new Select(driver.findElement(By.xpath("//select[@name='Matching_Templates']")));
		matchTemplate.selectByValue("TemplateChoiceSet.1");
	
	}
	
	}
