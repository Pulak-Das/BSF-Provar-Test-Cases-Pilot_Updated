package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Biomed Recruitment']")
	public WebElement recordTypeName;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Lead Status']/following-sibling::div//button")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Lead Source']/following-sibling::div//button")
	public WebElement LeadSource;
	@TextType()
	@FindBy(xpath = "//button[@name='salutation']")
	public WebElement Salutation;
			
}
