package com.testchoucair.com;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegistroValido {

	private WebDriver driver;
	
	By login = By.linkText("Sign in");
	By username = By.id("email_create");
	By create = By.id("SubmitCreate");
	By Gen = By.id("id_gender1");
	By firstN = By.id("customer_firstname");
	By lastN = By.id("customer_lastname");
	By pass = By.id("passwd");
	By  fname= By.id("firstname");
	By  lname= By.id("lastname");
	By  company= By.id("company");
	By  address1= By.id("address1");
	By  address2= By.id("address2");
	By  city= By.id("city");
	By  postcode= By.id("postcode");
	By  other= By.id("other");
	By  phone= By.id("phone");
	By  movil= By.id("phone_mobile");
	By  alias= By.id("alias");
	By account = By.id("submitAccount");


	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	
	}
	

	@Test
	public void testGooglePage() throws Exception {
		
		//Clic en "Sign in"
		driver.findElement(login).click();  

		
		//Se digita correo y clic en "Create an account"
		driver.findElement(username).sendKeys("correo@registro.com");
		driver.findElement(create).click();  
		Thread.sleep(3000);
		
		//se valida existencia de elemento en el formulario de registro y se diligencia
		if (driver.findElement(firstN).isDisplayed()) {
			
			Select day = new Select (driver.findElement(By.id("days")));
			Select month = new Select (driver.findElement(By.id("months")));
			Select year = new Select (driver.findElement(By.id("years")));
			Select state = new Select (driver.findElement(By.id("id_state")));
			Select country = new Select (driver.findElement(By.id("id_country")));



			
			driver.findElement(Gen).click(); 
			driver.findElement(firstN).sendKeys("prueba");
			driver.findElement(lastN).sendKeys("registro");
			driver.findElement(pass).sendKeys("clave123*");
			day.selectByVisibleText("19  ");
			month.selectByVisibleText("October ");
			year.selectByVisibleText("1993  ");
			driver.findElement(fname).sendKeys("prueba");
			driver.findElement(lname).sendKeys("registro");
			driver.findElement(company).sendKeys("Compañia");
			driver.findElement(address1).sendKeys("Cra 129 B # 139 - 12");
			driver.findElement(address2).sendKeys("Cra falsa 123");
			driver.findElement(city).sendKeys("New York");
			state.selectByVisibleText("Indiana");
			driver.findElement(postcode).sendKeys("87866");
			country.selectByVisibleText("United States");
			driver.findElement(other).sendKeys("descripción");
			driver.findElement(phone).sendKeys("5649872");
			driver.findElement(movil).sendKeys("3118972655");
			driver.findElement(alias).sendKeys("pruebaregistro");
			
			//Clic en "Register"
			driver.findElement(account).click();  



			 


			
		}
		
		
		
		
	}
		
		

}
	

