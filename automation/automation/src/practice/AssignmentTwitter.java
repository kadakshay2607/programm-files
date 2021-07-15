package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en-gb");
		driver.manage().window().maximize();
         driver.findElement(By.name("session[username_or_email]")).sendKeys("Admin@123");
         Thread.sleep(3000);
         driver.findElement(By.name("session[password]")).sendKeys("admin123");
         Thread.sleep(3000);
         driver.findElement(By.className("css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0")).click();
         Thread.sleep(3000);
         driver.close();

	}

}
