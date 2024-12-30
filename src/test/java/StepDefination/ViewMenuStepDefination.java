package StepDefination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.LoginPage;
import PageObjects.MenuOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class ViewMenuStepDefination {
	MenuOptions menu = new MenuOptions();
	LoginPage login = new LoginPage();
	
	@Given("User is on Home screen")
	public void userIsOnHomeScreen()
	{
		login.verifyLoginSuccess();
		
	}
	
	@When("User clicks on Menu icon")
	public void clickMenuicon() {
		menu.click_MenuIcon();
	}
	
	
	@Then("Menu options should get displayed")
	public void viewMenuOptions() {
	    menu.validate_menuOptions();
	}

	
}
