package com.Ecommerce.Ebay.genericlibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
	public static void dropdown(WebElement ele,String text) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(text);	
		
	}
	
	public static void mouseHover(WebDriver browser,WebElement ele) {
		Actions a =new Actions(browser);
		a.moveToElement(ele).perform();
	}
				
	public static void doubleClick(WebDriver browser,WebElement ele) {
		
		Actions a =new Actions(browser);
		a.doubleClick(ele).perform();
		
	}
	
	public static void rightclick(WebDriver browser, WebElement ele) {
		Actions a =new Actions(browser);
		a.contextClick(ele).perform();
		
	}
	
	public static void dragdrop(WebDriver browser, WebElement source, WebElement target) {
		Actions a =new Actions(browser);
		a.dragAndDrop(source, target);
		
	}
	
	public static void scrollbar(WebDriver browser, int x, int y) {
		JavascriptExecutor J=(JavascriptExecutor)browser;
		J.executeScript("windows.scrollBy("+x+","+y+")");
		
	}
		
	public static void alertpopup(WebDriver browser) {
		Alert a=browser.switchTo().alert();
	
		
		}
	
	public static void childbrowserpopup(WebDriver browser, int index) throws AWTException {
		
	String parent=	browser.getWindowHandle();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	
	ArrayList<String> tabs = new ArrayList<String> (browser.getWindowHandles());
	browser.switchTo().window(tabs.get(index));
	
	}

	
	}

