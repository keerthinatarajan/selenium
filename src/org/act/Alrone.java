package org.act;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alrone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.automationtesting.in/Alerts.html");
		   WebElement path = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel'] "));
		   path.click();		  
		   WebElement path1=driver.findElement(By.xpath("//button[contains(text(),'button to display a confirm box')] "));
		   path1.click();
     	   Alert a1=driver.switchTo().alert();	
		   a1.accept();
		   }
	

}