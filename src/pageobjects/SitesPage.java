package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SitesPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class SitesPage {

	WebDriver driver;
	public SitesPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void allMobileSitesLinkClick(){
		WebElement ele = driver.findElement(By.xpath("(//span[@class=' virtualAutocompleteOptionText' and text() = 'All Mobile Sites'])[1]"));
		ele.click();
	}
	public void clickonViewAllAccounts(){
		WebElement ele = driver.findElement(By.xpath("//span[text()='Related Accounts' and @class='assistiveText']/parent::span/parent::a"));
		ele.click();		
	}
	public void selectTheAccountName(){
		WebElement ele = driver.findElement(By.xpath("(//lightning-formatted-rich-text[@class='primary slds-truncate slds-rich-text-editor__output'])[1]"));
		ele.click();
	}
	
	
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a List View: Sites']")
	public WebElement searchType;
	@TextType()
	@FindBy(xpath = "//input[@aria-label='Search All Mobile Sites list view.']")
	public WebElement localListSearch;
	@ButtonType()
	@FindBy(xpath = "//button[@name='refreshButton']")
	public WebElement refreshClick;
	@LinkType()
	@FindBy(xpath = "//a[@title='7Eleven SB1 - Auditorium RM1']")
	public WebElement SiteNameClick;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='refreshButton']")
	public WebElement refreshClick1;
	public void enterOnSearchField() throws InterruptedException{
		WebElement ele = driver.findElement(By.xpath("//input[@aria-label='Search All Mobile Sites list view.']"));
		ele.sendKeys("7Eleven SB1 - Auditorium RM1");
		Thread.sleep(5000);
		ele.sendKeys(Keys.ENTER);
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllRelated Accounts']")
	public WebElement GoToListViewAllClick;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Search...']")
	public WebElement searchBoxGlobal;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search Sites and more']/following-sibling::div//input")
	public WebElement searchBox;
			
}
