package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToCartObjects {

	public WebDriver ldriver;
	
	
	public AddToCartObjects(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By selectAll=By.xpath("//*[@id=\"nav-hamburger-menu\"]/i");
	By selectEcAl=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div");
	By selectprod=By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a");
	
	By addtocart=By.id("add-to-cart-button");
	By buttonsel=By.xpath("//*[@id=\"abb-intl-pop-cta\"]/span[3]/span/input");
	By gotocart=By.className("a-button-text");
	
	
	public void selproduct() throws InterruptedException {
		ldriver.findElement(selectAll).click();
		Thread.sleep(2000);
		ldriver.findElement(selectEcAl).click();
		//Thread.sleep(2000);
		
	}
	

	public void selproduct2() throws InterruptedException {
		ldriver.findElement(selectprod).click();
		//Thread.sleep(2000);
	}
	
	public void addcart() throws InterruptedException {
		ldriver.findElement(addtocart).click();
		//Thread.sleep(2000);
		ldriver.findElement(buttonsel).click();
		//Thread.sleep(2000);
	}
	
	public void gocart() throws InterruptedException {
		ldriver.findElement(gotocart).click();
		//Thread.sleep(2000);
	}
}
