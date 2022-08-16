package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;

//For Base Class there is no main method 
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void getPage() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void datafill(WebElement element, String userText) {
		element.sendKeys(userText);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toGetText() {
		String text = element.getText();
		System.out.println(text);
	}

	public static void toGetAttribute() {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void toMoveToElelment() {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toPerformDragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest);

	}

	public static void mouseDoubleClick() {
		a.doubleClick().perform();
	}

	public static void mouseRightClick() {
		a.contextClick(element).perform();
	}

	public static void toPerformDoubleClick() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPerformTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toCopyPaste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	private void jScriptPageUp() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	private void jScriptPageDown() {
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	private void jScriptDataFilling() {
		js.executeScript("arguments[0].setAttribute('value', 'userCredentials'", element);
	}

	private void jScriptClick() {
		js.executeScript("arguments[0].click()", element);
	}

	private void jScriptGetText() {
		js.executeScript("arguments[0].getAttribute('value')", element);
	}

	private void toTakeScreenShot() throws IOException {
		TakesScreenshot shot = ((TakesScreenshot) driver); // Downcasting Screenshot method
		File source = shot.getScreenshotAs(OutputType.FILE); // to take screen shot and convert into file type to save
																// in temp folder
		File destFile = new File("C:\\Users\\ELCOT\\Desktop\\Vijayan Java\\2.Selenium"); // to create a destination
																							// folder to save file
		FileUtils.copyFile(source, destFile);

	}

}
