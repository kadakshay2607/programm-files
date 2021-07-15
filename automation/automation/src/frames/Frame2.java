package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/akshay%20kad/Desktop/wcsm5%20html/username.html");//launch the web application
		Thread.sleep(3000);
	
		driver.findElement(By.id("un")).sendKeys("admin");
		WebElement target=driver.findElement(By.id("frid"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("pwd")).sendKeys("admin123");
		

	}

}
