	package functions.live;
	
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
	
	public class G_InfoEvent extends B_baseClass {
	
		
	@FindBy(xpath="//span[text()=\"Calendar\"]")private WebElement calendarModule;
	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Informations/index\"]")private WebElement manageInformation;
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewButton ;
	    @FindBy(xpath="//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
		 @FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath="//select[@id=\"selectType\"]")private WebElement selectType;
	@FindBy(xpath="//div[@class=\"select-selected\"]")private WebElement eventCategoryList;
	@FindBy(xpath="//span[@style=\"background-color: #ff8c00\"]")private WebElement ADST06ECat1;
	@FindBy(xpath="//input[@id=\"startDate\"]")private WebElement startDate;
	@FindBy(xpath="//input[@id=\"endDate\"]")private WebElement endDate;
	@FindBy(xpath="//input[@id=\"fullDayType\"]")private WebElement eventFullDay;
	@FindBy(xpath="//span[@class=\"slider round\"]")private WebElement enabldSendPush;
	
	@FindBy(xpath="//input[@id=\"InformationTitleDe\"]")private WebElement titleField;
	@FindBy(xpath="//input[@id=\"InformationLocation\"]")private WebElement loacationField;
	@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
	
	
	@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAllCheckBox;
	@FindBy(xpath="//input[@id=\"user_id\" and @value=\"15429\"]")private WebElement ADST06A2;

	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveInfo ;
	
	
	@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
	@FindBy(xpath="//input[@value=\"3136\" and @class=\"user-checkbox\"]")private WebElement ADST06R2;
	
	@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter ;
	@FindBy(xpath="//input[@class=\"user-checkbox\" and @value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath="//input[@class=\"user-checkbox\" and @value=\"23006\"]")private WebElement BenMs;
	@FindBy(xpath="//input[@value=\"3138\" and @class=\"user-checkbox\" ]")private WebElement ADST06REsc;

	
	@FindBy(xpath="//input[@aria-controls=\"example1\"]")private WebElement searchField;
	@FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	@FindBy(xpath="(//a[text()=\"Chat\"])[1]")private WebElement infoChatButton;
	@FindBy(xpath="//input[@placeholder=\"Write your message...\"]")private WebElement writeMassageField;
	@FindBy(xpath="//button[@id=\"actionSendMessage\"]")private WebElement sendMassageButton ;
	
	
	
	
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
					
					
	public G_InfoEvent (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void createEventByAttribute ( WebDriver driver,String date ) throws Throwable
	{
		Actions act = new Actions (driver);
	
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	fireStationField.click();
	Thread.sleep(2000);
	act.sendKeys("06").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	Select se= new Select(selectType);
	se.selectByVisibleText("Event");
	eventCategoryList.click();
	Thread.sleep(3000);
	ADST06ECat1.click();
	Thread.sleep(3000);
	startDate.click();
	Thread.sleep(2000);
	
	
			
	endDate.click();
	Thread.sleep(2000);
	act.sendKeys("1").build().perform();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	eventFullDay.click();
	Thread.sleep(2000);
	enabldSendPush.click();
	Thread.sleep(2000);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	titleField.click();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by attribute.").build().perform();
	Thread.sleep(2000);
	loacationField.click();
	Thread.sleep(2000);
	act.sendKeys("Manewada graound, Nagpur").build().perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by attribute checking.").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		userTypeAttribute.click();
		Thread.sleep(2000);
		
		selectAllCheckBox.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
		ADST06A2.click();
		Thread.sleep(2000);
		saveInfo.click();
		Thread.sleep(2000);
		
		
		
		
		
	}
		
		
	public void createEventByResource ( WebDriver driver,String date ) throws Throwable
	{
		Actions act = new Actions (driver);
	
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	fireStationField.click();
	Thread.sleep(2000);
	act.sendKeys("06").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	Select se= new Select(selectType);
	se.selectByVisibleText("Event");
	eventCategoryList.click();
	Thread.sleep(3000);
	ADST06ECat1.click();
	Thread.sleep(3000);
	startDate.click();
	Thread.sleep(2000);
	
	
			
	endDate.click();
	Thread.sleep(2000);
	act.sendKeys("1").build().perform();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	eventFullDay.click();
	Thread.sleep(2000);
	enabldSendPush.click();
	Thread.sleep(2000);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	titleField.click();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by resource.").build().perform();
	Thread.sleep(2000);
	loacationField.click();
	Thread.sleep(2000);
	act.sendKeys("Manewada graound, Nagpur").build().perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by resource checking.").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		userTypeResource.click();
		Thread.sleep(2000);
		
		selectAllCheckBox.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
		ADST06R2.click();
		Thread.sleep(2000);
		saveInfo.click();
		Thread.sleep(2000);
		
		
		
		
		
	}
		
	
	
	public void createEventByFirefighter( WebDriver driver,String date ) throws Throwable
	{
		Actions act = new Actions (driver);
	
		createNewButton.click();
		Thread.sleep(2000);
		fireDepartmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	fireStationField.click();
	Thread.sleep(2000);
	act.sendKeys("06").build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	Select se= new Select(selectType);
	se.selectByVisibleText("Event");
	eventCategoryList.click();
	Thread.sleep(3000);
	ADST06ECat1.click();
	Thread.sleep(3000);
	startDate.click();
	Thread.sleep(2000);
	
	
			
	endDate.click();
	Thread.sleep(2000);
	act.sendKeys("1").build().perform();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	eventFullDay.click();
	Thread.sleep(2000);
	enabldSendPush.click();
	Thread.sleep(2000);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	titleField.click();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by firefighter.").build().perform();
	Thread.sleep(2000);
	loacationField.click();
	Thread.sleep(2000);
	act.sendKeys("Manewada graound, Nagpur").build().perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(2000);
	act.sendKeys("BG-info event created by firefighter checking.").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		userTypeFireFighter.click();
		Thread.sleep(2000);
		
		selectAllCheckBox.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		Thread.sleep(2000);
		jonas2.click();
		Thread.sleep(2000);
		BenMs.click();
		Thread.sleep(3000);
		
		saveInfo.click();
		Thread.sleep(2000);
		
		
		
		
		
	}
		
	
	
	public void sendMassageToInfoEventUsers ( WebDriver driver ) throws Throwable
	{
		Actions act = new Actions (driver);
		
		
		searchField.click();
		Thread.sleep(2000);
		act.sendKeys("BG-info event").build().perform();
		Thread.sleep(2000);
		searchButton.click();
		Thread.sleep(2000);
		
		infoChatButton.click();
		Thread.sleep(2000);
		writeMassageField.click();
		Thread.sleep(2000);
		act.sendKeys("Massage-info event users").build().perform();
		Thread.sleep(2000);
		sendMassageButton.click();
		Thread.sleep(2000);
		
		
	
	}
	
	}