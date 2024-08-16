package org.act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Actions a=new Actions(driver);
		   driver.get("https://www.google.com/");
		   WebElement search=driver.findElement(By.id("APjFqb"));
		   search.sendKeys("Inmakes Infotect");
		   Thread.sleep(3000);;
		   Robot r=new Robot();
		   WebElement keys=driver.findElement(By.xpath("//span[text()='Inmakes Infotech Pvt. Ltd.']"));
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		   a.doubleClick(keys).perform();
		
	}

}
