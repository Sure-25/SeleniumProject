package org.test.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Webpages {

	public void chromeLan() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\Chrome\\Driver\\chromedriver.exe");
		WebDriver ws = new ChromeDriver();
		
		ws.get("https://www.amazon.in");
		
		String tit = ws.getTitle();
		System.out.println("Title:"+tit);
		
		String curl = ws.getCurrentUrl();
		System.out.println("Current URL:"+curl);
		
	}
	public static void main(String[] args) {
		 Webpages wb = new Webpages();
		 wb.chromeLan();
	}
}
