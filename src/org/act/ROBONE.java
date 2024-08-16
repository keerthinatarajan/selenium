package org.act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ROBONE {
	public static void main(String[] args)throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Actions a=new Actions(driver);
		   driver.get("https://www.facebook.com/");
		   WebElement email=driver.findElement(By.id("email"));
		   email.sendKeys("keerthinatarajan");
		   Robot r=new Robot();
		  for (int i = 0; i < 6; i++) {
			  r.keyPress(KeyEvent.VK_DOWN);
			  r.keyRelease(KeyEvent.VK_DOWN);
		      r.keyPress(KeyEvent.VK_ENTER);
		      r.keyRelease(KeyEvent.VK_ENTER);
		     WebElement password= driver.findElement(By.name("pass"));
		     a.contextClick(password).perform();
		     for (int j = 0; j < 4; j++) {
		    	 r.keyPress(KeyEvent.VK_DOWN);
		    	 r.keyPress(KeyEvent.VK_DOWN);
		    	 r.keyPress(KeyEvent.VK_ENTER);
		    	 r.keyRelease(KeyEvent.VK_ENTER);
				
			}
			
		}
	}

}
