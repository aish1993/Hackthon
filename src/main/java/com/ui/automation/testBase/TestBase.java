package com.ui.automation.testBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
public static WebDriver driver;
		
public static Properties prop;
public TestBase(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	 public static void readProperty() throws IOException{
		 try{
		  prop=new Properties();
		 FileInputStream fis =new FileInputStream("./Config/config.properties");
		 prop.load(fis);
		 }
		 catch(Exception e)
		 {e.printStackTrace();
		 }
	 }
public static void initialisation()throws Exception
	 {
	String br = prop.getProperty("browser");
		 if(br.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			 driver=new ChromeDriver();
		 }else if(br.equals("firefox")){System.setProperty("webdriver.gecko.driver","");
		 driver=new FirefoxDriver();}
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("URL"));
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	 }}
