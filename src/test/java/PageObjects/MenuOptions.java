package PageObjects;

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

import utils.DriverManager;

public class MenuOptions {
	
	WebDriver driver = DriverManager.DriverManager();
	By menu_icon = By.id("react-burger-menu-btn");
	By menuList = By.xpath("//div[@class='bm-menu']");
	By text_menuOptions = By.xpath("//div[@class='bm-menu']//a");
	
	public void click_MenuIcon() {
		driver.findElement(menu_icon).click();
		
	}
	
	public void validate_menuOptions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(text_menuOptions));
		List<WebElement> available_Options = driver.findElements(text_menuOptions);
		List<String> actualOptions = new ArrayList<String>();
		for (WebElement value : available_Options)
		{
			actualOptions.add(value.getText());
		}
		
		List<String> ExpectedOptionsList = Arrays.asList("All Items", "About", "Logout", "Reset App State");
		Assert.assertEquals(actualOptions, ExpectedOptionsList, "Menu options do not match");
		
	}

}
