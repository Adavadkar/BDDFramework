package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.DriverManager;

public class LoginPage{
	WebDriver driver = DriverManager.DriverManager();
	
	
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_Login = By.id("login-button");
	By lbl_logo = By.className("app_logo");
			
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		
		driver.findElement(btn_Login).click();
	}
	public void verifyLoginSuccess() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(lbl_logo));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	
	
}