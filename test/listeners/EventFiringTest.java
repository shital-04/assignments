package listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;


public class EventFiringTest {
    private WebDriver original_driver, driver;//This WebDriver does not fire the events
   
    MyListener myListener;
    @BeforeMethod
	public void setUp() throws Exception {
        original_driver = new FirefoxDriver(); //This does not fire events 
        myListener = new MyListener();
        driver = new EventFiringDecorator(myListener).decorate(original_driver);
    }

    @Test
    public void testEventFiringWebDriver() throws Exception {
    	//beforeTo()
    	driver.navigate().to("http://www.google.com");
    	/*AfterTo()
    	beforeTo()*/
    	driver.navigate().to("http://www.nichethyself.com");
    	/*AfterTo()
    	beforeTo()*/
    	driver.navigate().to("http://www.outlook.com");
/*    	AfterTo()
    	
    	BeforeBack()
*/    	
    	driver.navigate().back();
//    	AfterBack()
    }

    @AfterMethod
	public void tearDown() throws Exception {
        driver.quit();
    }
}
