package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TomeOffAllowances2"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class TomeOffAllowances2 {

	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//time-off-allowances-modal/section/div/footer/div/button[2]")
		public WebElement nextClick;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='action--0']")
		public WebElement actionClick;
		@ChoiceListType()
		@FindBy(xpath = "//select[@name='action--0']")
		public WebElement actionClick1;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Save']")
		public WebElement nextClickonTimeOffAllowance;
	}

	@FindBy(xpath = "//iframe")
	public Frame frame;
	@TextType()
	@FindBy(xpath = "//span[text()='Account Status']/ancestor::div[2]/descendant::lightning-formatted-text[text()='Prospect']")
	public WebElement Account_Status_First;
			
}
