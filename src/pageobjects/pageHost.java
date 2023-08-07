package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Page Host"                                
               , summary=""
               , connection="Admin"
               , auraComponent="pageHost"
               , namespacePrefix=""
     )             
public class pageHost {

	@LinkType()
	@FindBy(xpath = "//span[@class='indicator Understaffed']/parent::c-slwc-drive-name/a")
	public WebElement driveValueinDatePopup;
	
}
