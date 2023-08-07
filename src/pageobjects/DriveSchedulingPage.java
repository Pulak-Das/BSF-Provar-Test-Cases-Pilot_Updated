package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveSchedulingPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class DriveSchedulingPage {

	WebDriver driver;
	public DriveSchedulingPage(WebDriver driver){
		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitBtnClick;
	
	public void resolveContentions() throws InterruptedException {

		/*
		 * WebElement resolveContentionsbtn = driver
		 * .findElement(By.xpath("//button[contains(text(),'Resolve contentions')]"));
		 */
		WebElement validatecontentions = driver.findElement(By.xpath("//button[contains(text(),'Validate')]"));
		WebElement savecontentions = driver.findElement(By.xpath("//footer//button[text()='Save']"));

		List<WebElement> checkBoxList = driver
				.findElements(By.xpath("//span[@class='contention-indicator']/ancestor::tr/descendant::label"));
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
		}

		validatecontentions.click();
		Thread.sleep(10000);
		savecontentions.click();
		Thread.sleep(3000);

	}
	public void driveConfirmationTextbox() throws InterruptedException {
		try{
		WebElement ele = driver.findElement(By.xpath("//textarea[@name='submissionNotes']"));
		ele.sendKeys("Approved");
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		}
		catch(Exception e){
			Thread.sleep(5000);
		}
	}
	
	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Resolve contentions')]")
	public WebElement resolvecont;
	
	@TextType()
	@FindBy(xpath = "//h2[contains(text(),'Resolve Contentions')]")
	public WebElement resolevContentionsText;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='main']//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabsClick;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Drive Scheduling']")
	public WebElement driveSchedulingTabClick;

	@ButtonType()
	@FindBy(xpath = "//button[text()='Approve DCR']")
	public WebElement approveDCR;
	
			
}
