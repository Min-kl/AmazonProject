package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckCartObject {
	
public WebDriver ldriver;
	
	public CheckCartObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-cart-text-container\"]")
	WebElement cart;
	
	

	public void gotocart() throws InterruptedException {
		cart.click();
		//Thread.sleep(2000);
	}
	
	
}
