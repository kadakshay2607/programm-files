package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/login");
		driver.manage().window().maximize();
         driver.findElement(By.name("inputEmail")).sendKeys("Admin@gmail.com");
         Thread.sleep(3000);
         driver.findElement(By.name("inputPassword")).sendKeys("admin123");
         Thread.sleep(3000);
         driver.findElement(By.id("submitLogin")).click();
         Thread.sleep(3000);
         driver.close();

	}

}
