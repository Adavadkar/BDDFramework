package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class VerifyYourCartPage {
	
	WebDriver driver = DriverManager.DriverManager();
	YourCartPage page = new YourCartPage();
	
	@When ("user clicks Continue Shopping button on Your cart screen")
	public void continueShoppingClick()
	{
		page.verifyConitnueShoppingClick();
	}
	
	@Then ("user is redirected back to Products page")
	public void redirectedBackToProductsPage() {
		page.landsProductPage();
	}
	

}
