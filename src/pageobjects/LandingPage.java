package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LandingPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class LandingPage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']")
	public WebElement moreShowMoreNavigationItems;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Resource Availability Console']")
	public WebElement resourceAvailabilityConsoleClick;
	@ButtonType()
	@FindBy(xpath = "//one-app-launcher-header[@id='window']/button")
	public WebElement appLauncherClick;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View All']")
	public WebElement viewAll;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']//span/lightning-primitive-icon")
	public WebElement clickMoreOption;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Role Time Details']")
	public WebElement roleTimeDetailsClick;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sites']")
	public WebElement sitesObjectClick;
			
}
