package org.act;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Fbdown {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
			WebDriver txt=new ChromeDriver();
			txt.get("https://demo.guru99.com/test/newtours/register.php");
			WebElement send1 = txt.findElement(By.name("country"));
			Select a=new Select(send1);
			List<WebElement> h = a.getOptions();
			for (int i = 0; i < h.size(); i++) {
				WebElement act = h.get(i);
				String text = act.getText();
				System.out.println(text);
				}
			txt.quit();
		}
	}



