package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver idriver;
	
	public LoginPage(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements( rdriver, this);
	}
	
	@FindBy(xpath = "//a[@href='/en/auth/login']")
	WebElement loginbutton;
	@FindBy (id = "loginForm_username")
	WebElement UserName;
	@FindBy(id = "loginForm_password")
	WebElement UserPass;
	@FindBy(id = "loginForm_remember")
	WebElement checkbox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	public void ClickLogin() throws InterruptedException {
		Thread.sleep(2000);
		loginbutton.click();
	}
	
	public void enterMail(String email) throws InterruptedException {
		Thread.sleep(2000);
		UserName.click();
		UserName.clear();
		UserName.sendKeys(email);
		Thread.sleep(2000);
	}
	
	public void enterPass(String Pass) throws InterruptedException {
		UserPass.click();
		UserPass.clear();
		UserPass.sendKeys(Pass);
		Thread.sleep(2000);
	}
	
	public void clickRemember() throws InterruptedException {
		checkbox.click();
		Thread.sleep(2000);
	}
	
	public void clickSubmit() throws InterruptedException {
		submit.click();
		Thread.sleep(2000);
	}

}
