package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class Job extends TestBaseClassWeb{  //extend testclassweb

	public Job() { //create constructor same as class name
		
		super();
		PageFactory.initElements(driver, this);  ///add these 2 methods
		// TODO Auto-generated constructor stub
	}
	ActionKeywords action = new ActionKeywords();  //Action class
	
	@FindBy(xpath = "//div[.='Jobs']")
	private WebElement ClickJobModule;
	
	public void ClickonJobTab() {
		action.clickElement(ClickJobModule);
	}
	@FindBy(xpath = "//h1[normalize-space()='Create Jobs']")
	private WebElement ClickJobBtn;
	
	public void jobCreate() {
		action.clickElement(ClickJobBtn);
	}
	
	//  Add job Title ----------------
	
 	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	private WebElement JobTitle;
	public void EnterJobTitle() {
		action.sendKeysElement(JobTitle, "Automation Test Engineer");
	}
	
	// Add company---------------------
	
	@FindBy(xpath = "//input[@placeholder='Your Company Name']")
	private WebElement CompanyName;
	public void EnterComName() {
		action.sendKeysElement(CompanyName, "Alfatech private limited");
	}
	
	// Add industry------------------------
	
	@FindBy(xpath = "//label[text()='Industry *']/following::div[7]")
	private WebElement IndustryDrop;
	
	@FindBy(xpath = "//div[text()='Professional Services']")
	private WebElement IndustrySelect;
	public void SelectIndustry() throws InterruptedException, AWTException
	{
		action.clickElement(IndustryDrop);
		//rb.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		ActionKeywords.clickElement(IndustrySelect);
	}
	
	// add Skills --------------------------------------
	
	@FindBy(xpath = "//label[text()='Skills *']/following::div[7]")
	private WebElement SkillDrop;
	
	@FindBy(xpath = "//div[text()='JavaScript']")
	private WebElement SkillSelect;
	public void EnterSkills() throws InterruptedException, AWTException
	{
		action.clickElement(SkillDrop);
		ActionKeywords.clickElement(SkillSelect);
	}
	
	// Add qualification -----------------------------------
	
	@FindBy(xpath = "//label[text()='Qualification *']/following::div[7]")
	private WebElement QualificationDrop;
	
	@FindBy(xpath = "//div[text()='Chartered Accountancy  - CA']")
	private WebElement QualificationSelect;
	
	@FindBy(xpath = "(//label[normalize-space()='Currency *'])[1]")
	private WebElement currencyside;
	public void EnterQualification() throws InterruptedException, AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(2000);
				rb.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);		
				rb.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
	}
	
	//  Add Job Type ---------------------------------
	
	public void ScrollTillPostJob() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(LocationDrop).perform();
		Thread.sleep(1000);
	}
	
	
	@FindBy(xpath = "//select[@name=\"jobType\"]/option[@value=\"Full Time\"]")
	private WebElement JobType;
	public void SelectJobtype()
	{
		action.clickElement(JobType);
	}
	
	// Add work Place type -----------------------------
	
	@FindBy(xpath = "//select[@name=\"workplaceType\"]/option[@value=\"Remote\"]")
	private WebElement workplaceType;
	public void SelectWorkplaceType()
	{
		action.clickElement(workplaceType);
	}
	
	//  Add Location ----------------------------------
	
	@FindBy(xpath = "//label[text()='Location *']/following::div[7]")
	private WebElement LocationDrop;
	
	@FindBy(xpath = "//div[text()='Mumbai']")
	private WebElement LocationSelect;
	public void EnterLocation() throws InterruptedException, AWTException
	{
		action.clickElement(LocationDrop);
		action.clickElement(LocationSelect);
		
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//input[@value='COMPANY']")
	private WebElement ClickCompBtn;
	
	public void ClickOnCompRedio() {
		action.clickElement(ClickCompBtn);
	}
	@FindBy(xpath = "//textarea[@placeholder='Start typing here...']")
	private WebElement JdDetail;
	public void EnterJddetails() {
		action.sendKeysElement(JdDetail, "Automation Test Engineer jd update");
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
	private WebElement CreateBtn;
	
	public void ClickOnCreateBtn() {
		action.clickElement(CreateBtn);
	}
	
	

}
