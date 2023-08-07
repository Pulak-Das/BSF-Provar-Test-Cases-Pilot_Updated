package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AccountsDetailsPageTest"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDprofile"
     )             
public class AccountsDetailsPageTest {

	WebDriver driver;
	public AccountsDetailsPageTest(WebDriver driver) {
		this.driver = driver;
	}
	WebElement target = driver.findElement(By.xpath("//table/tbody/descendant::th[1]/descendant::a"));
	Actions actions = new Actions(driver);
	
	
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-component2[2]//a[normalize-space(.)='View All']")
	public WebElement viewAll;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[1]//a[normalize-space(.)='CIJEQFEJ, 7Eleven SB1']")
	public WebElement clickOnCreatedDriveName;
	@TextType()
	@FindBy(xpath = "(//a[text()='View All'])[2]")
	public WebElement viewAllOpportunityClick;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-component2[2]//a[normalize-space(.)='View All']")
	public WebElement viewAllOpportunityClick1;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Generate Drive']")
	public WebElement generateDriveButtonClick;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveTails__item']")
	public WebElement driveDetailsClick;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement Account_Status_Final;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Active']")
	public WebElement Account_Status_Active;
	
	public String finalAccountStatus(){
		WebElement ele = driver.findElement(By.xpath("//p[@class='slds-text-title slds-truncate' and text()='Account Status']/parent::div/descendant::lightning-formatted-text"));
		String status = ele.getText(); 
		return status;
	}				
}
