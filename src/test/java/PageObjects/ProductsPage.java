package PageObjects;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefination.LoginStepDefination;
import junit.framework.Assert;
import utils.DriverManager;

public class ProductsPage {
	WebDriver driver = DriverManager.DriverManager();
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_Login = By.id("login-button");
	By lbl_logo = By.className("app_logo");
	By icon_twitter = By.xpath("//li[@class = 'social_twitter']//a");
	By productsPageLogo = By.xpath("//span[@class = 'title' ]");
	By shoppingCartIcon = By.xpath("//div[@id = 'shopping_cart_container']//a");
	By YourCart_text = By.xpath("//div[@class = 'header_secondary_container']//span");
	
	By backPack_product = By.xpath("//div[conatins(text(),'Sauce Labs Backpack')]");
	By backPack_product_detail_text = By.xpath("//div[conatins(text(),'Sauce Labs Backpack')]");
	WebElement products_logo;
	
JavascriptExecutor js = (JavascriptExecutor) driver;

public void goToLoginScreen() {
	driver.get("https://www.saucedemo.com/");
}


public void verifyEnterCredentials() {
	driver.findElement(txt_username).sendKeys("standard_user");
	driver.findElement(txt_password).sendKeys("secret_sauce");
	driver.findElement(btn_Login).click();
	
}


public void landsProductPage() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	products_logo = driver.findElement(productsPageLogo);
	Assert.assertTrue(products_logo.isDisplayed());
	
}


public void scrollBottom() {
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	WebElement actual_bottom = driver.findElement(icon_twitter);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement expected_icon = wait.until(ExpectedConditions.visibilityOf(actual_bottom)) ;
	Assert.assertTrue(expected_icon.isDisplayed() );
}

public void scrollTop() {
	js.executeScript("window.scrollTo(0,0)");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(products_logo));
	Assert.assertTrue(products_logo.isDisplayed());
}


public void verifyShoppingCartclick() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(shoppingCartIcon));
	cartIcon.click();
	wait.until(ExpectedConditions.urlContains("cart"));
}
	
public void verifylandsYourCartScreen() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement yourCartPage_obj = wait.until(ExpectedConditions.visibilityOfElementLocated(YourCart_text));
	Assert.assertTrue("Not on 'Your Cart' page.", yourCartPage_obj.getText().equalsIgnoreCase("Your Cart"));
	
	
}
	


public void verifyProductClick() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(backPack_product)).click();
}

public void verifyredirectionProductDetailScreen() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(backPack_product_detail_text));
	
}

}
