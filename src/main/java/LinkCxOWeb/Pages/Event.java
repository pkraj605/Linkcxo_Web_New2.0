package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class Event extends TestBaseClassWeb{

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
		
		public void ClickonEvent()
		{
			action.clickElement(EventClk);
		}
		
		@FindBy(xpath = "//button[normalize-space()='Create Event']")
		private WebElement EventCreate;
		public void ClickonEventCreate()
		{
			action.clickElement(EventCreate);
		}
	
		@FindBy(xpath = "(//input[@placeholder='Enter Title'])[1]")
		private WebElement EventTitle;
		public void EnterEventTitle()
		{
			action.sendKeysElement(EventTitle, "Navi Mumbai Festival Events");
		}
		
		@FindBy(xpath = "//input[@type=\"file\"]")
		private WebElement fileUp;
		public void UploadEventImage() throws InterruptedException
		{
			action.sendKeysElement(fileUp, "D:\\images3.jpg");
			
		}
		
		@FindBy(xpath = "//label[normalize-space()='Industry *']")
		private WebElement IndustryDrop;
		
		@FindBy(xpath = "//div[text()='Mumbai']")
		private WebElement IndustrySelect;
		public void EnterLocation() throws InterruptedException, AWTException
		{
			action.clickElement(LocationDrop);
			action.clickElement(LocationSelect);
		
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(2000);
		}
		
}
