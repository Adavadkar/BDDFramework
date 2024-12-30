package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObjects.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class ProductsPageVerify {
	
	WebDriver driver = DriverManager.DriverManager();
	ProductsPage page = new ProductsPage();
	
	@Given ("User accesses saucedemo website")
	public void verifyWebsiteAccess() {
		page.goToLoginScreen();
	}
	
	@When ("User enters credentials and Logs In")
	public void enterCredentials() {
		
		page.verifyEnterCredentials();
		
	}
	
	@Then ("User lands on products page of the website")
	public void userOnProductsPage() {
		page.landsProductPage();
	}
	
	@And ("user scrolls and views bottom of the page")
	public void scrollProductsPageBottom() {
		page.scrollBottom();
}
	@And ("user scrolls and views top of the page")
	public void scrollProductsPageTop()
	{
		page.scrollTop();
	}
	
	@When ("user clicks on shopping cart icon")
	public void clickShoppingIcon() {
		page.verifyShoppingCartclick();
	}
	
	@Then ("user is redirected to Your Cart screen")
	public void landsYourCartScreen()
	{
		page.verifylandsYourCartScreen();
	}
	
	
	
	
	
	@When ("user clicks on any product on Products Page")
	public void clickProduct() {
		page.verifyProductClick();
	}
	
	@Then ("user should be redirected to product detail screen")
	public void landsProductDetailScreen() {
		
	}
	
}
