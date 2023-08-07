package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveShiftConfig"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class DriveShiftConfig {

	@TextType()
	@FindBy(xpath = "//input[@name='startTime']")
	public WebElement startTimeOnCofig;
	@TextType()
	@FindBy(xpath = "//input[@name='endTime']")
	public WebElement endTimeOnConfig;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='update']")
	public WebElement saveClick;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Drive Shift 1']")
	public WebElement driveShift1;
			
}
