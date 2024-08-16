package org.act;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver txt=new ChromeDriver();
		txt.get("https://www.facebook.com");
		WebElement send = txt.findElement(By.xpath("//a[text()='Create new account']"));
		send.click();
		Thread.sleep(3000);
		WebElement send1 = txt.findElement(By.xpath("//select[@title='Year']"));
		Select a=new Select(send1);
		List<WebElement> get = a.getOptions();
		for (int i = 0; i < get.size(); i++) {
			WebElement act = get.get(i);
			String text = act.getText();
			System.out.println(text);
			}
		txt.quit();
	}
	}


