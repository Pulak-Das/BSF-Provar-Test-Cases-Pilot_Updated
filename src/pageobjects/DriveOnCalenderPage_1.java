package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "DriveOnCalenderPage", summary = "", relativeUrl = "", connection = "DRDprofile")
public class DriveOnCalenderPage_1 {

	WebDriver driver;

	public DriveOnCalenderPage_1(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//table//tbody//th//a']")
	public WebElement DriveNameOnDoc;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitBtn;


	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Resolve contentions')]")
	public WebElement resolvecont;

	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'Drive History')]")
	public WebElement DriveHistory;

	@TextType()
	@FindBy(xpath = "//lst-formatted-text[contains(text(),'Status')]/ancestor::tr/descendant::lightning-formatted-text[contains(text(),'Tentative')]")
	public WebElement Drivestatus;

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

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='Do you want to continue resolve the contentions?']")
	public WebElement doyouwanttoContinueResolveCont_;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Contentions']")
	public WebElement Contentions;

	@TextType()
	@FindBy(xpath = "//h2[contains(text(),'Resolve Contentions')]")
	public WebElement resolevContentionsText;

}
