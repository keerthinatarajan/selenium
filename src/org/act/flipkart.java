package org.act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Actions a=new Actions(driver);
		   driver.get("https://affiliate.flipkart.com/login");
		   WebElement search=driver.findElement(By.id("inputEmail"));
		   search.sendKeys("keerthi");
		   Robot r=new Robot();
		   for (int i = 0; i < 4; i++) {
			   r.keyPress(KeyEvent.VK_DOWN);
			   r.keyRelease(KeyEvent.VK_DOWN);
			   r.keyPress(KeyEvent.VK_ENTER);
			   r.keyRelease(KeyEvent.VK_ENTER);
		  WebElement src=driver.findElement(By.name("inputPassword"));
		  Thread.sleep(3000);
		 for (int j = 0; j < 6; j++) {
			 r.keyPress(KeyEvent.VK_DOWN);
			   r.keyRelease(KeyEvent.VK_DOWN);
			   r.keyPress(KeyEvent.VK_ENTER);
			   r.keyRelease(KeyEvent.VK_ENTER);
			 
			
		}
			
		}
		   
	
	
	}

}
