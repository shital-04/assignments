package Scripts.po.Iteration4;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWithDriverInTest {
	
	STCTourismHomePage loginPage;
	String expectedTitle= "My account";
	MyAccountPage myAccountPO;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		loginPage = new STCTourismHomePage();
		//myAccountPO = new MyAccountPage(loginPage.getDriver());		
	}
		
	@Test
	  public void LogintoSTCTourism() throws InterruptedException {
		loginPage.Login("stc123", "12345");   
		myAccountPO = new MyAccountPage(loginPage.getDriver());
		assertEquals(loginPage.getTitleAfterLogin(), expectedTitle);
		myAccountPO.SignOut();
		Thread.sleep(3000);
	}
	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
