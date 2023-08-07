package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="checkAppLauncher"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class checkAppLauncher {

	WebDriver driver;
	public checkAppLauncher(WebDriver driver){
		this.driver=driver;
		}
		
	public void monthSelection(String year, String month) 
		{
		WebElement element = driver.findElement(By.xpath("//h2[contains(@id,'month')]"));
		String[] setDate = new String[5];
		setDate = element.getText().split(" ");
		int setYear = Integer.parseInt(setDate[1]);
		int year1 = Integer.parseInt(year.trim());	
//		for(int i=0;i<(year1-setYear);i++){
//				driver.findElement(By.xpath("//button[@title='Next Year']")).click();
//			}
			
		while (year1>setYear){
			driver.findElement(By.xpath("//button[@title='Next Year']")).click();
			break;
		}
		switch(month){
			case "Jan": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Jan']")).click();
			break;
			case "Feb": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Feb']")).click();
			break;
			case "Mar": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Mar']")).click();
			break;
			case "Apr": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Apr']")).click();
			break;
			case "May": driver.findElement(By.xpath("//span[@class='slds-day' and text()='May']")).click();
			break;
			case "Jun": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Jun']")).click();
			break;
			case "Jul": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Jul']")).click();
			break;
			case "Aug": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Aug']")).click();
			break;
			case "Sep": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Sep']")).click();
			break;
			case "Oct": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Oct']")).click();
			break;
			case "Nov": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Nov']")).click();
			break;
			case "Dec": driver.findElement(By.xpath("//span[@class='slds-day' and text()='Dec']")).click();
			break;
		   }			
		}
		
		public void clickonDate(int date){
			Actions action = new Actions(driver);
			List<WebElement> list = new ArrayList<WebElement>();
			list= driver.findElements(By.xpath("//div[@class='day-info']/lightning-formatted-date-time"));
			
			for(WebElement a: list){
			int setdate = Integer.parseInt(a.getText());
			if(setdate == date){
				action.moveToElement(a).click().build().perform();
				//driver.findElement(By.xpath(a+ "/parent::div")).click();
				}
			}
		}
		
		public void scrollBy(){
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
		}
		
//		public void driveNameValidationInDatePopup(String driveName){
//			String actualDriveName = driver.findElement(By.xpath("(//span[@class='indicator Understaffed']/parent::c-slwc-drive-name/a)[1]")).getText();
//			if(actualDriveName == driveName)
//				break;
//			}
		
		//not using
		public void clickonDate1(int date, int year, int month){
			driver.findElement(By.xpath("//div[@data-value='"+year+"-"+month+"-"+date+"']/lightning-formatted-date-time")).click();
		}
		
	public void quickSearch1(){
		WebElement element = driver.findElement(By.xpath("(//div[@part='input-text']/div[@part='input-container']/input[@class='slds-input'])[1]"));
		element.click();
		element.sendKeys("Central Atlantic");
	    }
	
	public void quickSearch2(){
		WebElement element = driver.findElement(By.xpath("(//div[@part='input-text']/div[@part='input-container']/input[@class='slds-input'])[1]"));
		element.click();
		element.sendKeys("Ohio South");
	    }
	    
	 public void quickSearch3(){
		WebElement element = driver.findElement(By.xpath("(//div[@part='input-text']/div[@part='input-container']/input[@class='slds-input'])[1]"));
		element.click();
		element.sendKeys("Columbus Franklin");
	    }
	    
	  public String assertDriveNameinTentativeTab(){
		  WebElement ele =
				  	driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid_align-spread']/div[@class='slds-hyphenate slds-line-clamp']//descendant::a)[1]"));
		  String driveName = ele.getText();
		  return driveName;
	  }
	  
	  public void doneBtnClick(){
		driver.findElement(By.xpath("//button[@class='slds-button' and text()='Done'])[1]")).click();	
	  }
	  public void clearCODoneClick(){
		  WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Done']"));
		  ele.click();
	  }
	  
	  public void resolveContentionsInConsole() throws InterruptedException {

		WebElement validatecontentions = driver.findElement(By.xpath("//button[contains(text(),'Validate')]"));
		//WebElement savecontentions = driver.findElement(By.xpath("//footer//button[text()='Save']"));

		List<WebElement> checkBoxList = driver
				.findElements(By.xpath("//span[@class='contention-indicator']/ancestor::tr/descendant::label"));
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
		}

		validatecontentions.click();
		Thread.sleep(5000);
		

	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncherClick;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View All']")
	public WebElement viewAll;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Scheduling Console']")
	public WebElement schedulingConsoleClick;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Manage Territories']")
	public WebElement manageTerritoriesClick;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::div//div[contains(@class,'slds-combobox__form-element')]/input")
	public WebElement divisionClick;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Drive Calendar']")
	public WebElement driveCalendarClick;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement doneClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Central Atlantic']")
	public WebElement set1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='ARC Region']/parent::div//div[contains(@class,'slds-combobox__form-element')]/input")
	public WebElement aRCRegionClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Ohio South']")
	public WebElement selectARCvalue;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='District']/parent::div//div[contains(@class,'slds-combobox__form-element')]/input")
	public WebElement districtClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Columbus Franklin']")
	public WebElement selectDistrictValue;
	@ButtonType()
	@FindBy(xpath = "//div[@class='slds-text-align_right']/button[contains(@class,'slds-button_icon-brand')]")
	public WebElement doneBtnTerritoriesManagerClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Columbus OH Franklin']")
	public WebElement finalCOselection;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Done']")
	public WebElement doneClick1;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Select a month']")
	public WebElement selectedMonth;
	@ButtonType()
	@FindBy(xpath = "//lightning-icon[@icon-name='utility:refresh']/parent::button")
	public WebElement refreshTerritoriesManager;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Clear']")
	public WebElement clearCO;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[normalize-space(.)='Tentative']")
	public WebElement TentativeTabClick;
	@LinkType()
	@FindBy(xpath = "//span[@class='indicator Understaffed']/parent::c-slwc-drive-name/a")
	public WebElement driveNameValidationinDatePopup;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Clear']")
	public WebElement clearDivision;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Central Atlantic']")
	public WebElement setDivisionValue;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='collectionOp']")
	public WebElement collectionOperationDDClick;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quick Search']/following-sibling::div//input")
	public WebElement quickSearch;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@LinkType()
	@FindBy(xpath = "//a[text()='Approval Console']")
	public WebElement approvalConsoleClick;
	@LinkType()
	@FindBy(xpath = "//a[text()='Pending Action Drives']")
	public WebElement pendingActionDrivesClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Central Atlantic']")
	public WebElement setDivisionValue1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Clear']/lightning-primitive-icon")
	public WebElement clearClickDivision;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Ohio North']")
	public WebElement arcRegionSelectionValue;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Toledo']")
	public WebElement districtSelectionValue;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Toledo OH']")
	public WebElement selectCOValue;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement doneClick2;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//c-slwc-new-collection-operation-multi-picklist//button[normalize-space(.)='Done']")
	public WebElement doneClickCO;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Ohio South']")
	public WebElement selectARCOhioSouth;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement doneClickARC;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Select a date range']")
	public WebElement dateClick;
	@TextType()
	@FindBy(xpath = "//input[@name='startDate']")
	public WebElement startDate;
	@TextType()
	@FindBy(xpath = "//input[@name='endDate']")
	public WebElement endDate;
	@TextType()
	@FindBy(xpath = "//label[text()='End Date']")
	public WebElement outsideElementclick;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='details']")
	public WebElement detailsClick;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement closeonPop_up;
	@LinkType()
	@FindBy(xpath = "//a[text()='Drive Change Requests']")
	public WebElement driveChangeRequestsClick;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Reject']")
	public WebElement rejectButtonClick;
	@TextType()
	@FindBy(xpath = "//textarea[@name='comments']")
	public WebElement commentsForRejection;
	@ButtonType()
	@FindBy(xpath = "//footer[@class='slds-modal__footer']/button[text()='Reject']")
	public WebElement rejectButtonClickOnPopUp;
	@ButtonType()
	@FindBy(xpath = "//footer[@class='slds-modal__footer']/button[text()='Close']")
	public WebElement closeonDriveChangeRequest;
	@TextType()
	@FindBy(xpath = "//span[@class='slds-page-header__title slds-truncate' and text()='Contentions']")
	public WebElement contentionsText;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveBtnClick;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//textarea[@name='comments']")
	public WebElement commentsForApproval;
	@ButtonType()
	@FindBy(xpath = "//button[@class='slds-button slds-button_brand' and text()='Approve']")
	public WebElement approveBtnClickInPopup;
			
}
