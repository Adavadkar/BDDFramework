package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverManager;

public class YourCartPage extends ProductsPage{
	
WebDriver driver = DriverManager.DriverManager();
	
	By ConitueShopping_btn = By.id("//div[@class = 'cart_footer']//button[@id = 'continue-shopping']");
	
	
	public void verifyConitnueShoppingClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ConitueShopping_btn)).click();
	}

}
