package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CreateUnavailability2"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class CreateUnavailability2 {

	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@FindBy(xpath = "//select[@name='eventType']")
		public WebElement unavailabilityTypeClick;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='eventType']")
		public WebElement unavailabilityTypeValue;
		@TextType()
		@FindBy(xpath = "//textarea")
		public WebElement notesClick;
		@TextType()
		@FindBy(xpath = "//textarea")
		public WebElement notesProvided;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement nextClick;
	}

	@FindBy(xpath = "//iframe")
	public Frame frame;
			
}
