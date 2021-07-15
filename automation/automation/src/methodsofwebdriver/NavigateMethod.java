package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("pune",Keys.ENTER);
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(3000);
             driver.close();
	}

}
