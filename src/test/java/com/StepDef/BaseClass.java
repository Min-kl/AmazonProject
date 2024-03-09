package com.StepDef;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import PageObjects.AddToCartObjects;
import PageObjects.CheckCartObject;
import PageObjects.LoginPageObject;

public class BaseClass {

	static WebDriver driver;
	AddToCartObjects Addcart;
	LoginPageObject lp;
	CheckCartObject cc;
	


	public void setup() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void takeScreenshot() throws IOException, InterruptedException {
		String timeStamp = new SimpleDateFormat("yyyy__MM_dd_HH_mm_ss").format(new Date());
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.getProperty("user.dir") : providing path of mvn project
		String screenShotPath = System.getProperty("user.dir") +"\\src\\test\\resources\\Screenshots\\"+timeStamp+".png";
	   File destFile = new File(screenShotPath);
	   FileHandler.copy(scrFile, destFile);
		 }
	
	public void teardown() {
		driver.quit();
	}
	
}
