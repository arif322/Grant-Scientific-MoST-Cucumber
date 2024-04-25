package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage login;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   login = new LoginPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
		driver.get(URL);
	   
	}

	@When("user click the Login button")
	public void user_click_the_login_button() throws InterruptedException {
		login.ClickLogin();
	    
	}

	@When("user enter the valid email as {string} and pssword as {string}")
	public void user_enter_the_valid_email_as_and_pssword_as(String email, String pass) throws InterruptedException {
	try {
			login.enterMail(email);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    login.enterPass(pass);
	    
	    login.clickRemember();
	}
	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
	    login.clickSubmit();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitlte) {
	   String ActutalTitle = driver.getTitle();
	   
	   if (ActutalTitle.equals(expectedTitlte)) {
		Assert.assertTrue(true); //pass 
	}
	   else {
		Assert.assertTrue(false);// fail
	}
	}

}
