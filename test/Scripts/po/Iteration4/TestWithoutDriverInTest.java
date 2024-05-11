package Scripts.po.Iteration4;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWithoutDriverInTest {
	
	STCTourismHomePage loginPage;
	String expectedTitle= "My account";
	MyAccountPage myAccountPO;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		loginPage = new STCTourismHomePage();
		//myAccountPO = new MyAccountPage(loginPage.getDriver());		
	}
		
	@Test
	public void signOutTest() throws InterruptedException {
		myAccountPO = loginPage.successfullLogin("stc123", "12345");		
		assertEquals(loginPage.getTitleAfterLogin(), expectedTitle);
		//myAccountPO.signOut();
		Thread.sleep(3000);
	}
	
	
	//@Test
	/*
	 * public void signOutTestWithChaining() throws InterruptedException {
	 * loginPage.successfullLogin("stc123", "12345") .signOut() .login("stc123",
	 * "12345"); Thread.sleep(3000); }
	 */
	
	@Test
	public void unSuccessfullLoginWithChaining() throws InterruptedException {	
		loginPage.unSuccessfullLogin("stc123", "21232112345")
		.successfullLogin("stc123", "12345");		
		Thread.sleep(3000);
	}

	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
