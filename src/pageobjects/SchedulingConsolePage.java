package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SchedulingConsolePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class SchedulingConsolePage {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveCalendar__item']")
	public WebElement driveCalendar;
			
}
