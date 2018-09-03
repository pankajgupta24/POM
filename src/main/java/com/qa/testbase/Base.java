package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public Base()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\paku0817\\workspace\\POM\\src\\main\\java\\com\\qa\\config\\config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paku0817\\Desktop\\AT\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(come.qa.utills.TestUtils.page_load, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(come.qa.utills.TestUtils.Implicit, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}	
	}


