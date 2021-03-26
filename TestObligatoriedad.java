package com.testchoucair.com;



import static org.junit.Assert.assertEquals;




import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestObligatoriedad {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	}
	

	@Test
	public void testGooglePage() {
		
		WebElement username = driver.findElement(By.name("email_create"));
		WebElement create = driver.findElement(By.name("SubmitCreate"));
		username.sendKeys("formatovalido@gmail.com");
		create.click();  
		assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account", driver.getCurrentUrl());
		  
		
	}
		
		

}
	

