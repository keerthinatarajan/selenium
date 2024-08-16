package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;


public class Selenium {
	public static  void main(String[] args) {
		
		//step 1: browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
		//step 2: browser configuration
		WebDriver b=new ChromeDriver(); 
		b.get("https://www.flipkart.com/");
		b.manage().window().maximize();
		WebDriver u=new ChromeDriver();
		u.get("https://mail.google.com/mail/u/0/#inbox");	
		u.manage().window().maximize();
		u.close();
		
	
	}

}
