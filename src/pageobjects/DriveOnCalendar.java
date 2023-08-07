package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveOnCalendar"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDprofile"
     )             
public class DriveOnCalendar {

	WebDriver driver;
	public DriveOnCalendar(){
		this.driver = driver;
	}
	
	public void clickYesOnLowProductivityOnDriveGenerate() throws InterruptedException {

        WebElement lowProdDrive = driver.findElement(By.xpath("//li[contains(text(),'Low Productivity Drive')]"));
        WebElement YesbtnOnlowProdDrive = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        WebElement closebtnOnlowProdDrive = driver.findElement(By.xpath("//button[text()='Close' and @type='button']"));

        if (lowProdDrive.isDisplayed()) {
            YesbtnOnlowProdDrive.click();
            Thread.sleep(5000);

            closebtnOnlowProdDrive.click();
        } else {

            closebtnOnlowProdDrive.click();
        }
	}
	
	public String driveNameToValidate(String company, String location){
		String driveName = company+ ","+ " " +location;
		return driveName;
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveTails__item']")
	public WebElement driveDetailsClick;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveShifts__item']")
	public WebElement driveShiftsClick;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Configuration']")
	public WebElement configurationClick;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Number of 2RBC Assets']/parent::div/parent::lightning-input/parent::div/parent::div/parent::div/following-sibling::h3//lightning-primitive-icon")
	public WebElement clickOnConfiguration;
	@LinkType()
	@FindBy(xpath = "//table//tbody//th//a")
	public WebElement clickonFirstDriveRecord1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='primaryField']/lightning-formatted-text")
	public WebElement titleDriveName;
			
}
