package listeners;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.events.WebDriverListener;

import com.google.common.io.Files;

public class MyListener_new implements WebDriverListener {

	/*
	 * @Override public void afterSendKeys​(WebElement element, Object[] text) { //
	 * TODO Auto-generated method stub
	 * System.out.println("Inside afterChangeValueOf"); //
	 * element.sendKeys("ketan"); }
	 */

	
	@Override
	public void afterClick(WebElement element) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterClickOn");
		System.out.println(element.getText());
		//log.trace("Element was clicked");
		// Write to HTML with green color, and a message on which element click happend

	}

	@Override
	public void afterFindElement(WebElement element, By by, WebElement element1) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterFindBy");
		System.out.println(element1.getText());
		//log.trace("The element is - " + element1.getText());

	}

	@Override
	public void afterBack(WebDriver.Navigation nav) {
		// System.out.println(driver.getCurrentUrl());
		System.out.println("Inside AfterBack");
		// TODO Auto-generated method stub

	}

	@Override
	public void afterForward(WebDriver.Navigation nav) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateForward");

	}

	@Override
	public void afterTo(WebDriver.Navigation nav, String url) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateTo - " + url);
	}

	@Override
	public void afterTo(WebDriver.Navigation nav, java.net.URL url) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateTo - " + url);
	}

	@Override
	public void beforeBack(WebDriver.Navigation nav) {
		System.out.println("Inside before Back");
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeForward(WebDriver.Navigation nav) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateForward");
	}

	@Override
	public void beforeTo(WebDriver.Navigation nav, String url) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateTo - " + url);
	}

	/*
	 * @Override public void onError(java.lang.Object target,
	 * java.lang.reflect.Method method, java.lang.Object[] args,
	 * java.lang.reflect.InvocationTargetException e) { try { File scrFile =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//BASE64,BYTE
	 * //String filePath = "C:\temp" + DateTime ; Files.copy(scrFile, new
	 * File("target/screenshots/error.png")); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
}
