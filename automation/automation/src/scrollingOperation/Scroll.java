package scrollingOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(8000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");
        Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-4500)");
        Thread.sleep(3000);
		js.executeScript("window.scrollBy(10,0)");
        Thread.sleep(3000);
		js.executeScript("window.scrollBy(-10,0)");


	}

}
