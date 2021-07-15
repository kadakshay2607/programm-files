package locatorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//a[contains(.,'STATISTICS')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(.,'2019') or contains(.,'Mech')]")).click();
       driver.close();

	}

}
