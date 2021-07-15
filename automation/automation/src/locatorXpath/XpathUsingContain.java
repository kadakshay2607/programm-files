package locatorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
       driver.findElement(By.name("username")).sendKeys("aks123");
       Thread.sleep(2000);
       driver.findElement(By.name("password")).sendKeys("akgjg123");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[contains(@class,'DhRcB')][1]")).click();

	}

}
