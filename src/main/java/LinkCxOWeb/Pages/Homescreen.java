package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class Homescreen extends TestBaseClassWeb {
	public Homescreen() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//div[@class=\"flex bg-golden w-10 h-10 items-center justify-center rounded-full\"]")
	private WebElement ClickPlusBtn;

	public void ClickonPlusButton() {
		action.clickElement(ClickPlusBtn);
	}

	@FindBy(xpath = "//h1[.='Create a Post']")
	private WebElement createPostBtn;

	public void ClickonCreatePostButton() {
		action.clickElement(createPostBtn);
	}

	@FindBy(xpath = "(//*[@name=\"description\"])[2]")
	private WebElement EnterText;

	public void TextEnter() throws InterruptedException {
		action.sendKeysElement(EnterText, "Test");
		Thread.sleep(1000);
		action.clickElement(PostBtn);
	}

	@FindBy(xpath = "//button[.='Post']")
	private WebElement PostBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]")
	private WebElement verifyPost;

	public boolean VerifyPostCreated() {
		return action.isDisplay(verifyPost);
	}

}
