package Scripts.po.Iteration2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgTestAfterPO {
	
	STCTourismHomePage loginPage;
	String expectedTitle= "My account";
	
	@BeforeClass
	  public void beforeClass() {
		loginPage = new STCTourismHomePage();
	}
		
	@Test
	  public void LogintoSTCTourism() throws InterruptedException {
		loginPage.Login("stc123", "12345");   
		assertEquals(loginPage.getTitleAfterLogin(), expectedTitle);
	}
	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
