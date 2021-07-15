package keyboardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CraftVilla {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@name='q'])[2]")).sendKeys("kurta",Keys.ENTER);
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.xpath("(//h1[@class='page-title' and @class='page-title']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(3000);
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("///input[@name='q'])[2]"));
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		

	}

}
