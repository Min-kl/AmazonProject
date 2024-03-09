package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	public WebDriver ldriver;
	
	public LoginPageObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		
		
	}
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement login;
	
	@FindBy(className="nav-action-inner")
	WebElement login2;
	
	@FindBy(name="email")
	WebElement mobile_no;
	
	@FindBy(id="continue")
	WebElement contn;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	public void logintoamazon() throws InterruptedException {
		
		Actions act=new Actions(ldriver);
		act.moveToElement(login).perform();
		//Thread.sleep(2000);
		login2.click();
		//Thread.sleep(2000);
	}
	
	public void enterdetails() throws InterruptedException {
		mobile_no.sendKeys("9284033594");
		//Thread.sleep(2000);
		contn.click();
		//Thread.sleep(2000);
		pass.sendKeys("Ashwini@123");
		
		//Thread.sleep(2000);
	
	}
	public void signin() throws InterruptedException {
		signin.click();
		//Thread.sleep(2000);
	}
	
	
}
