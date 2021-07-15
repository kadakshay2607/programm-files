package webBasedPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnRun' and value='Run >']")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(5000);
		al.sendKeys("50");
		Thread.sleep(5000);
		al.accept();

	}

}
