package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/dovbleclick.html");
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//button[.='Double-click here']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

	}

}
