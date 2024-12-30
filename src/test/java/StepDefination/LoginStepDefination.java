package StepDefination;

import io.cucumber.java.en.Given;
import utils.DriverManager;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

import org.openqa.selenium.WebDriver;


import PageObjects.LoginPage;



public class LoginStepDefination {
  
	WebDriver driver = DriverManager.DriverManager();
	LoginPage login = new LoginPage();
	
	
	@Given("User is on Login screen")
  public void getLoginScreen(){
	
	  driver.get("https://www.saucedemo.com/");
	  
  }

	@When("User enters {string} and {string}")
	public void sendCredentials(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
	}


  @And("User clicks on Login button")
  public void clickLogin() {
	  
	  login.clickLogin();
  }

  
  @Then("User lands on home screen")
  public void lands_homescreen() {

	  
	  login.verifyLoginSuccess();
	  
  }
  
  

}