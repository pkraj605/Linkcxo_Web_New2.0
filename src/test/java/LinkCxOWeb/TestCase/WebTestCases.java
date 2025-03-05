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
import LinkCxOWeb.Pages.Homescreen;
import LinkCxOWeb.Pages.WebLoginWithMobileNumber;
import LinkCxOWeb.utils.ActionKeywords;
import LinkCxOWeb.utils.TestUtilsWeb;

public class WebTestCases extends TestBaseClassWeb {
	public static WebDriver driver;

	@Override
	public void TestBaseClassWeb() throws IOException {
//		 super();
//		 this.driver = driver;
		driver = TestBaseClassWeb.driver;
		
		
		
		
	}

	TestUtilsWeb testutilsWeb;
	ActionKeywords action1;
	WebLoginWithMobileNumber loginmethodweb;
	TestBaseClassWeb testclassweb;
	Homescreen screen;
	
	
	@BeforeTest
	public void setUp() throws IOException {
		System.out.println("Inside before");
		InitializeBrowser();
//		initializeBrowserEdge();
		testutilsWeb = new TestUtilsWeb(driver);
		action1 = new ActionKeywords();
		loginmethodweb = new WebLoginWithMobileNumber();
		screen = new Homescreen();
		
	}

	@Test(priority = 1)
	public void loginviaMobileNumber() throws IOException {

		testutilsWeb.extentReport();
//		testutilsWeb.CreateHtmlTable(0, 0, 0);
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
//			
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
//		loginmethodweb.ClickonPlusButton();	
		
	}
	
	
	@Test(priority = 2)
	public void CreatePost() throws IOException{
		
		testutilsWeb.testCaseCreate("Tc 02 : Create Post");
		
		try {
			
		screen.ClickonPlusButton();
		screen.ClickonCreatePostButton();
		screen.TextEnter();
		Thread.sleep(5000);
		
		try {
			if (screen.VerifyPostCreated()) {
				testutilsWeb.passTestCase("User is able to create post");
			}
		} catch (Exception e) {
			testutilsWeb.failTestCase("User is not able to create post");
		}	
			
			
		}catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able create post");
			// TODO: handle exception
		}
		
		
	}

	@AfterTest
	public void teardown() {
		testutilsWeb.ExtentFlush();
//			driver.quit();
		TestBaseClassWeb.driver.quit();
	}
}
