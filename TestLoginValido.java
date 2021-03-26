package com.testchoucair.com;








import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginValido {

	private WebDriver driver;
	
	By login = By.linkText("Sign in");
	By username = By.id("email");
	By pass = By.id("passwd");
	By Button = By.id("SubmitLogin");

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	
	}
	

	@Test
	public void testlogin() throws InterruptedException {
		
		driver.findElement(login).click();  
		Thread.sleep(3000);
		

		if (driver.findElement(username).isDisplayed()) {


			driver.findElement(username).sendKeys("jeguerra7711@gmail.com");
			driver.findElement(pass).sendKeys("Chelsea7711*");
			driver.findElement(Button).click();  

		assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account", driver.getCurrentUrl());
		  
		
	}
		
	}
		
		

}
	

