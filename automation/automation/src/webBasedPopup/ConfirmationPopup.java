package webBasedPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/confirmationpopup.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();

	}

}
