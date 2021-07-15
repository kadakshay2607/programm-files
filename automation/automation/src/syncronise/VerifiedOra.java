package syncronise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifiedOra {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		WebDriverWait wait=new WebDriverWait(driver, 30);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		wait.until(ExpectedConditions.titleContains("orange"));
		 System.out.println("passed");

	}

}
