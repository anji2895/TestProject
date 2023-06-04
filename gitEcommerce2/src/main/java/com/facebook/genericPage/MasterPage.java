package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	public static WebDriver driver;
	public Properties lprop;
	public Properties tprop;
	public Logger logger;

	// constructor implementation
	public MasterPage() throws Exception {
		String browser = "chrome";

		// locators Properties file implementation
		FileInputStream lp = new FileInputStream(".\\src\\main\\java\\com\\facebook\\repository\\locators.properties");
		lprop = new Properties();
		lprop.load(lp);

		// testdata Properties file implementation
		FileInputStream tp = new FileInputStream(".\\src\\main\\java\\com\\facebook\\repository\\testdata.properties");
		tprop = new Properties();
		tprop.load(tp);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser specified.");
			return;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger =LogManager.getLogger(MasterPage.class);
		PropertyConfigurator.configure("D:\\Eclipse workspace\\Framework\\log4j.properties");
		driver.get(tprop.getProperty("url"));
		logger.info("url opened");
		
	}

}
