package keyboardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectButton {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(7000);
		WebElement target = driver.findElement(By.xpath("//a[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		Thread.sleep(5000);
		Robot rt = new Robot();
		for(int i=0;i<6;i++)
		{
			Thread.sleep(2000);
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			
		}
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
