package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class WebLoginWithMobileNumber extends TestBaseClassWeb {

	public WebLoginWithMobileNumber() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement LoginBtn;

	public void ClickonLoginButton() {
		action.clickElement(LoginBtn);
	}

	@FindBy(xpath = "//button[@class=\"w-fit cursor-pointer rounded-full\"]")
	private WebElement PhoneClik;

	public void ClickonPhoneBtn() {
		action.clickElement(PhoneClik);
	}

	@FindBy(id = "phoneNo")
	private WebElement EnterPHoneNumber;

	public void EnterMobileNumber() {
		action.sendKeysElement(EnterPHoneNumber, "6206098368");
	}

	@FindBy(xpath = "//button[text()=\"Continue\"]")
	private WebElement ContinueBtn;

	public void ClickonContiniueButton() {
		action.clickElement(ContinueBtn);
	}

	@FindBy(xpath = "//input[@name='otp-input-0']")
	private WebElement Enterotp1;

	@FindBy(xpath = "//input[@name='otp-input-1']")
	private WebElement Enterotp2;

	@FindBy(xpath = "//input[@name='otp-input-2']")
	private WebElement Enterotp3;

	@FindBy(xpath = "//input[@name='otp-input-3']")
	private WebElement Enterotp4;

	@FindBy(xpath = "//input[@name='otp-input-4']")
	private WebElement Enterotp5;

	@FindBy(xpath = "//input[@name='otp-input-5']")
	private WebElement Enterotp6;

	public void EnterOTP() throws InterruptedException {
		action.sendKeysElement(Enterotp1, "4");
		Thread.sleep(1000);
		action.sendKeysElement(Enterotp2, "4");
		Thread.sleep(1000);
		action.sendKeysElement(Enterotp3, "4");
		Thread.sleep(1000);
		action.sendKeysElement(Enterotp4, "4");
		Thread.sleep(1000);
		action.sendKeysElement(Enterotp5, "4");
		Thread.sleep(1000);
		action.sendKeysElement(Enterotp6, "4");
		Thread.sleep(1000);	
	
	}

	@FindBy(xpath = "(//h1[@class=\"text-white text-lg leading-6 font-semibold cursor-pointer\"])")
	private WebElement verifylogin;

	public boolean verifyUserIsAbletoLogin() {
		return action.isDisplay(verifylogin);
	}
}
