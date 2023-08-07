package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BloodDriveTabPageOnAccount"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class BloodDriveTabPageOnAccount {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab__item']")
	public WebElement bloodDrives;
	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'7Eleven SB1 - Auditorium RM1')]")
	public WebElement templates1;
	@LinkType()
	@FindBy(xpath = "//a[contains(text(),', 7Eleven SB1')]")
	public WebElement futureOpp;		
}
