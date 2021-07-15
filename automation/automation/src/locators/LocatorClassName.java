package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
         WebElement userNameTextBox =driver.findElement(By.name("username"));
         userNameTextBox.sendKeys("admin");
       WebElement passwordTestBox =driver.findElement(By.name("password"));
       passwordTestBox.sendKeys("admin@123");
         driver.findElement(By.className("                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    "));
	}

}
