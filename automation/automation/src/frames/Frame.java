package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.bluestone.com/jewellery/rings.html");//launch the web application
		Thread.sleep(3000);
		driver.switchTo().frame("chat-widget");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[@class='lc-mmsuz6 e1dmt1bi0']")).click();
		driver.findElement(By.id("name")).sendKeys("aks");
        driver.findElement(By.id("email")).sendKeys("aks@gmail.com");
        driver.findElement(By.xpath("//span[.='Leave a message']")).click();

	}

}
