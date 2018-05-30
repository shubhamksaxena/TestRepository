package com.resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
public WebDriver driver;
	public WebDriver initializeBrowser() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\shubhams\\E2EProject\\src\\main\\java\\com\\resource\\data.properties");
		prop.load(fis);
	String browsername=	prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium 3\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	else if(browsername.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium 3\\Drivers\\Gecko\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	
	else if(browsername.equalsIgnoreCase("InternetExplore"))
	{
		System.setProperty("webdriver.ie.driver","D:\\Selenium 3\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
}
