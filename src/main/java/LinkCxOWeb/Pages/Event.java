package LinkCxOWeb.Pages;

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
		@FindBy(xpath = "//h2[normalize-space()='Events']")
		private WebElement EventCreate;
		public void ClickonEventCreate()
		{
			action.clickElement(EventCreate);
		}
		
}
