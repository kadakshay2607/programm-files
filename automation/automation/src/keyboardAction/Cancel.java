package keyboardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cancel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_P);
		rt.keyRelease(KeyEvent.VK_P);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
