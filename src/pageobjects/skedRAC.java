package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sked RAC"                                
               , summary=""
               , page="skedRAC"
               , namespacePrefix=""
               , object=""
               , connection="Admin"
     )     
     
             
public class skedRAC {

	WebDriver driver;
    public skedRAC (WebDriver driver) {
        this.driver = driver;
    }  

	@TextType()
	@FindBy(xpath = "//bco-select//input")
	public WebElement collectionOperation;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Clear']")
	public WebElement clear;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Columbus OH North']")
	public WebElement ColumbusOHNorth;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Done']")
	public WebElement done;
	
	public void clickCollectionName(String collectionName){
		driver.findElement(By.xpath("//span[normalize-space(.)='"+collectionName+"']")).click();
	}
}
