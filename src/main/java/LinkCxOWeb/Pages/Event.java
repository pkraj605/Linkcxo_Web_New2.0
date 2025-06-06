package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class Event extends TestBaseClassWeb {

	public Event() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//div[@class=\"cursor-pointer hover:scale-110\"]")
	private WebElement ClickOnManu;

	public void ClickonHamburger() {
		action.clickElement(ClickOnManu);
	}

	@FindBy(xpath = "//h2[normalize-space()='Events']")
	private WebElement EventClk;

	public void ClickonEvent() {
		action.clickElement(EventClk);
	}

	@FindBy(xpath = "//button[normalize-space()='Create Event']")
	private WebElement EventCreate;

	public void ClickonEventCreate() {
		action.clickElement(EventCreate);
	}

	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement fileUp;

	public void UploadEventImage() throws InterruptedException {
		action.sendKeysElement(fileUp, "D:\\images3.jpg");
	}

	@FindBy(xpath = "(//input[@placeholder='Enter Title'])[1]")
	private WebElement EventTitle;

	public void EnterEventTitle() {
		action.sendKeysElement(EventTitle, "Navi Mumbai Festival Events");
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter Here']")
	private WebElement EventDetails;

	public void EnterEventDetails() {
		action.sendKeysElement(EventDetails, "Text data of event details");
	}

	@FindBy(xpath = "(//button[normalize-space()='Next'])[1]")
	private WebElement NextbtnClick;

	public void EnterNextBtn() {
		action.clickElement(NextbtnClick);
	}

	@FindBy(xpath = "//label[text()='Host *']/following::div[1]")
	private WebElement HostDrop;

	@FindBy(xpath = "//option[@value='Individual']")
	private WebElement HostSelect;

	public void EnterHostType() throws InterruptedException, AWTException {
		action.clickElement(HostDrop);
		action.clickElement(HostSelect);
	}

	@FindBy(xpath = "//input[@value='false']")
	private WebElement SelectEventType;

	public void ClickTypeBtn() {
		action.clickElement(SelectEventType);
	}

	@FindBy(xpath = "//input[@placeholder='Event Url']")
	private WebElement EventLink;

	public void EnteringEventLink() {
		action.sendKeysElement(EventLink, "www.linkedin.com");
	}

	// start date
	@FindBy(xpath = "(//input[@placeholder=\"Select Date\"])[1]")
	private WebElement SelectStartDate;

	@FindBy(xpath = "//div[.='28']")
	private WebElement selectDate;

	public void SelectStartDate() throws InterruptedException, AWTException {
		action.clickElement(SelectStartDate);
		Thread.sleep(1000);
		action.clickElement(selectDate);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_UP);
		rb.keyPress(KeyEvent.VK_UP);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_UP);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_DOWN);

	}

	// End Date

	@FindBy(xpath = "(//input[@placeholder=\"Select Date\"])[2]")
	private WebElement SelectEndDate;

	public void SelectEndDate() throws InterruptedException, AWTException {
		action.clickElement(SelectEndDate);
		Thread.sleep(1000);
		action.clickElement(selectDate);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_UP);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_TAB);
	}


	@FindBy(xpath = "//input[@placeholder='support@gmail.com']")
	private WebElement HostEmail;

	public void EnteringHostEmail() {
		action.sendKeysElement(HostEmail, "kprabhat956@gmail.com");
	}
	
	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement NextBtn;

	public void ClickOnNextBtn() {
		action.clickElement(NextBtn);
	
	}
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement CreateBtn1;

	public void ClickOnCreateBtn1() {
		action.clickElement(CreateBtn1);
		
		//public void ClickOnCreateBtn1() {
			//action.clickElement(CreateBtn1);
	
	
	}
	
	
}
