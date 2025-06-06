package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class Club extends TestBaseClassWeb{

	public Club() {
		super();
		PageFactory.initElements(driver, this);
	}
	ActionKeywords action = new ActionKeywords();
	@FindBy(xpath = "//div[@class=\"cursor-pointer hover:scale-110\"]")
	private WebElement ClickOnManu;

	public void ClickonHamburger1() {
		action.clickElement(ClickOnManu);
	}
	@FindBy(xpath = "//h2[normalize-space()='Clubs']")
	private WebElement ClubClk;

	public void ClickonClub() {
		action.clickElement(ClubClk);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Create Club']")
	private WebElement ClubCreate;

	public void ClickonClubCreateBtn() {
		action.clickElement(ClubCreate);
	}
	
	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement fileUp;

	public void UploadEventImage() throws InterruptedException {
		action.sendKeysElement(fileUp, "D:\\images3.jpg");
	}
	
	

}
