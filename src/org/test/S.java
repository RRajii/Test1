package org.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class S {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\RajiiTest\\A\\Lib\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		 String USERNAME = "rajasoundramanir1";
		 String AUTOMATE_KEY = "J8ALevcAgszyWyiGp9sx";
	 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "iPhone");
	    caps.setCapability("device", "iPhone 8 Plus");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.facebook.com/");
		WebElement txt1 = driver.findElement(By.id("email"));
		txt1.sendKeys("raji1233@gmail.com");
	WebElement txt2 = driver.findElement(By.id("pass"));
	txt2.sendKeys("Password");
	

}
}