package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="HomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class HomePage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Drives on Calendar']")
	public WebElement drivesOnCalendarClick;
			
}
