package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://inmakeslh.in/");
		   //JavascriptExecutor js=(JavascriptExecutor)driver;
		  // WebElement txt=driver.findElement(By.xpath("//span[contains(text(),'SkillUp']"));
		   
	   
	   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   WebElement txt=driver.findElement(By.xpath("//span[contains(text(),'SkillUp']"));)
	}
}
