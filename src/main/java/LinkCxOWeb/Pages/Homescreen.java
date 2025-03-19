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

	@FindBy(xpath = "//h1[text()='Create a Post']")
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
	
	
	//---------------Article Start-------------------------------------//
	
	
	@FindBy(xpath = "//h1[.='Compose an Article']")
	private WebElement createArticleButton;
	
	public void ClickoncreateArticleButton() throws InterruptedException {
		action.clickElement(ClickPlusBtn);
		Thread.sleep(1000);
	action.clickElement(createArticleButton);	
	}
	
	
	@FindBy(xpath = "//input[@placeholder=\"Title\"]")
	private WebElement articleTitle;
	public void EnterARticleTitle()
	{
		action.sendKeysElement(articleTitle, "Testing Article");
	}

	@FindBy(xpath = "//div[@data-placeholder=\"Share industry insights, case studies, and expert opinions on how AI is reshaping sectors like healthcare, finance, and marketing.Engage readers with thought-provoking discussions and encourage interaction on AI-related topics.\"]")
	private WebElement ArticleDescr;
	
	public void EnterARticleDescription() throws InterruptedException
	{
		action.sendKeysElement(ArticleDescr, "Testing Article Description");
		Thread.sleep(1000);
		ActionKeywords.clickElement(PostBtn);
	}
	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement fileUp;
	public void UploadFile() throws InterruptedException
	{
		action.sendKeysElement(fileUp, "D:\\images3.jpg");
		
	}
		
	@FindBy(xpath = "(//div[@class=\"w-full bg-golden text-white text-2xl font-semibold rounded-b-3xl py-2 px-7 tracking-wide truncate\"])[1]")
	private WebElement VerifyArticle;
	public boolean VerifyArticlePosted()
	{
		return action.isDisplay(VerifyArticle);
	}

	//////////-------------------Poll Start-------------------///////	
	
	
	@FindBy(xpath = "//h1[.='Create a Poll']")
	private WebElement createPollButton;
	
	public void ClickOnCreatePollButton() throws InterruptedException {
		
		action.clickElement(ClickPlusBtn);	
		Thread.sleep(3000);
		action.clickElement(createPollButton);
		Thread.sleep(3000);
		}
	@FindBy(xpath= "//textarea[@id='question']")
	private WebElement pollQuestion;
	public void EnterPollQuestion()
	{
		action.sendKeysElement(pollQuestion, "What is your favorite color");
	}
	
	@FindBy(xpath = "//label[contains(text(),'Categ')]/following::div[1]")
	private WebElement CategoryDrop;
	
	@FindBy(xpath = "//div[text()='Business Growth']")
	private WebElement CategorySelect;
	public void SElectCategory() throws InterruptedException
	{
		action.clickElement(CategoryDrop);
		Thread.sleep(1000);
		ActionKeywords.clickElement(CategorySelect);	
	}
	
	@FindBy(xpath= "//input[@placeholder='Option 1 *']")  
	private WebElement optionOne;
	public void EnterOptionOne()
	{
		action.sendKeysElement(optionOne, "Red");
	}
	
	@FindBy(xpath = "//input[@placeholder='Option 2 *']")
	private WebElement optionTwo;
	public void EnterOptionTwo() 
	{
		action.sendKeysElement(optionTwo, "black");
	}
	
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement FinalSubmit;
	public void ClickOnSubmit()
	{
		action.clearElement(FinalSubmit);
	}
	
	///////////------------------Query Start-----------------------///////////	
	
	
	@FindBy(xpath = "//h1[.='Post as a Query']")
	private WebElement createQueryButton;
	public void ClickOnCreateQueryOption() throws InterruptedException {
		
		action.clickElement(ClickPlusBtn);	
		Thread.sleep(3000);
		action.clickElement(createQueryButton);
		Thread.sleep(3000);
		}
	
	
	@FindBy(xpath= "//input[@id='question']")
	private WebElement QueryQuestion;
	public void EnterQueryQuestion()
	{
	action.sendKeysElement(QueryQuestion, "what is your Name");
	}
	
	@FindBy(xpath = "//textarea[@id ='discription']")
	private WebElement Querydescription;
	public void EnterQueryDescription()
	{
	  action.sendKeysElement(Querydescription, "Entering Query description");
	}
	
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	private WebElement SaveButton;
	public void ClickOnQueryPostBtn()
	{
	  action.clickElement(SaveButton);
	}
		

}
	
