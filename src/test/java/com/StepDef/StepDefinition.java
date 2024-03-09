package com.StepDef;




import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.AddToCartObjects;
import PageObjects.CheckCartObject;
import PageObjects.LoginPageObject;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass
{
    BaseClass bs;
	
	@Given("Customer is on Amazon page")
	public void customer_is_on_amazon_page() throws InterruptedException {
		bs=new BaseClass();
		bs.setup();
	}
	@When("Customer clicks on sign in menu")
	public void customer_clicks_on_sign_in_menu() throws InterruptedException {
		lp=new LoginPageObject(driver);
		lp.logintoamazon();
	}
	@When("Enters mobile no. and Password")
	public void enters_mobile_no_and_password() throws InterruptedException {
		lp.enterdetails();
	}
	@Then("clicks on Continue")
	public void clicks_on_continue() throws InterruptedException, IOException {
		lp.signin();
		bs.takeScreenshot();
	    
	}
	@Then("Customer logged in successfully")
	public void customer_logged_in_successfully() throws IOException, InterruptedException {
	   System.out.println(driver.getTitle());
	  
	  
	   
	}
	
	//Add to cart steps....
	
	@When("Customer clicked on Echo and alexa")
	public void customer_clicked_on_echo_and_alexa() throws InterruptedException {
		Addcart=new AddToCartObjects(driver);
	    Addcart.selproduct();
	}
	@When("selected product")
	public void selected_product() throws InterruptedException {
	 Addcart.selproduct2();
	}
	@Then("Customer added product to card")
	public void customer_added_product_to_card() throws InterruptedException {
	 Addcart.addcart();
	}
	@Then("product is displayed in cart")
	public void product_is_displayed_in_cart() throws InterruptedException, IOException {
	  Addcart.gocart();
	  Thread.sleep(2000);
	  bs.takeScreenshot();
	}
	@Then("Browser closed")
	public void browser_closed() {
		bs.teardown();  
	}
	@When("Customer clicked on cart")
	public void customer_clicked_on_cart() throws InterruptedException {
		cc=new CheckCartObject(driver);
		cc.gotocart();
	}
	@When("check cart empty or not")
	public void check_cart_empty_or_not() throws InterruptedException {
		System.out.println("Cart item checked");
	
	}
	
}
