package com.BinaryBeast.TYSS.Leadstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.BinaryBeast.TYSS.GenericLib.ExcelUtility;
import com.BinaryBeast.TYSS.GenericLib.FileUtility;
import com.BinaryBeast.TYSS.GenericLib.JavaUtility;
import com.BinaryBeast.TYSS.GenericLib.WebDriverUtility;
import com.BinaryBeast.TYSS.POMrepositoryLib.LoginPage;

public class NavigateToLeadPageTest {
	@Test
	public void NavigateToLeadPage() throws Throwable {
		/* generic utility objects are created */
		JavaUtility jLib = new JavaUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		/* to read common data */
		String URL = fLib.getPropertyKeyValue("url");
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		
		/* Step:1 navigate to application */
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
		driver.get(URL);
		System.out.println("login page displayed");
		
		/* Step:2 login to application */
		LoginPage login = new LoginPage(driver);
		login.LoginToApp(USERNAME, PASSWORD);
		System.out.println("home page displayed");
	}

}
