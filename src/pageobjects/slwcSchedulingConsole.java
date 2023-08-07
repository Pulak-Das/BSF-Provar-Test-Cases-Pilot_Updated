package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Slwc Scheduling Console"                                
               , summary=""
               , connection="Admin"
               , auraComponent="slwcSchedulingConsole"
               , namespacePrefix=""
     )             
public class slwcSchedulingConsole {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='collectionOp']")
	public WebElement collectionOperationValueSet;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='ARC Region']/following-sibling::c-slwc-click-outside//input")
	public WebElement aRCRegion;
	
}
