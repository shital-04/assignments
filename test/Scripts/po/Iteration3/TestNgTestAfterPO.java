package Scripts.po.Iteration3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgTestAfterPO {
	
	STCTourismHomePage loginPage;
	
	@BeforeClass
	  public void beforeClass() {
		loginPage = new STCTourismHomePage();
	}
		
	@Test
	  public void LogintoSTCTourism() throws InterruptedException {
		loginPage.Login("stc123", "12345");   		  
	}
	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
