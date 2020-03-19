package com.ui.automation.testBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class TestBase {
public static WebDriver driver;
		
public static Properties prop;
	 public static void readProperty() throws IOException{
		  prop=new Properties();
		 FileInputStream fis =new FileInputStream("config.properties");
		 prop.load(fis);
	 }
public static void initilisation()
	 {
		 String browsername=prop.getProperty("browser");
		 if(browsername.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:/Drivers.chromedriver.exe");
			 driver=new ChromeDriver();
		 }else if(browsername.equals("firefox")){System.setProperty("webdriver.gecko.driver","");}
		 driver=new FirefoxDriver();
	 driver.get(prop.getProperty("URL"));

	 }}
