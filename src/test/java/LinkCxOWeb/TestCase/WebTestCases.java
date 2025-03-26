package LinkCxOWeb.TestCase;

import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.Pages.Event;
import LinkCxOWeb.Pages.Homescreen;
import LinkCxOWeb.Pages.Job;
import LinkCxOWeb.Pages.WebLoginWithMobileNumber;
import LinkCxOWeb.utils.ActionKeywords;
import LinkCxOWeb.utils.TestUtilsWeb;

public class WebTestCases extends TestBaseClassWeb {
	public static WebDriver driver;

	@Override
	public void TestBaseClassWeb() throws IOException {
		// super();
		// this.driver = driver;
		driver = TestBaseClassWeb.driver;
	}

	TestUtilsWeb testutilsWeb;
	ActionKeywords action1;
	WebLoginWithMobileNumber loginmethodweb;
	TestBaseClassWeb testclassweb;
	Homescreen screen;
	Job jobScreen;
	Event eventScreen;
	

	@BeforeTest
	public void setUp() throws IOException {
		System.out.println("Inside before");
		InitializeBrowser();
		// initializeBrowserEdge();
		testutilsWeb = new TestUtilsWeb(driver);
		action1 = new ActionKeywords();
		loginmethodweb = new WebLoginWithMobileNumber();
		screen = new Homescreen();
		jobScreen = new Job();
		eventScreen = new Event();
	}

	@Test(priority = 1)
	public void loginviaMobileNumber() throws IOException {

		testutilsWeb.extentReport();
		// testutilsWeb.CreateHtmlTable(0, 0, 0);
		testutilsWeb.testCaseCreate("Tc 01 : Login With Mobile Number");
		try {
			loginmethodweb.ClickonLoginButton();
			testutilsWeb.test.log(Status.INFO, "click on login button");
			loginmethodweb.ClickonPhoneBtn();
			testutilsWeb.test.log(Status.INFO, "click on Phone button");
			loginmethodweb.EnterMobileNumber();
			loginmethodweb.ClickonContiniueButton();
			Thread.sleep(2000);

			loginmethodweb.EnterOTP();
			Thread.sleep(3000);
			try {
				if (loginmethodweb.verifyUserIsAbletoLogin()) {
					testutilsWeb.passTestCase("User is able to login succesfully");
				}
			} catch (Exception e) {
				testutilsWeb.failTestCase("User is not able to login");
			}
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to login");
		}
		// loginmethodweb.ClickonPlusButton();
		System.out.println("------nnnnnnn------");

	}

	@Test(priority = 2, enabled = false)
	public void CreatePost() throws IOException {

		testutilsWeb.testCaseCreate("Tc 02 : Create Post");

		try {

			screen.ClickonPlusButton();
			try {
				screen.ClickonCreatePostButton();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// screen.ClickoncreateArticleButton();
			screen.TextEnter();
			Thread.sleep(5000);

			try {
				if (screen.VerifyPostCreated()) {
					testutilsWeb.passTestCase("User is able to create post");
				}
			} catch (Exception e) {
				testutilsWeb.failTestCase("User is not able to create post");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able create post");
			// TODO: handle exception
		}

		//////////////////// End post/////////////////////

	}

	@Test(priority = 3, enabled = false)
	public void CreateArticle() throws IOException {

		testutilsWeb.testCaseCreate("Tc 03 : Create Article");

		try {
			screen.ClickoncreateArticleButton();
			Thread.sleep(3000);

			screen.UploadFile();
			Thread.sleep(3000);

			screen.EnterARticleTitle();
			Thread.sleep(3000);

			try {
				screen.EnterARticleDescription();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Thread.sleep(3000);
			try {
				if (screen.VerifyArticlePosted()) {
					testutilsWeb.passTestCase("User is able to create Article");
				}
			} catch (Exception e) {
				testutilsWeb.failTestCase("User is not able to create Article");
			}

		} catch (Exception e) {
			testutilsWeb.failTestCase("User is not able to create Article");
			e.printStackTrace();
			// TODO: handle exception

		}

	}

	@Test(priority = 4, enabled = false)
	public void CreatePoll() throws IOException {

		testutilsWeb.testCaseCreate("Tc 04 : Create Poll");

		try {
			screen.ClickOnCreatePollButton();
			Thread.sleep(3000);
			screen.EnterPollQuestion();
			screen.SElectCategory();
			screen.EnterOptionOne();
			screen.EnterOptionTwo();
			screen.ClickOnSubmit();
			Thread.sleep(3000);

		} catch (Exception e) {
			testutilsWeb.failTestCase("User is not able to create Poll");
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	@Test(priority = 5, enabled = false)
	public void CreateQuery() throws IOException {
		System.out.println("------------");
		testutilsWeb.testCaseCreate("Tc 05 : Create Query sucessfully");

		try {
			screen.ClickOnCreateQueryOption();
			screen.SElectCategory();
			screen.EnterQueryQuestion();
			Thread.sleep(3000);
			screen.EnterQueryDescription();
			Thread.sleep(3000);
			screen.ClickOnQueryPostBtn();
			Thread.sleep(3000);
			// screen.ClickOnSubmit();
			// Thread.sleep(3000);

		} catch (Exception e) {
			testutilsWeb.failTestCase("User is not able to create Query");
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	@Test(priority = 6, enabled = false)
	public void CreateJob() throws IOException {
		testutilsWeb.testCaseCreate("Tc 06 : Create job sucessfully");

		try {
			jobScreen.ClickonJobTab();
			jobScreen.jobCreate();
			jobScreen.EnterJobTitle();
			Thread.sleep(1000);
			jobScreen.EnterComName();
			Thread.sleep(1000);
			jobScreen.SelectIndustry();
			Thread.sleep(1000);
			jobScreen.EnterSkills();
			Thread.sleep(1000);
			jobScreen.EnterQualification();
			Thread.sleep(1000);
			jobScreen.ScrollTillPostJob();
			Thread.sleep(1000);
			jobScreen.SelectJobtype();
			Thread.sleep(1000);
			jobScreen.SelectWorkplaceType();
			Thread.sleep(1000);
			jobScreen.EnterLocation();
			Thread.sleep(2000);
			jobScreen.ClickOnCompRedio();
			Thread.sleep(2000);
			jobScreen.EnterJddetails();
			Thread.sleep(6000);
			jobScreen.ClickOnCreateBtn();
			Thread.sleep(8000);

		} catch (Exception e) {
			testutilsWeb.failTestCase("User is not able to create Job");
			e.printStackTrace();
			// TODO: handle exception
		}

	}
	
	@Test(priority = 7)
	public void CreatEvent() throws IOException {
		testutilsWeb.testCaseCreate("Tc 06 : Event Create sucessfully");
		
		try {
			eventScreen.ClickonHamburger();
			Thread.sleep(2000);
			eventScreen.ClickonEvent();
			Thread.sleep(2000);
			eventScreen.ClickonEventCreate();
			Thread.sleep(2000);
			eventScreen.UploadEventImage();
			Thread.sleep(2000);
			eventScreen.EnterEventTitle();
			Thread.sleep(2000);
		
			

		} catch (Exception e) {
			testutilsWeb.failTestCase("Event not created Sucessfully");
			e.printStackTrace();
		}
		
		eventScreen.ClickonEvent();
		
	}
	@AfterTest
	public void teardown() {
		testutilsWeb.ExtentFlush();
		TestBaseClassWeb.driver.quit();
	}
	
}
